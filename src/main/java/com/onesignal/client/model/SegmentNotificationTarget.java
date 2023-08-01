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
import java.util.ArrayList;
import java.util.List;
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
 * SegmentNotificationTarget
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-01T23:27:12.168Z[Etc/UTC]")
public class SegmentNotificationTarget {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_INCLUDED_SEGMENTS = "included_segments";
  @SerializedName(SERIALIZED_NAME_INCLUDED_SEGMENTS)
  private List<String> includedSegments = null;

  public static final String SERIALIZED_NAME_EXCLUDED_SEGMENTS = "excluded_segments";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_SEGMENTS)
  private List<String> excludedSegments = null;

  public SegmentNotificationTarget() { 
  }

  public SegmentNotificationTarget includedSegments(List<String> includedSegments) {
    
    this.includedSegments = includedSegments;
    return this;
  }

  public SegmentNotificationTarget addIncludedSegmentsItem(String includedSegmentsItem) {
    if (this.includedSegments == null) {
      this.includedSegments = new ArrayList<>();
    }
    this.includedSegments.add(includedSegmentsItem);
    return this;
  }

   /**
   * The segment names you want to target. Users in these segments will receive a notification. This targeting parameter is only compatible with excluded_segments. Example: [\&quot;Active Users\&quot;, \&quot;Inactive Users\&quot;] 
   * @return includedSegments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The segment names you want to target. Users in these segments will receive a notification. This targeting parameter is only compatible with excluded_segments. Example: [\"Active Users\", \"Inactive Users\"] ")

  public List<String> getIncludedSegments() {
    return includedSegments;
  }


  public void setIncludedSegments(List<String> includedSegments) {
    this.includedSegments = includedSegments;
  }


  public SegmentNotificationTarget excludedSegments(List<String> excludedSegments) {
    
    this.excludedSegments = excludedSegments;
    return this;
  }

  public SegmentNotificationTarget addExcludedSegmentsItem(String excludedSegmentsItem) {
    if (this.excludedSegments == null) {
      this.excludedSegments = new ArrayList<>();
    }
    this.excludedSegments.add(excludedSegmentsItem);
    return this;
  }

   /**
   * Segment that will be excluded when sending. Users in these segments will not receive a notification, even if they were included in included_segments. This targeting parameter is only compatible with included_segments. Example: [\&quot;Active Users\&quot;, \&quot;Inactive Users\&quot;] 
   * @return excludedSegments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Segment that will be excluded when sending. Users in these segments will not receive a notification, even if they were included in included_segments. This targeting parameter is only compatible with included_segments. Example: [\"Active Users\", \"Inactive Users\"] ")

  public List<String> getExcludedSegments() {
    return excludedSegments;
  }


  public void setExcludedSegments(List<String> excludedSegments) {
    this.excludedSegments = excludedSegments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentNotificationTarget segmentNotificationTarget = (SegmentNotificationTarget) o;
    return Objects.equals(this.includedSegments, segmentNotificationTarget.includedSegments) &&
        Objects.equals(this.excludedSegments, segmentNotificationTarget.excludedSegments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includedSegments, excludedSegments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentNotificationTarget {\n");
    sb.append("    includedSegments: ").append(toIndentedString(includedSegments)).append("\n");
    sb.append("    excludedSegments: ").append(toIndentedString(excludedSegments)).append("\n");
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
    openapiFields.add("included_segments");
    openapiFields.add("excluded_segments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SegmentNotificationTarget.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SegmentNotificationTarget' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SegmentNotificationTarget> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SegmentNotificationTarget.class));

       return (TypeAdapter<T>) new TypeAdapter<SegmentNotificationTarget>() {
           @Override
           public void write(JsonWriter out, SegmentNotificationTarget value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SegmentNotificationTarget read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SegmentNotificationTarget given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SegmentNotificationTarget
  * @throws IOException if the JSON string is invalid with respect to SegmentNotificationTarget
  */
  public static SegmentNotificationTarget fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SegmentNotificationTarget.class);
  }

 /**
  * Convert an instance of SegmentNotificationTarget to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

