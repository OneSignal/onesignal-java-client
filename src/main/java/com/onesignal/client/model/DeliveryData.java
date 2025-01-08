/*
 * OneSignal
 * A powerful way to send personalized messages at scale and build effective customer engagement strategies. Learn more at onesignal.com
 *
 * The version of the OpenAPI document: 1.3.0
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
 * DeliveryData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-08T22:01:50.045Z[Etc/UTC]")
public class DeliveryData {
  private static final long serialVersionUID = 1L;

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

  public static final String SERIALIZED_NAME_RECEIVED = "received";
  @SerializedName(SERIALIZED_NAME_RECEIVED)
  private Integer received;

  public DeliveryData() { 
  }

  public DeliveryData successful(Integer successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * Number of messages delivered to push servers, mobile carriers, or email service providers.
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of messages delivered to push servers, mobile carriers, or email service providers.")

  public Integer getSuccessful() {
    return successful;
  }


  public void setSuccessful(Integer successful) {
    this.successful = successful;
  }


  public DeliveryData failed(Integer failed) {
    
    this.failed = failed;
    return this;
  }

   /**
   * Number of messages sent to unsubscribed devices.
   * @return failed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of messages sent to unsubscribed devices.")

  public Integer getFailed() {
    return failed;
  }


  public void setFailed(Integer failed) {
    this.failed = failed;
  }


  public DeliveryData errored(Integer errored) {
    
    this.errored = errored;
    return this;
  }

   /**
   * Number of errors reported.
   * @return errored
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of errors reported.")

  public Integer getErrored() {
    return errored;
  }


  public void setErrored(Integer errored) {
    this.errored = errored;
  }


  public DeliveryData converted(Integer converted) {
    
    this.converted = converted;
    return this;
  }

   /**
   * Number of messages that were clicked.
   * @return converted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of messages that were clicked.")

  public Integer getConverted() {
    return converted;
  }


  public void setConverted(Integer converted) {
    this.converted = converted;
  }


  public DeliveryData received(Integer received) {
    
    this.received = received;
    return this;
  }

   /**
   * Number of devices that received the message.
   * @return received
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of devices that received the message.")

  public Integer getReceived() {
    return received;
  }


  public void setReceived(Integer received) {
    this.received = received;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryData deliveryData = (DeliveryData) o;
    return Objects.equals(this.successful, deliveryData.successful) &&
        Objects.equals(this.failed, deliveryData.failed) &&
        Objects.equals(this.errored, deliveryData.errored) &&
        Objects.equals(this.converted, deliveryData.converted) &&
        Objects.equals(this.received, deliveryData.received);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, failed, errored, converted, received);
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
    sb.append("class DeliveryData {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    errored: ").append(toIndentedString(errored)).append("\n");
    sb.append("    converted: ").append(toIndentedString(converted)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
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
    openapiFields.add("successful");
    openapiFields.add("failed");
    openapiFields.add("errored");
    openapiFields.add("converted");
    openapiFields.add("received");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeliveryData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliveryData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliveryData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliveryData.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliveryData>() {
           @Override
           public void write(JsonWriter out, DeliveryData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeliveryData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeliveryData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeliveryData
  * @throws IOException if the JSON string is invalid with respect to DeliveryData
  */
  public static DeliveryData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliveryData.class);
  }

 /**
  * Convert an instance of DeliveryData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

