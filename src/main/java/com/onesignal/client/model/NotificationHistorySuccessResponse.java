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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * NotificationHistorySuccessResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-29T22:16:40.373Z[Etc/UTC]")
public class NotificationHistorySuccessResponse {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_DESTINATION_URL = "destination_url";
  @SerializedName(SERIALIZED_NAME_DESTINATION_URL)
  private String destinationUrl;

  public NotificationHistorySuccessResponse() { 
  }

  public NotificationHistorySuccessResponse success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public NotificationHistorySuccessResponse destinationUrl(String destinationUrl) {
    
    this.destinationUrl = destinationUrl;
    return this;
  }

   /**
   * Get destinationUrl
   * @return destinationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDestinationUrl() {
    return destinationUrl;
  }


  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationHistorySuccessResponse notificationHistorySuccessResponse = (NotificationHistorySuccessResponse) o;
    return Objects.equals(this.success, notificationHistorySuccessResponse.success) &&
        Objects.equals(this.destinationUrl, notificationHistorySuccessResponse.destinationUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, destinationUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationHistorySuccessResponse {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    destinationUrl: ").append(toIndentedString(destinationUrl)).append("\n");
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
    openapiFields.add("success");
    openapiFields.add("destination_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotificationHistorySuccessResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotificationHistorySuccessResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotificationHistorySuccessResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotificationHistorySuccessResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<NotificationHistorySuccessResponse>() {
           @Override
           public void write(JsonWriter out, NotificationHistorySuccessResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NotificationHistorySuccessResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NotificationHistorySuccessResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NotificationHistorySuccessResponse
  * @throws IOException if the JSON string is invalid with respect to NotificationHistorySuccessResponse
  */
  public static NotificationHistorySuccessResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotificationHistorySuccessResponse.class);
  }

 /**
  * Convert an instance of NotificationHistorySuccessResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

