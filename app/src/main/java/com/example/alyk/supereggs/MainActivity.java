package com.example.alyk.supereggs;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import com.appspot.twoeggs100storeybuilding.tallbuilding.Tallbuilding;
import com.appspot.twoeggs100storeybuilding.tallbuilding.model.EggsId;
import com.appspot.twoeggs100storeybuilding.tallbuilding.model.FallResult;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InterruptedIOException;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    Tallbuilding backend = new Tallbuilding(AndroidHttp.newCompatibleTransport(),
            new AndroidJsonFactory(), null);

    private Button btnStartTest;
    private TextView tvLog;
    private EggsId eggsId;
    private static Thread thrd;
    private static boolean isRunning;


    private static class InstanceHolder {
        private static final Logger instance = new Logger();
    }

    public static class Logger {

        private static OnLogUpdateListener logger;
        private static StringBuilder list;

        public static Logger getInstance() {
            return InstanceHolder.instance;
        }

        public Logger() {
            list = new StringBuilder();
        }

        public static String getList() {
            return list.toString();
        }

        public interface OnLogUpdateListener {
            public abstract void onUpdate();
        }

        public static void setOnLogUpdateListener(OnLogUpdateListener listener) {
            logger = listener;
        }

        public static void log(String mess) {
            list.append(mess + "\n");
            logger.onUpdate();
        }


        public static void clear() {
            list.delete(0, list.length());
            if (logger != null)
                logger.onUpdate();

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartTest = (Button) findViewById(R.id.btnStart);
        tvLog = (TextView) findViewById(R.id.tvLog);

        Logger.getInstance();
        Logger.setOnLogUpdateListener(new Logger.OnLogUpdateListener() {
            @Override
            public void onUpdate() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        tvLog.setText(Logger.getList());
                        ((ScrollView) findViewById(R.id.scrollView)).fullScroll(View.FOCUS_DOWN);
                    }
                });
            }
        });
    }

    public void onTestStart(View view) {

        stopTest();

        thrd = new Thread(new Runnable() {
            @Override
            public void run() {

                isRunning = true;
                String err = null;

                try {
                    eggsId = backend.tallBuilding().takeEggs().execute();
                    if (thrd.isInterrupted())
                        return;
                    Long id = eggsId.getId();
                    Logger.log("strating test...");
                    Logger.log("------------------------------");
                    Logger.log("got new eggs, id:" + id.toString());
                    Logger.log("------------------------------");

                    int floor;
                    for (floor = 1; floor < 101; floor++) {
                        FallResult data = backend.tallBuilding().dropEgg(id, floor).execute();
                        if (thrd.isInterrupted())
                            return;
                        Logger.log("attempt: from floor #" + floor + " -> " + (data.getBroken() ? "oops...broken" : "safe"));
                        if (data.getBroken()) break;
                    }

                    FallResult data = backend.tallBuilding().checkEgg(id, floor - 1).execute();
                    if (thrd.isInterrupted())
                        return;
                    Logger.log("------------------------------");
                    Logger.log("verification: found floor #" + --floor);
                    Logger.log("is it true? chec_API sais: " + data.getBroken());
                    Logger.log("------------------------------");

                } catch (InterruptedIOException e1) {
                    //Logger.log("!!!");
                } catch (IOException e) {
                    Log.d(TAG, "Exception while requesting GettingEggs: " + e);
                    Logger.log("------------------------------");
                    Logger.log("" + e);
                    Logger.log("------------------------------");
                    Logger.log("SERVER ERROR - try again! :( ");
                }
            }
        });
        thrd.start();

    }

    private void stopTest() {
        if (thrd != null) {
            thrd.interrupt();

            try {
                thrd.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Logger.clear();
        }
    }

    @Override
    public void onBackPressed() {
        stopTest();
        super.onBackPressed();
    }


}
