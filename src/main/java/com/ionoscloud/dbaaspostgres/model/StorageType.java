/*
 * IONOS DBaaS PostgreSQL REST API
 * An enterprise-grade Database is provided as a Service (DBaaS) solution that can be managed through a browser-based \"Data Center Designer\" (DCD) tool or via an easy to use API.  The API allows you to create additional PostgreSQL database clusters or modify existing ones. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionoscloud.dbaaspostgres.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The storage type used in your cluster. (Value \&quot;SSD\&quot; is deprecated. Use the equivalent \&quot;SSD Premium\&quot; instead)
 */
@JsonAdapter(StorageType.Adapter.class)
public enum StorageType {
  
  HDD("HDD"),
  
  SSD("SSD"),
  
  SSD_STANDARD("SSD Standard"),
  
  SSD_PREMIUM("SSD Premium");

  private String value;

  StorageType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StorageType fromValue(String value) {
    for (StorageType b : StorageType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StorageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StorageType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StorageType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StorageType.fromValue(value);
    }
  }
}
