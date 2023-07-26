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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Metadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T08:52:33.432818Z[Etc/UTC]")

public class Metadata {
  
  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;


  public static final String SERIALIZED_NAME_CREATED_BY_USER_ID = "createdByUserId";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_USER_ID)
  private UUID createdByUserId;


  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;


  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "lastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;


  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY_USER_ID = "lastModifiedByUserId";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY_USER_ID)
  private UUID lastModifiedByUserId;


  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private OffsetDateTime lastModifiedDate;


  public static final String SERIALIZED_NAME_RESOURCE_U_R_N = "resourceURN";
  @SerializedName(SERIALIZED_NAME_RESOURCE_U_R_N)
  private String resourceURN;

  

  public Metadata createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * The URN of an IAM user.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ionos:iam:cloud::users/f719718d-e0aa-4870-a36c-cc0bdb8c6d90", value = "The URN of an IAM user.")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }



  public Metadata createdByUserId(UUID createdByUserId) {
    
    this.createdByUserId = createdByUserId;
    return this;
  }

   /**
   * The ID of an IAM user.
   * @return createdByUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f719718d-e0aa-4870-a36c-cc0bdb8c6d90", value = "The ID of an IAM user.")

  public UUID getCreatedByUserId() {
    return createdByUserId;
  }


  public void setCreatedByUserId(UUID createdByUserId) {
    this.createdByUserId = createdByUserId;
  }



  public Metadata createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * An ISO 8601 timestamp.
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-05-11T13:37:50Z", value = "An ISO 8601 timestamp.")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }



  public Metadata lastModifiedBy(String lastModifiedBy) {
    
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * The URN of an IAM user.
   * @return lastModifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ionos:iam:cloud::users/f719718d-e0aa-4870-a36c-cc0bdb8c6d90", value = "The URN of an IAM user.")

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }


  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }



  public Metadata lastModifiedByUserId(UUID lastModifiedByUserId) {
    
    this.lastModifiedByUserId = lastModifiedByUserId;
    return this;
  }

   /**
   * The ID of an IAM user.
   * @return lastModifiedByUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f719718d-e0aa-4870-a36c-cc0bdb8c6d90", value = "The ID of an IAM user.")

  public UUID getLastModifiedByUserId() {
    return lastModifiedByUserId;
  }


  public void setLastModifiedByUserId(UUID lastModifiedByUserId) {
    this.lastModifiedByUserId = lastModifiedByUserId;
  }



  public Metadata lastModifiedDate(OffsetDateTime lastModifiedDate) {
    
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * An ISO 8601 timestamp.
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-05-11T13:37:50Z", value = "An ISO 8601 timestamp.")

  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }


  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }



  public Metadata resourceURN(String resourceURN) {
    
    this.resourceURN = resourceURN;
    return this;
  }

   /**
   * The URN of the resource.
   * @return resourceURN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ionos:postgresql:de-fra:11274857:clusters/c668480f-8627-4b6c-b422-2599d4b568a6/users/benjamin", value = "The URN of the resource.")

  public String getResourceURN() {
    return resourceURN;
  }


  public void setResourceURN(String resourceURN) {
    this.resourceURN = resourceURN;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metadata metadata = (Metadata) o;
    return Objects.equals(this.createdBy, metadata.createdBy) && Objects.equals(this.createdByUserId, metadata.createdByUserId) && Objects.equals(this.createdDate, metadata.createdDate) && Objects.equals(this.lastModifiedBy, metadata.lastModifiedBy) && Objects.equals(this.lastModifiedByUserId, metadata.lastModifiedByUserId) && Objects.equals(this.lastModifiedDate, metadata.lastModifiedDate) && Objects.equals(this.resourceURN, metadata.resourceURN);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metadata {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");

    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");

    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");

    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");

    sb.append("    lastModifiedByUserId: ").append(toIndentedString(lastModifiedByUserId)).append("\n");

    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");

    sb.append("    resourceURN: ").append(toIndentedString(resourceURN)).append("\n");
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

