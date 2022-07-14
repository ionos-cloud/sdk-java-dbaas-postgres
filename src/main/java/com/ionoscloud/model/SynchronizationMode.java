/*
 * IONOS DBaaS REST API
 * An enterprise-grade Database is provided as a Service (DBaaS) solution that can be managed through a browser-based \"Data Center Designer\" (DCD) tool or via an easy to use API.  The API allows you to create additional database clusters or modify existing ones. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionoscloud.model;

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
 * Represents different modes of replication. 
 */
@JsonAdapter(SynchronizationMode.Adapter.class)
public enum SynchronizationMode {
  
  ASYNCHRONOUS("ASYNCHRONOUS"),
  
  SYNCHRONOUS("SYNCHRONOUS"),
  
  STRICTLY_SYNCHRONOUS("STRICTLY_SYNCHRONOUS");

  private String value;

  SynchronizationMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SynchronizationMode fromValue(String value) {
    for (SynchronizationMode b : SynchronizationMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SynchronizationMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final SynchronizationMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SynchronizationMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SynchronizationMode.fromValue(value);
    }
  }
}

