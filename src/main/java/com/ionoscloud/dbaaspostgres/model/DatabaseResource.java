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
import com.ionoscloud.dbaaspostgres.model.DatabaseProperties;
import com.ionoscloud.dbaaspostgres.model.Metadata;
import com.ionoscloud.dbaaspostgres.model.ResourceType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DatabaseResource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T08:52:33.432818Z[Etc/UTC]")

public class DatabaseResource {
  
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ResourceType type;


  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;


  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;


  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Metadata metadata;


  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private DatabaseProperties properties;

  

  public DatabaseResource type(ResourceType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public ResourceType getType() {
    return type;
  }


  public void setType(ResourceType type) {
    this.type = type;
  }



  public DatabaseResource id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the resource.
   * @return id
  **/
  @ApiModelProperty(example = "498ae72f-411f-11eb-9d07-046c59cc737e", required = true, value = "The unique ID of the resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }



  public DatabaseResource href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Absolute URL of the resource.
   * @return href
  **/
  @ApiModelProperty(required = true, value = "Absolute URL of the resource.")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }



  public DatabaseResource metadata(Metadata metadata) {
    
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



  public DatabaseResource properties(DatabaseProperties properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(required = true, value = "")

  public DatabaseProperties getProperties() {
    return properties;
  }


  public void setProperties(DatabaseProperties properties) {
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
    DatabaseResource databaseResource = (DatabaseResource) o;
    return Objects.equals(this.type, databaseResource.type) && Objects.equals(this.id, databaseResource.id) && Objects.equals(this.href, databaseResource.href) && Objects.equals(this.metadata, databaseResource.metadata) && Objects.equals(this.properties, databaseResource.properties);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseResource {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");

    sb.append("    href: ").append(toIndentedString(href)).append("\n");

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

