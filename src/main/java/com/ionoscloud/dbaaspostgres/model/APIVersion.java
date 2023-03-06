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

/**
 * APIVersion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-06T14:30:34.321Z[Etc/UTC]")

public class APIVersion {
  
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public static final String SERIALIZED_NAME_SWAGGER_URL = "swaggerUrl";
  @SerializedName(SERIALIZED_NAME_SWAGGER_URL)
  private String swaggerUrl;

  

  public APIVersion name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "v2.1", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  public APIVersion swaggerUrl(String swaggerUrl) {
    
    this.swaggerUrl = swaggerUrl;
    return this;
  }

   /**
   * Get swaggerUrl
   * @return swaggerUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.ionos.com/databases/postgres/infos/assets/swagger-v2.1.yml", value = "")

  public String getSwaggerUrl() {
    return swaggerUrl;
  }


  public void setSwaggerUrl(String swaggerUrl) {
    this.swaggerUrl = swaggerUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIVersion apIVersion = (APIVersion) o;
    return Objects.equals(this.name, apIVersion.name) && Objects.equals(this.swaggerUrl, apIVersion.swaggerUrl);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIVersion {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    swaggerUrl: ").append(toIndentedString(swaggerUrl)).append("\n");
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

