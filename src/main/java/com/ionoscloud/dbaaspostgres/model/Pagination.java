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


package com.ionoscloud.dbaaspostgres.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ionoscloud.dbaaspostgres.model.PaginationLinks;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Pagination
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T14:47:06.484Z[Etc/UTC]")

public class Pagination {
  
  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;


  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;


  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private PaginationLinks links;

  

   /**
   * The offset specified in the request (if none was specified, the default offset is 0) (not implemented yet). 
   * minimum: 0
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The offset specified in the request (if none was specified, the default offset is 0) (not implemented yet). ")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }



   /**
   * The limit specified in the request (if none was specified, use the endpoint&#39;s default pagination limit) (not implemented yet, always return number of items). 
   * minimum: 0
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "42", value = "The limit specified in the request (if none was specified, use the endpoint's default pagination limit) (not implemented yet, always return number of items). ")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }



  public Pagination links(PaginationLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaginationLinks getLinks() {
    return links;
  }


  public void setLinks(PaginationLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.offset, pagination.offset) && Objects.equals(this.limit, pagination.limit) && Objects.equals(this.links, pagination.links);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");

    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");

    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

