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
import com.onesignal.client.model.Notification200Errors;
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
 * UpdateLiveActivitySuccessResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-08T22:01:50.045Z[Etc/UTC]")
public class UpdateLiveActivitySuccessResponse {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NOTIFICATION_ID = "notification_id";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_ID)
  private String notificationId;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Notification200Errors errors;

  public UpdateLiveActivitySuccessResponse() { 
  }

  public UpdateLiveActivitySuccessResponse notificationId(String notificationId) {
    
    this.notificationId = notificationId;
    return this;
  }

   /**
   * Get notificationId
   * @return notificationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNotificationId() {
    return notificationId;
  }


  public void setNotificationId(String notificationId) {
    this.notificationId = notificationId;
  }


  public UpdateLiveActivitySuccessResponse errors(Notification200Errors errors) {
    
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Notification200Errors getErrors() {
    return errors;
  }


  public void setErrors(Notification200Errors errors) {
    this.errors = errors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateLiveActivitySuccessResponse updateLiveActivitySuccessResponse = (UpdateLiveActivitySuccessResponse) o;
    return Objects.equals(this.notificationId, updateLiveActivitySuccessResponse.notificationId) &&
        Objects.equals(this.errors, updateLiveActivitySuccessResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationId, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLiveActivitySuccessResponse {\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
    openapiFields.add("notification_id");
    openapiFields.add("errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateLiveActivitySuccessResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateLiveActivitySuccessResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateLiveActivitySuccessResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateLiveActivitySuccessResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateLiveActivitySuccessResponse>() {
           @Override
           public void write(JsonWriter out, UpdateLiveActivitySuccessResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateLiveActivitySuccessResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateLiveActivitySuccessResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateLiveActivitySuccessResponse
  * @throws IOException if the JSON string is invalid with respect to UpdateLiveActivitySuccessResponse
  */
  public static UpdateLiveActivitySuccessResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateLiveActivitySuccessResponse.class);
  }

 /**
  * Convert an instance of UpdateLiveActivitySuccessResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

