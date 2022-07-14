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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ionoscloud.model.Metadata;
import com.ionoscloud.model.PatchClusterProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request payload to change a cluster.
 */
@ApiModel(description = "Request payload to change a cluster.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-14T10:59:48.389Z[Etc/UTC]")

public class PatchClusterRequest {
  
  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Metadata metadata;


  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private PatchClusterProperties properties;

  

  public PatchClusterRequest metadata(Metadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Metadata getMetadata() {
    return metadata;
  }


  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }



  public PatchClusterRequest properties(PatchClusterProperties properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PatchClusterProperties getProperties() {
    return properties;
  }


  public void setProperties(PatchClusterProperties properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchClusterRequest patchClusterRequest = (PatchClusterRequest) o;
    return Objects.equals(this.metadata, patchClusterRequest.metadata) && Objects.equals(this.properties, patchClusterRequest.properties);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchClusterRequest {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");

    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

}

