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
 * UpdatePlayerTagsRequestBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-29T22:16:40.373Z[Etc/UTC]")
public class UpdatePlayerTagsRequestBody {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public UpdatePlayerTagsRequestBody() { 
  }

  public UpdatePlayerTagsRequestBody tags(Object tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * Custom tags for the device record.  Only support string key value pairs.  Does not support arrays or other nested objects.  Example &#x60;{\&quot;foo\&quot;:\&quot;bar\&quot;,\&quot;this\&quot;:\&quot;that\&quot;}&#x60;. Limitations: - 100 tags per call - Android SDK users: tags cannot be removed or changed via API if set through SDK sendTag methods. Recommended to only tag devices with 1 kilobyte of ata Please consider using your own Database to save more than 1 kilobyte of data.  See: Internal Database &amp; CRM 
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom tags for the device record.  Only support string key value pairs.  Does not support arrays or other nested objects.  Example `{\"foo\":\"bar\",\"this\":\"that\"}`. Limitations: - 100 tags per call - Android SDK users: tags cannot be removed or changed via API if set through SDK sendTag methods. Recommended to only tag devices with 1 kilobyte of ata Please consider using your own Database to save more than 1 kilobyte of data.  See: Internal Database & CRM ")

  public Object getTags() {
    return tags;
  }


  public void setTags(Object tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePlayerTagsRequestBody updatePlayerTagsRequestBody = (UpdatePlayerTagsRequestBody) o;
    return Objects.equals(this.tags, updatePlayerTagsRequestBody.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePlayerTagsRequestBody {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdatePlayerTagsRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdatePlayerTagsRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdatePlayerTagsRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdatePlayerTagsRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdatePlayerTagsRequestBody>() {
           @Override
           public void write(JsonWriter out, UpdatePlayerTagsRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdatePlayerTagsRequestBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdatePlayerTagsRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdatePlayerTagsRequestBody
  * @throws IOException if the JSON string is invalid with respect to UpdatePlayerTagsRequestBody
  */
  public static UpdatePlayerTagsRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdatePlayerTagsRequestBody.class);
  }

 /**
  * Convert an instance of UpdatePlayerTagsRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

