/*
 * OneSignal
 * A powerful way to send personalized messages at scale and build effective customer engagement strategies. Learn more at onesignal.com
 *
 * The version of the OpenAPI document: 1.2.2
 * Contact: devrel@onesignal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.onesignal.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.onesignal.client.JSON;

/**
 * Player
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-01T23:27:12.168Z[Etc/UTC]")
public class Player {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INVALID_IDENTIFIER = "invalid_identifier";
  @SerializedName(SERIALIZED_NAME_INVALID_IDENTIFIER)
  private Boolean invalidIdentifier;

  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_DEVICE_TYPE = "device_type";
  @SerializedName(SERIALIZED_NAME_DEVICE_TYPE)
  private Integer deviceType;

  public static final String SERIALIZED_NAME_EXTERNAL_USER_ID = "external_user_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_USER_ID)
  private String externalUserId;

  public static final String SERIALIZED_NAME_EXTERNAL_USER_ID_AUTH_HASH = "external_user_id_auth_hash";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_USER_ID_AUTH_HASH)
  private String externalUserIdAuthHash;

  public static final String SERIALIZED_NAME_EMAIL_AUTH_HASH = "email_auth_hash";
  @SerializedName(SERIALIZED_NAME_EMAIL_AUTH_HASH)
  private String emailAuthHash;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private Integer timezone;

  public static final String SERIALIZED_NAME_GAME_VERSION = "game_version";
  @SerializedName(SERIALIZED_NAME_GAME_VERSION)
  private String gameVersion;

  public static final String SERIALIZED_NAME_DEVICE_MODEL = "device_model";
  @SerializedName(SERIALIZED_NAME_DEVICE_MODEL)
  private String deviceModel;

  public static final String SERIALIZED_NAME_DEVICE_OS = "device_os";
  @SerializedName(SERIALIZED_NAME_DEVICE_OS)
  private String deviceOs;

  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private String adId;

  public static final String SERIALIZED_NAME_SDK = "sdk";
  @SerializedName(SERIALIZED_NAME_SDK)
  private String sdk;

  public static final String SERIALIZED_NAME_SESSION_COUNT = "session_count";
  @SerializedName(SERIALIZED_NAME_SESSION_COUNT)
  private Integer sessionCount;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public static final String SERIALIZED_NAME_AMOUNT_SPENT = "amount_spent";
  @SerializedName(SERIALIZED_NAME_AMOUNT_SPENT)
  private BigDecimal amountSpent;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Long createdAt;

  public static final String SERIALIZED_NAME_PLAYTIME = "playtime";
  @SerializedName(SERIALIZED_NAME_PLAYTIME)
  private Long playtime;

  public static final String SERIALIZED_NAME_BADGE_COUNT = "badge_count";
  @SerializedName(SERIALIZED_NAME_BADGE_COUNT)
  private Integer badgeCount;

  public static final String SERIALIZED_NAME_LAST_ACTIVE = "last_active";
  @SerializedName(SERIALIZED_NAME_LAST_ACTIVE)
  private Integer lastActive;

  public static final String SERIALIZED_NAME_NOTIFICATION_TYPES = "notification_types";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_TYPES)
  private Integer notificationTypes;

  public static final String SERIALIZED_NAME_TEST_TYPE = "test_type";
  @SerializedName(SERIALIZED_NAME_TEST_TYPE)
  private Integer testType;

  public static final String SERIALIZED_NAME_LONG = "long";
  @SerializedName(SERIALIZED_NAME_LONG)
  private BigDecimal _long;

  public static final String SERIALIZED_NAME_LAT = "lat";
  @SerializedName(SERIALIZED_NAME_LAT)
  private BigDecimal lat;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public Player() { 
  }

  
  public Player(
     String id, 
     Boolean invalidIdentifier
  ) {
    this();
    this.id = id;
    this.invalidIdentifier = invalidIdentifier;
  }

   /**
   * The device&#39;s OneSignal ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The device's OneSignal ID")

  public String getId() {
    return id;
  }




   /**
   * If true, this is the equivalent of a user being Unsubscribed
   * @return invalidIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, this is the equivalent of a user being Unsubscribed")

  public Boolean getInvalidIdentifier() {
    return invalidIdentifier;
  }




  public Player appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public Player deviceType(Integer deviceType) {
    
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Required The device&#39;s platform:   0 &#x3D; iOS   1 &#x3D; Android   2 &#x3D; Amazon   3 &#x3D; WindowsPhone (MPNS)   4 &#x3D; Chrome Apps / Extensions   5 &#x3D; Chrome Web Push   6 &#x3D; Windows (WNS)   7 &#x3D; Safari   8 &#x3D; Firefox   9 &#x3D; MacOS   10 &#x3D; Alexa   11 &#x3D; Email   13 &#x3D; For Huawei App Gallery Builds SDK Setup. Not for Huawei Devices using FCM   14 &#x3D; SMS 
   * @return deviceType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Required The device's platform:   0 = iOS   1 = Android   2 = Amazon   3 = WindowsPhone (MPNS)   4 = Chrome Apps / Extensions   5 = Chrome Web Push   6 = Windows (WNS)   7 = Safari   8 = Firefox   9 = MacOS   10 = Alexa   11 = Email   13 = For Huawei App Gallery Builds SDK Setup. Not for Huawei Devices using FCM   14 = SMS ")

  public Integer getDeviceType() {
    return deviceType;
  }


  public void setDeviceType(Integer deviceType) {
    this.deviceType = deviceType;
  }


  public Player externalUserId(String externalUserId) {
    
    this.externalUserId = externalUserId;
    return this;
  }

   /**
   * a custom user ID
   * @return externalUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a custom user ID")

  public String getExternalUserId() {
    return externalUserId;
  }


  public void setExternalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
  }


  public Player externalUserIdAuthHash(String externalUserIdAuthHash) {
    
    this.externalUserIdAuthHash = externalUserIdAuthHash;
    return this;
  }

   /**
   * Only required if you have enabled Identity Verification and device_type is NOT 11 email.
   * @return externalUserIdAuthHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only required if you have enabled Identity Verification and device_type is NOT 11 email.")

  public String getExternalUserIdAuthHash() {
    return externalUserIdAuthHash;
  }


  public void setExternalUserIdAuthHash(String externalUserIdAuthHash) {
    this.externalUserIdAuthHash = externalUserIdAuthHash;
  }


  public Player emailAuthHash(String emailAuthHash) {
    
    this.emailAuthHash = emailAuthHash;
    return this;
  }

   /**
   * Email - Only required if you have enabled Identity Verification and device_type is email (11).
   * @return emailAuthHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email - Only required if you have enabled Identity Verification and device_type is email (11).")

  public String getEmailAuthHash() {
    return emailAuthHash;
  }


  public void setEmailAuthHash(String emailAuthHash) {
    this.emailAuthHash = emailAuthHash;
  }


  public Player identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Recommended: For Push Notifications, this is the Push Token Identifier from Google or Apple. For Apple Push identifiers, you must strip all non alphanumeric characters. Examples: iOS: 7abcd558f29d0b1f048083e2834ad8ea4b3d87d8ad9c088b33c132706ff445f0 Android: APA91bHbYHk7aq-Uam_2pyJ2qbZvqllyyh2wjfPRaw5gLEX2SUlQBRvOc6sck1sa7H7nGeLNlDco8lXj83HWWwzV... For Email Addresses, set the full email address email@email.com and make sure to set device_type to 11. 
   * @return identifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Recommended: For Push Notifications, this is the Push Token Identifier from Google or Apple. For Apple Push identifiers, you must strip all non alphanumeric characters. Examples: iOS: 7abcd558f29d0b1f048083e2834ad8ea4b3d87d8ad9c088b33c132706ff445f0 Android: APA91bHbYHk7aq-Uam_2pyJ2qbZvqllyyh2wjfPRaw5gLEX2SUlQBRvOc6sck1sa7H7nGeLNlDco8lXj83HWWwzV... For Email Addresses, set the full email address email@email.com and make sure to set device_type to 11. ")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public Player language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Language code. Typically lower case two letters, except for Chinese where it must be one of zh-Hans or zh-Hant. Example: en 
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Language code. Typically lower case two letters, except for Chinese where it must be one of zh-Hans or zh-Hant. Example: en ")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public Player timezone(Integer timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Number of seconds away from UTC. Example: -28800 
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of seconds away from UTC. Example: -28800 ")

  public Integer getTimezone() {
    return timezone;
  }


  public void setTimezone(Integer timezone) {
    this.timezone = timezone;
  }


  public Player gameVersion(String gameVersion) {
    
    this.gameVersion = gameVersion;
    return this;
  }

   /**
   * Version of your app. Example: 1.1 
   * @return gameVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version of your app. Example: 1.1 ")

  public String getGameVersion() {
    return gameVersion;
  }


  public void setGameVersion(String gameVersion) {
    this.gameVersion = gameVersion;
  }


  public Player deviceModel(String deviceModel) {
    
    this.deviceModel = deviceModel;
    return this;
  }

   /**
   * Device make and model. Example: iPhone5,1 
   * @return deviceModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Device make and model. Example: iPhone5,1 ")

  public String getDeviceModel() {
    return deviceModel;
  }


  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }


  public Player deviceOs(String deviceOs) {
    
    this.deviceOs = deviceOs;
    return this;
  }

   /**
   * Device operating system version. Example: 7.0.4 
   * @return deviceOs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Device operating system version. Example: 7.0.4 ")

  public String getDeviceOs() {
    return deviceOs;
  }


  public void setDeviceOs(String deviceOs) {
    this.deviceOs = deviceOs;
  }


  public Player adId(String adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * The ad id for the device&#39;s platform: Android &#x3D; Advertising Id iOS &#x3D; identifierForVendor WP8.0 &#x3D; DeviceUniqueId WP8.1 &#x3D; AdvertisingId 
   * @return adId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ad id for the device's platform: Android = Advertising Id iOS = identifierForVendor WP8.0 = DeviceUniqueId WP8.1 = AdvertisingId ")

  public String getAdId() {
    return adId;
  }


  public void setAdId(String adId) {
    this.adId = adId;
  }


  public Player sdk(String sdk) {
    
    this.sdk = sdk;
    return this;
  }

   /**
   * Name and version of the sdk/plugin that&#39;s calling this API method (if any)
   * @return sdk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name and version of the sdk/plugin that's calling this API method (if any)")

  public String getSdk() {
    return sdk;
  }


  public void setSdk(String sdk) {
    this.sdk = sdk;
  }


  public Player sessionCount(Integer sessionCount) {
    
    this.sessionCount = sessionCount;
    return this;
  }

   /**
   * Number of times the user has played the game, defaults to 1
   * @return sessionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of times the user has played the game, defaults to 1")

  public Integer getSessionCount() {
    return sessionCount;
  }


  public void setSessionCount(Integer sessionCount) {
    this.sessionCount = sessionCount;
  }


  public Player tags(Object tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * Custom tags for the player. Only support string and integer key value pairs. Does not support arrays or other nested objects. Setting a tag value to null or an empty string will remove the tag. Example: {\&quot;foo\&quot;:\&quot;bar\&quot;,\&quot;this\&quot;:\&quot;that\&quot;} Limitations: - 100 tags per call - Android SDK users: tags cannot be removed or changed via API if set through SDK sendTag methods. Recommended to only tag devices with 1 kilobyte of data Please consider using your own Database to save more than 1 kilobyte of data. See: Internal Database &amp; CRM 
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom tags for the player. Only support string and integer key value pairs. Does not support arrays or other nested objects. Setting a tag value to null or an empty string will remove the tag. Example: {\"foo\":\"bar\",\"this\":\"that\"} Limitations: - 100 tags per call - Android SDK users: tags cannot be removed or changed via API if set through SDK sendTag methods. Recommended to only tag devices with 1 kilobyte of data Please consider using your own Database to save more than 1 kilobyte of data. See: Internal Database & CRM ")

  public Object getTags() {
    return tags;
  }


  public void setTags(Object tags) {
    this.tags = tags;
  }


  public Player amountSpent(BigDecimal amountSpent) {
    
    this.amountSpent = amountSpent;
    return this;
  }

   /**
   * Amount the user has spent in USD, up to two decimal places
   * @return amountSpent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount the user has spent in USD, up to two decimal places")

  public BigDecimal getAmountSpent() {
    return amountSpent;
  }


  public void setAmountSpent(BigDecimal amountSpent) {
    this.amountSpent = amountSpent;
  }


  public Player createdAt(Long createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Unixtime when the player joined the game
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unixtime when the player joined the game")

  public Long getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }


  public Player playtime(Long playtime) {
    
    this.playtime = playtime;
    return this;
  }

   /**
   * Seconds player was running your app.
   * @return playtime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Seconds player was running your app.")

  public Long getPlaytime() {
    return playtime;
  }


  public void setPlaytime(Long playtime) {
    this.playtime = playtime;
  }


  public Player badgeCount(Integer badgeCount) {
    
    this.badgeCount = badgeCount;
    return this;
  }

   /**
   * Current iOS badge count displayed on the app icon NOTE: Not supported for apps created after June 2018, since badge count for apps created after this date are handled on the client. 
   * @return badgeCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current iOS badge count displayed on the app icon NOTE: Not supported for apps created after June 2018, since badge count for apps created after this date are handled on the client. ")

  public Integer getBadgeCount() {
    return badgeCount;
  }


  public void setBadgeCount(Integer badgeCount) {
    this.badgeCount = badgeCount;
  }


  public Player lastActive(Integer lastActive) {
    
    this.lastActive = lastActive;
    return this;
  }

   /**
   * Unixtime when the player was last active
   * @return lastActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unixtime when the player was last active")

  public Integer getLastActive() {
    return lastActive;
  }


  public void setLastActive(Integer lastActive) {
    this.lastActive = lastActive;
  }


  public Player notificationTypes(Integer notificationTypes) {
    
    this.notificationTypes = notificationTypes;
    return this;
  }

   /**
   * 1 &#x3D; subscribed -2 &#x3D; unsubscribed iOS - These values are set each time the user opens the app from the SDK. Use the SDK function set Subscription instead. Android - You may set this but you can no longer use the SDK method setSubscription later in your app as it will create synchronization issues. 
   * @return notificationTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "1 = subscribed -2 = unsubscribed iOS - These values are set each time the user opens the app from the SDK. Use the SDK function set Subscription instead. Android - You may set this but you can no longer use the SDK method setSubscription later in your app as it will create synchronization issues. ")

  public Integer getNotificationTypes() {
    return notificationTypes;
  }


  public void setNotificationTypes(Integer notificationTypes) {
    this.notificationTypes = notificationTypes;
  }


  public Player testType(Integer testType) {
    
    this.testType = testType;
    return this;
  }

   /**
   * This is used in deciding whether to use your iOS Sandbox or Production push certificate when sending a push when both have been uploaded. Set to the iOS provisioning profile that was used to build your app. 1 &#x3D; Development 2 &#x3D; Ad-Hoc Omit this field for App Store builds. 
   * @return testType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This is used in deciding whether to use your iOS Sandbox or Production push certificate when sending a push when both have been uploaded. Set to the iOS provisioning profile that was used to build your app. 1 = Development 2 = Ad-Hoc Omit this field for App Store builds. ")

  public Integer getTestType() {
    return testType;
  }


  public void setTestType(Integer testType) {
    this.testType = testType;
  }


  public Player _long(BigDecimal _long) {
    
    this._long = _long;
    return this;
  }

   /**
   * Longitude of the device, used for geotagging to segment on.
   * @return _long
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Longitude of the device, used for geotagging to segment on.")

  public BigDecimal getLong() {
    return _long;
  }


  public void setLong(BigDecimal _long) {
    this._long = _long;
  }


  public Player lat(BigDecimal lat) {
    
    this.lat = lat;
    return this;
  }

   /**
   * Latitude of the device, used for geotagging to segment on.
   * @return lat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Latitude of the device, used for geotagging to segment on.")

  public BigDecimal getLat() {
    return lat;
  }


  public void setLat(BigDecimal lat) {
    this.lat = lat;
  }


  public Player country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Country code in the ISO 3166-1 Alpha 2 format
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country code in the ISO 3166-1 Alpha 2 format")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Player player = (Player) o;
    return Objects.equals(this.id, player.id) &&
        Objects.equals(this.invalidIdentifier, player.invalidIdentifier) &&
        Objects.equals(this.appId, player.appId) &&
        Objects.equals(this.deviceType, player.deviceType) &&
        Objects.equals(this.externalUserId, player.externalUserId) &&
        Objects.equals(this.externalUserIdAuthHash, player.externalUserIdAuthHash) &&
        Objects.equals(this.emailAuthHash, player.emailAuthHash) &&
        Objects.equals(this.identifier, player.identifier) &&
        Objects.equals(this.language, player.language) &&
        Objects.equals(this.timezone, player.timezone) &&
        Objects.equals(this.gameVersion, player.gameVersion) &&
        Objects.equals(this.deviceModel, player.deviceModel) &&
        Objects.equals(this.deviceOs, player.deviceOs) &&
        Objects.equals(this.adId, player.adId) &&
        Objects.equals(this.sdk, player.sdk) &&
        Objects.equals(this.sessionCount, player.sessionCount) &&
        Objects.equals(this.tags, player.tags) &&
        Objects.equals(this.amountSpent, player.amountSpent) &&
        Objects.equals(this.createdAt, player.createdAt) &&
        Objects.equals(this.playtime, player.playtime) &&
        Objects.equals(this.badgeCount, player.badgeCount) &&
        Objects.equals(this.lastActive, player.lastActive) &&
        Objects.equals(this.notificationTypes, player.notificationTypes) &&
        Objects.equals(this.testType, player.testType) &&
        Objects.equals(this._long, player._long) &&
        Objects.equals(this.lat, player.lat) &&
        Objects.equals(this.country, player.country);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, invalidIdentifier, appId, deviceType, externalUserId, externalUserIdAuthHash, emailAuthHash, identifier, language, timezone, gameVersion, deviceModel, deviceOs, adId, sdk, sessionCount, tags, amountSpent, createdAt, playtime, badgeCount, lastActive, notificationTypes, testType, _long, lat, country);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Player {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invalidIdentifier: ").append(toIndentedString(invalidIdentifier)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    externalUserId: ").append(toIndentedString(externalUserId)).append("\n");
    sb.append("    externalUserIdAuthHash: ").append(toIndentedString(externalUserIdAuthHash)).append("\n");
    sb.append("    emailAuthHash: ").append(toIndentedString(emailAuthHash)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    gameVersion: ").append(toIndentedString(gameVersion)).append("\n");
    sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
    sb.append("    deviceOs: ").append(toIndentedString(deviceOs)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    sdk: ").append(toIndentedString(sdk)).append("\n");
    sb.append("    sessionCount: ").append(toIndentedString(sessionCount)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    amountSpent: ").append(toIndentedString(amountSpent)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    playtime: ").append(toIndentedString(playtime)).append("\n");
    sb.append("    badgeCount: ").append(toIndentedString(badgeCount)).append("\n");
    sb.append("    lastActive: ").append(toIndentedString(lastActive)).append("\n");
    sb.append("    notificationTypes: ").append(toIndentedString(notificationTypes)).append("\n");
    sb.append("    testType: ").append(toIndentedString(testType)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("invalid_identifier");
    openapiFields.add("app_id");
    openapiFields.add("device_type");
    openapiFields.add("external_user_id");
    openapiFields.add("external_user_id_auth_hash");
    openapiFields.add("email_auth_hash");
    openapiFields.add("identifier");
    openapiFields.add("language");
    openapiFields.add("timezone");
    openapiFields.add("game_version");
    openapiFields.add("device_model");
    openapiFields.add("device_os");
    openapiFields.add("ad_id");
    openapiFields.add("sdk");
    openapiFields.add("session_count");
    openapiFields.add("tags");
    openapiFields.add("amount_spent");
    openapiFields.add("created_at");
    openapiFields.add("playtime");
    openapiFields.add("badge_count");
    openapiFields.add("last_active");
    openapiFields.add("notification_types");
    openapiFields.add("test_type");
    openapiFields.add("long");
    openapiFields.add("lat");
    openapiFields.add("country");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("device_type");
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Player.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Player' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Player> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Player.class));

       return (TypeAdapter<T>) new TypeAdapter<Player>() {
           @Override
           public void write(JsonWriter out, Player value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Player read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Player given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Player
  * @throws IOException if the JSON string is invalid with respect to Player
  */
  public static Player fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Player.class);
  }

 /**
  * Convert an instance of Player to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

