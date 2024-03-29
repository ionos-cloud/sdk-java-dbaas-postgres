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
import com.ionoscloud.dbaaspostgres.model.ClusterLogsInstancesMessages;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClusterLogsInstances
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T08:52:33.432818Z[Etc/UTC]")

public class ClusterLogsInstances {
  
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<ClusterLogsInstancesMessages> messages = null;

  

  public ClusterLogsInstances name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the PostgreSQL instance.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "postgres-cluster-0", value = "The name of the PostgreSQL instance.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  public ClusterLogsInstances messages(List<ClusterLogsInstancesMessages> messages) {
    
    this.messages = messages;
    return this;
  }

  public ClusterLogsInstances addMessagesItem(ClusterLogsInstancesMessages messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ClusterLogsInstancesMessages> getMessages() {
    return messages;
  }


  public void setMessages(List<ClusterLogsInstancesMessages> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterLogsInstances clusterLogsInstances = (ClusterLogsInstances) o;
    return Objects.equals(this.name, clusterLogsInstances.name) && Objects.equals(this.messages, clusterLogsInstances.messages);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterLogsInstances {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

