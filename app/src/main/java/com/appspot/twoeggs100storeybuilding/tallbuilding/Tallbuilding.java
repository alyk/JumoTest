/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2016-01-08 17:48:37 UTC)
 * on 2016-01-19 at 15:06:21 UTC 
 * Modify at your own risk.
 */

package com.appspot.twoeggs100storeybuilding.tallbuilding;

/**
 * Service definition for Tallbuilding (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link TallbuildingRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Tallbuilding extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the tallbuilding library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://twoeggs100storeybuilding.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "tallbuilding/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Tallbuilding(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Tallbuilding(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the TallBuilding collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Tallbuilding tallbuilding = new Tallbuilding(...);}
   *   {@code Tallbuilding.TallBuilding.List request = tallbuilding.tallBuilding().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public TallBuilding tallBuilding() {
    return new TallBuilding();
  }

  /**
   * The "tallBuilding" collection of methods.
   */
  public class TallBuilding {

    /**
     * Create a request for the method "tallBuilding.checkEgg".
     *
     * This request holds the parameters needed by the tallbuilding server.  After setting any optional
     * parameters, call the {@link CheckEgg#execute()} method to invoke the remote operation.
     *
     * @param id
     * @param store
     * @return the request
     */
    public CheckEgg checkEgg(Long id, Integer store) throws java.io.IOException {
      CheckEgg result = new CheckEgg(id, store);
      initialize(result);
      return result;
    }

    public class CheckEgg extends TallbuildingRequest<com.appspot.twoeggs100storeybuilding.tallbuilding.model.FallResult> {

      private static final String REST_PATH = "checkEgg/{id}/{store}";

      /**
       * Create a request for the method "tallBuilding.checkEgg".
       *
       * This request holds the parameters needed by the the tallbuilding server.  After setting any
       * optional parameters, call the {@link CheckEgg#execute()} method to invoke the remote operation.
       * <p> {@link
       * CheckEgg#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @param store
       * @since 1.13
       */
      protected CheckEgg(Long id, Integer store) {
        super(Tallbuilding.this, "POST", REST_PATH, null, com.appspot.twoeggs100storeybuilding.tallbuilding.model.FallResult.class);
        this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
        this.store = com.google.api.client.util.Preconditions.checkNotNull(store, "Required parameter store must be specified.");
      }

      @Override
      public CheckEgg setAlt(String alt) {
        return (CheckEgg) super.setAlt(alt);
      }

      @Override
      public CheckEgg setFields(String fields) {
        return (CheckEgg) super.setFields(fields);
      }

      @Override
      public CheckEgg setKey(String key) {
        return (CheckEgg) super.setKey(key);
      }

      @Override
      public CheckEgg setOauthToken(String oauthToken) {
        return (CheckEgg) super.setOauthToken(oauthToken);
      }

      @Override
      public CheckEgg setPrettyPrint(Boolean prettyPrint) {
        return (CheckEgg) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public CheckEgg setQuotaUser(String quotaUser) {
        return (CheckEgg) super.setQuotaUser(quotaUser);
      }

      @Override
      public CheckEgg setUserIp(String userIp) {
        return (CheckEgg) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private Long id;

      /**

       */
      public Long getId() {
        return id;
      }

      public CheckEgg setId(Long id) {
        this.id = id;
        return this;
      }

      @com.google.api.client.util.Key
      private Integer store;

      /**

       */
      public Integer getStore() {
        return store;
      }

      public CheckEgg setStore(Integer store) {
        this.store = store;
        return this;
      }

      @Override
      public CheckEgg set(String parameterName, Object value) {
        return (CheckEgg) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "tallBuilding.dropEgg".
     *
     * This request holds the parameters needed by the tallbuilding server.  After setting any optional
     * parameters, call the {@link DropEgg#execute()} method to invoke the remote operation.
     *
     * @param id
     * @param store
     * @return the request
     */
    public DropEgg dropEgg(Long id, Integer store) throws java.io.IOException {
      DropEgg result = new DropEgg(id, store);
      initialize(result);
      return result;
    }

    public class DropEgg extends TallbuildingRequest<com.appspot.twoeggs100storeybuilding.tallbuilding.model.FallResult> {

      private static final String REST_PATH = "dropEgg/{id}/{store}";

      /**
       * Create a request for the method "tallBuilding.dropEgg".
       *
       * This request holds the parameters needed by the the tallbuilding server.  After setting any
       * optional parameters, call the {@link DropEgg#execute()} method to invoke the remote operation.
       * <p> {@link
       * DropEgg#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @param store
       * @since 1.13
       */
      protected DropEgg(Long id, Integer store) {
        super(Tallbuilding.this, "POST", REST_PATH, null, com.appspot.twoeggs100storeybuilding.tallbuilding.model.FallResult.class);
        this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
        this.store = com.google.api.client.util.Preconditions.checkNotNull(store, "Required parameter store must be specified.");
      }

      @Override
      public DropEgg setAlt(String alt) {
        return (DropEgg) super.setAlt(alt);
      }

      @Override
      public DropEgg setFields(String fields) {
        return (DropEgg) super.setFields(fields);
      }

      @Override
      public DropEgg setKey(String key) {
        return (DropEgg) super.setKey(key);
      }

      @Override
      public DropEgg setOauthToken(String oauthToken) {
        return (DropEgg) super.setOauthToken(oauthToken);
      }

      @Override
      public DropEgg setPrettyPrint(Boolean prettyPrint) {
        return (DropEgg) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public DropEgg setQuotaUser(String quotaUser) {
        return (DropEgg) super.setQuotaUser(quotaUser);
      }

      @Override
      public DropEgg setUserIp(String userIp) {
        return (DropEgg) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private Long id;

      /**

       */
      public Long getId() {
        return id;
      }

      public DropEgg setId(Long id) {
        this.id = id;
        return this;
      }

      @com.google.api.client.util.Key
      private Integer store;

      /**

       */
      public Integer getStore() {
        return store;
      }

      public DropEgg setStore(Integer store) {
        this.store = store;
        return this;
      }

      @Override
      public DropEgg set(String parameterName, Object value) {
        return (DropEgg) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "tallBuilding.takeEggs".
     *
     * This request holds the parameters needed by the tallbuilding server.  After setting any optional
     * parameters, call the {@link TakeEggs#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public TakeEggs takeEggs() throws java.io.IOException {
      TakeEggs result = new TakeEggs();
      initialize(result);
      return result;
    }

    public class TakeEggs extends TallbuildingRequest<com.appspot.twoeggs100storeybuilding.tallbuilding.model.EggsId> {

      private static final String REST_PATH = "takeEggs";

      /**
       * Create a request for the method "tallBuilding.takeEggs".
       *
       * This request holds the parameters needed by the the tallbuilding server.  After setting any
       * optional parameters, call the {@link TakeEggs#execute()} method to invoke the remote operation.
       * <p> {@link
       * TakeEggs#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected TakeEggs() {
        super(Tallbuilding.this, "POST", REST_PATH, null, com.appspot.twoeggs100storeybuilding.tallbuilding.model.EggsId.class);
      }

      @Override
      public TakeEggs setAlt(String alt) {
        return (TakeEggs) super.setAlt(alt);
      }

      @Override
      public TakeEggs setFields(String fields) {
        return (TakeEggs) super.setFields(fields);
      }

      @Override
      public TakeEggs setKey(String key) {
        return (TakeEggs) super.setKey(key);
      }

      @Override
      public TakeEggs setOauthToken(String oauthToken) {
        return (TakeEggs) super.setOauthToken(oauthToken);
      }

      @Override
      public TakeEggs setPrettyPrint(Boolean prettyPrint) {
        return (TakeEggs) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public TakeEggs setQuotaUser(String quotaUser) {
        return (TakeEggs) super.setQuotaUser(quotaUser);
      }

      @Override
      public TakeEggs setUserIp(String userIp) {
        return (TakeEggs) super.setUserIp(userIp);
      }

      @Override
      public TakeEggs set(String parameterName, Object value) {
        return (TakeEggs) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Tallbuilding}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Tallbuilding}. */
    @Override
    public Tallbuilding build() {
      return new Tallbuilding(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link TallbuildingRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setTallbuildingRequestInitializer(
        TallbuildingRequestInitializer tallbuildingRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(tallbuildingRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}