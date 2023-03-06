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
import com.ionoscloud.dbaaspostgres.model.ClusterResponse;
import com.ionoscloud.dbaaspostgres.model.ResourceType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClusterListAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-06T14:30:34.321Z[Etc/UTC]")

public class ClusterListAllOf {
  
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ResourceType type;


  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;


  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<ClusterResponse> items = null;

  

  public ClusterListAllOf type(ResourceType type) {
    
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



  public ClusterListAllOf id(String id) {
    
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



  public ClusterListAllOf items(List<ClusterResponse> items) {
    
    this.items = items;
    return this;
  }

  public ClusterListAllOf addItemsItem(ClusterResponse itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ClusterResponse>();
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

  public List<ClusterResponse> getItems() {
    return items;
  }


  public void setItems(List<ClusterResponse> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterListAllOf clusterListAllOf = (ClusterListAllOf) o;
    return Objects.equals(this.type, clusterListAllOf.type) && Objects.equals(this.id, clusterListAllOf.id) && Objects.equals(this.items, clusterListAllOf.items);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterListAllOf {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");

    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

