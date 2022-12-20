/*
 * OneSignal
 * A powerful way to send personalized messages at scale and build effective customer engagement strategies. Learn more at onesignal.com
 *
 * The version of the OpenAPI document: 1.0.2
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
import com.onesignal.client.model.PlatformDeliveryData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * NotificationWithMetaAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-20T21:16:30.715Z[Etc/UTC]")
public class NotificationWithMetaAllOf {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_REMAINING = "remaining";
  @SerializedName(SERIALIZED_NAME_REMAINING)
  private Integer remaining;

  public static final String SERIALIZED_NAME_SUCCESSFUL = "successful";
  @SerializedName(SERIALIZED_NAME_SUCCESSFUL)
  private Integer successful;

  public static final String SERIALIZED_NAME_FAILED = "failed";
  @SerializedName(SERIALIZED_NAME_FAILED)
  private Integer failed;

  public static final String SERIALIZED_NAME_ERRORED = "errored";
  @SerializedName(SERIALIZED_NAME_ERRORED)
  private Integer errored;

  public static final String SERIALIZED_NAME_CONVERTED = "converted";
  @SerializedName(SERIALIZED_NAME_CONVERTED)
  private Integer converted;

  public static final String SERIALIZED_NAME_QUEUED_AT = "queued_at";
  @SerializedName(SERIALIZED_NAME_QUEUED_AT)
  private Long queuedAt;

  public static final String SERIALIZED_NAME_SEND_AFTER = "send_after";
  @SerializedName(SERIALIZED_NAME_SEND_AFTER)
  private Long sendAfter;

  public static final String SERIALIZED_NAME_COMPLETED_AT = "completed_at";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
  private Long completedAt;

  public static final String SERIALIZED_NAME_PLATFORM_DELIVERY_STATS = "platform_delivery_stats";
  @SerializedName(SERIALIZED_NAME_PLATFORM_DELIVERY_STATS)
  private PlatformDeliveryData platformDeliveryStats;

  public static final String SERIALIZED_NAME_RECEIVED = "received";
  @SerializedName(SERIALIZED_NAME_RECEIVED)
  private Integer received;

  public static final String SERIALIZED_NAME_THROTTLE_RATE_PER_MINUTE = "throttle_rate_per_minute";
  @SerializedName(SERIALIZED_NAME_THROTTLE_RATE_PER_MINUTE)
  private Integer throttleRatePerMinute;

  public NotificationWithMetaAllOf() { 
  }

  public NotificationWithMetaAllOf remaining(Integer remaining) {
    
    this.remaining = remaining;
    return this;
  }

   /**
   * Number of notifications that have not been sent out yet. This can mean either our system is still processing the notification or you have delayed options set.
   * @return remaining
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of notifications that have not been sent out yet. This can mean either our system is still processing the notification or you have delayed options set.")

  public Integer getRemaining() {
    return remaining;
  }


  public void setRemaining(Integer remaining) {
    this.remaining = remaining;
  }


  public NotificationWithMetaAllOf successful(Integer successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * Number of notifications that were successfully delivered.
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of notifications that were successfully delivered.")

  public Integer getSuccessful() {
    return successful;
  }


  public void setSuccessful(Integer successful) {
    this.successful = successful;
  }


  public NotificationWithMetaAllOf failed(Integer failed) {
    
    this.failed = failed;
    return this;
  }

   /**
   * Number of notifications that could not be delivered due to those devices being unsubscribed.
   * @return failed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of notifications that could not be delivered due to those devices being unsubscribed.")

  public Integer getFailed() {
    return failed;
  }


  public void setFailed(Integer failed) {
    this.failed = failed;
  }


  public NotificationWithMetaAllOf errored(Integer errored) {
    
    this.errored = errored;
    return this;
  }

   /**
   * Number of notifications that could not be delivered due to an error. You can find more information by viewing the notification in the dashboard.
   * @return errored
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of notifications that could not be delivered due to an error. You can find more information by viewing the notification in the dashboard.")

  public Integer getErrored() {
    return errored;
  }


  public void setErrored(Integer errored) {
    this.errored = errored;
  }


  public NotificationWithMetaAllOf converted(Integer converted) {
    
    this.converted = converted;
    return this;
  }

   /**
   * Number of users who have clicked / tapped on your notification.
   * @return converted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of users who have clicked / tapped on your notification.")

  public Integer getConverted() {
    return converted;
  }


  public void setConverted(Integer converted) {
    this.converted = converted;
  }


  public NotificationWithMetaAllOf queuedAt(Long queuedAt) {
    
    this.queuedAt = queuedAt;
    return this;
  }

   /**
   * Unix timestamp indicating when the notification was created.
   * @return queuedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unix timestamp indicating when the notification was created.")

  public Long getQueuedAt() {
    return queuedAt;
  }


  public void setQueuedAt(Long queuedAt) {
    this.queuedAt = queuedAt;
  }


  public NotificationWithMetaAllOf sendAfter(Long sendAfter) {
    
    this.sendAfter = sendAfter;
    return this;
  }

   /**
   * Unix timestamp indicating when notification delivery should begin.
   * @return sendAfter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unix timestamp indicating when notification delivery should begin.")

  public Long getSendAfter() {
    return sendAfter;
  }


  public void setSendAfter(Long sendAfter) {
    this.sendAfter = sendAfter;
  }


  public NotificationWithMetaAllOf completedAt(Long completedAt) {
    
    this.completedAt = completedAt;
    return this;
  }

   /**
   * Unix timestamp indicating when notification delivery completed. The delivery duration from start to finish can be calculated with completed_at - send_after.
   * @return completedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unix timestamp indicating when notification delivery completed. The delivery duration from start to finish can be calculated with completed_at - send_after.")

  public Long getCompletedAt() {
    return completedAt;
  }


  public void setCompletedAt(Long completedAt) {
    this.completedAt = completedAt;
  }


  public NotificationWithMetaAllOf platformDeliveryStats(PlatformDeliveryData platformDeliveryStats) {
    
    this.platformDeliveryStats = platformDeliveryStats;
    return this;
  }

   /**
   * Get platformDeliveryStats
   * @return platformDeliveryStats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlatformDeliveryData getPlatformDeliveryStats() {
    return platformDeliveryStats;
  }


  public void setPlatformDeliveryStats(PlatformDeliveryData platformDeliveryStats) {
    this.platformDeliveryStats = platformDeliveryStats;
  }


  public NotificationWithMetaAllOf received(Integer received) {
    
    this.received = received;
    return this;
  }

   /**
   * Confirmed Deliveries number of devices that received the push notification. Paid Feature Only. Free accounts will see 0.
   * @return received
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Confirmed Deliveries number of devices that received the push notification. Paid Feature Only. Free accounts will see 0.")

  public Integer getReceived() {
    return received;
  }


  public void setReceived(Integer received) {
    this.received = received;
  }


  public NotificationWithMetaAllOf throttleRatePerMinute(Integer throttleRatePerMinute) {
    
    this.throttleRatePerMinute = throttleRatePerMinute;
    return this;
  }

   /**
   * number of push notifications sent per minute. Paid Feature Only. If throttling is not enabled for the app or the notification, and for free accounts, null is returned. Refer to Throttling for more details.
   * @return throttleRatePerMinute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "number of push notifications sent per minute. Paid Feature Only. If throttling is not enabled for the app or the notification, and for free accounts, null is returned. Refer to Throttling for more details.")

  public Integer getThrottleRatePerMinute() {
    return throttleRatePerMinute;
  }


  public void setThrottleRatePerMinute(Integer throttleRatePerMinute) {
    this.throttleRatePerMinute = throttleRatePerMinute;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationWithMetaAllOf notificationWithMetaAllOf = (NotificationWithMetaAllOf) o;
    return Objects.equals(this.remaining, notificationWithMetaAllOf.remaining) &&
        Objects.equals(this.successful, notificationWithMetaAllOf.successful) &&
        Objects.equals(this.failed, notificationWithMetaAllOf.failed) &&
        Objects.equals(this.errored, notificationWithMetaAllOf.errored) &&
        Objects.equals(this.converted, notificationWithMetaAllOf.converted) &&
        Objects.equals(this.queuedAt, notificationWithMetaAllOf.queuedAt) &&
        Objects.equals(this.sendAfter, notificationWithMetaAllOf.sendAfter) &&
        Objects.equals(this.completedAt, notificationWithMetaAllOf.completedAt) &&
        Objects.equals(this.platformDeliveryStats, notificationWithMetaAllOf.platformDeliveryStats) &&
        Objects.equals(this.received, notificationWithMetaAllOf.received) &&
        Objects.equals(this.throttleRatePerMinute, notificationWithMetaAllOf.throttleRatePerMinute);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(remaining, successful, failed, errored, converted, queuedAt, sendAfter, completedAt, platformDeliveryStats, received, throttleRatePerMinute);
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
    sb.append("class NotificationWithMetaAllOf {\n");
    sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    errored: ").append(toIndentedString(errored)).append("\n");
    sb.append("    converted: ").append(toIndentedString(converted)).append("\n");
    sb.append("    queuedAt: ").append(toIndentedString(queuedAt)).append("\n");
    sb.append("    sendAfter: ").append(toIndentedString(sendAfter)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    platformDeliveryStats: ").append(toIndentedString(platformDeliveryStats)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
    sb.append("    throttleRatePerMinute: ").append(toIndentedString(throttleRatePerMinute)).append("\n");
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
    openapiFields.add("remaining");
    openapiFields.add("successful");
    openapiFields.add("failed");
    openapiFields.add("errored");
    openapiFields.add("converted");
    openapiFields.add("queued_at");
    openapiFields.add("send_after");
    openapiFields.add("completed_at");
    openapiFields.add("platform_delivery_stats");
    openapiFields.add("received");
    openapiFields.add("throttle_rate_per_minute");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotificationWithMetaAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotificationWithMetaAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotificationWithMetaAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotificationWithMetaAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<NotificationWithMetaAllOf>() {
           @Override
           public void write(JsonWriter out, NotificationWithMetaAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NotificationWithMetaAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NotificationWithMetaAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NotificationWithMetaAllOf
  * @throws IOException if the JSON string is invalid with respect to NotificationWithMetaAllOf
  */
  public static NotificationWithMetaAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotificationWithMetaAllOf.class);
  }

 /**
  * Convert an instance of NotificationWithMetaAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

