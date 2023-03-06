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
import com.ionoscloud.dbaaspostgres.model.BackupResponse;
import com.ionoscloud.dbaaspostgres.model.ClusterBackupListAllOf;
import com.ionoscloud.dbaaspostgres.model.Pagination;
import com.ionoscloud.dbaaspostgres.model.PaginationLinks;
import com.ionoscloud.dbaaspostgres.model.ResourceType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * List of backups.
 */
@ApiModel(description = "List of backups.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-06T14:30:34.321Z[Etc/UTC]")

public class ClusterBackupList {
  
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ResourceType type;


  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;


  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<BackupResponse> items = null;


  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;


  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;


  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private PaginationLinks links;

  

  public ClusterBackupList type(ResourceType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceType getType() {
    return type;
  }


  public void setType(ResourceType type) {
    this.type = type;
  }



  public ClusterBackupList id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "498ae72f-411f-11eb-9d07-046c59cc737e", value = "The unique ID of the resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }



  public ClusterBackupList items(List<BackupResponse> items) {
    
    this.items = items;
    return this;
  }

  public ClusterBackupList addItemsItem(BackupResponse itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<BackupResponse>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BackupResponse> getItems() {
    return items;
  }


  public void setItems(List<BackupResponse> items) {
    this.items = items;
  }



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



  public ClusterBackupList links(PaginationLinks links) {
    
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
    ClusterBackupList clusterBackupList = (ClusterBackupList) o;
    return Objects.equals(this.type, clusterBackupList.type) && Objects.equals(this.id, clusterBackupList.id) && Objects.equals(this.items, clusterBackupList.items) && Objects.equals(this.offset, clusterBackupList.offset) && Objects.equals(this.limit, clusterBackupList.limit) && Objects.equals(this.links, clusterBackupList.links);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterBackupList {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");

    sb.append("    items: ").append(toIndentedString(items)).append("\n");

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
