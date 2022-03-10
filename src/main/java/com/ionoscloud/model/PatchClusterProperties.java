/*
 * IONOS DBaaS REST API
 * An enterprise-grade Database is provided as a Service (DBaaS) solution that can be managed through a browser-based \"Data Center Designer\" (DCD) tool or via an easy to use API.  The API allows you to create additional database clusters or modify existing ones. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive. 
 *
 * The version of the OpenAPI document: 0.1.0
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
import com.ionoscloud.model.Connection;
import com.ionoscloud.model.MaintenanceWindow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Properties of the payload to change a cluster
 */
@ApiModel(description = "Properties of the payload to change a cluster")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-10T12:47:42.757Z[Etc/UTC]")

public class PatchClusterProperties {
  public static final String SERIALIZED_NAME_CORES = "cores";
  @SerializedName(SERIALIZED_NAME_CORES)
  private Integer cores;

  public static final String SERIALIZED_NAME_RAM = "ram";
  @SerializedName(SERIALIZED_NAME_RAM)
  private Integer ram;

  public static final String SERIALIZED_NAME_STORAGE_SIZE = "storageSize";
  @SerializedName(SERIALIZED_NAME_STORAGE_SIZE)
  private Integer storageSize;

  public static final String SERIALIZED_NAME_CONNECTIONS = "connections";
  @SerializedName(SERIALIZED_NAME_CONNECTIONS)
  private List<Connection> connections = null;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_MAINTENANCE_WINDOW = "maintenanceWindow";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_WINDOW)
  private MaintenanceWindow maintenanceWindow;

  public static final String SERIALIZED_NAME_POSTGRES_VERSION = "postgresVersion";
  @SerializedName(SERIALIZED_NAME_POSTGRES_VERSION)
  private String postgresVersion;

  public static final String SERIALIZED_NAME_INSTANCES = "instances";
  @SerializedName(SERIALIZED_NAME_INSTANCES)
  private Integer instances;


  public PatchClusterProperties cores(Integer cores) {
    
    this.cores = cores;
    return this;
  }

   /**
   * The number of CPU cores per instance.
   * minimum: 1
   * @return cores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "The number of CPU cores per instance.")

  public Integer getCores() {
    return cores;
  }


  public void setCores(Integer cores) {
    this.cores = cores;
  }


  public PatchClusterProperties ram(Integer ram) {
    
    this.ram = ram;
    return this;
  }

   /**
   * The amount of memory per instance in megabytes. Has to be a multiple of 1024.
   * minimum: 2048
   * @return ram
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2048", value = "The amount of memory per instance in megabytes. Has to be a multiple of 1024.")

  public Integer getRam() {
    return ram;
  }


  public void setRam(Integer ram) {
    this.ram = ram;
  }


  public PatchClusterProperties storageSize(Integer storageSize) {
    
    this.storageSize = storageSize;
    return this;
  }

   /**
   * The amount of storage per instance in megabytes.
   * minimum: 2048
   * maximum: 2097152
   * @return storageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5000", value = "The amount of storage per instance in megabytes.")

  public Integer getStorageSize() {
    return storageSize;
  }


  public void setStorageSize(Integer storageSize) {
    this.storageSize = storageSize;
  }


  public PatchClusterProperties connections(List<Connection> connections) {
    
    this.connections = connections;
    return this;
  }

  public PatchClusterProperties addConnectionsItem(Connection connectionsItem) {
    if (this.connections == null) {
      this.connections = new ArrayList<Connection>();
    }
    this.connections.add(connectionsItem);
    return this;
  }

   /**
   * Get connections
   * @return connections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Connection> getConnections() {
    return connections;
  }


  public void setConnections(List<Connection> connections) {
    this.connections = connections;
  }


  public PatchClusterProperties displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The friendly name of your cluster.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PostgreSQL cluster", value = "The friendly name of your cluster.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public PatchClusterProperties maintenanceWindow(MaintenanceWindow maintenanceWindow) {
    
    this.maintenanceWindow = maintenanceWindow;
    return this;
  }

   /**
   * Get maintenanceWindow
   * @return maintenanceWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MaintenanceWindow getMaintenanceWindow() {
    return maintenanceWindow;
  }


  public void setMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
    this.maintenanceWindow = maintenanceWindow;
  }


  public PatchClusterProperties postgresVersion(String postgresVersion) {
    
    this.postgresVersion = postgresVersion;
    return this;
  }

   /**
   * The PostgreSQL version of your cluster.
   * @return postgresVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13", value = "The PostgreSQL version of your cluster.")

  public String getPostgresVersion() {
    return postgresVersion;
  }


  public void setPostgresVersion(String postgresVersion) {
    this.postgresVersion = postgresVersion;
  }


  public PatchClusterProperties instances(Integer instances) {
    
    this.instances = instances;
    return this;
  }

   /**
   * The total number of instances in the cluster (one master and n-1 standbys). 
   * minimum: 1
   * maximum: 5
   * @return instances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "The total number of instances in the cluster (one master and n-1 standbys). ")

  public Integer getInstances() {
    return instances;
  }


  public void setInstances(Integer instances) {
    this.instances = instances;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchClusterProperties patchClusterProperties = (PatchClusterProperties) o;
    return Objects.equals(this.cores, patchClusterProperties.cores) && Objects.equals(this.ram, patchClusterProperties.ram) && Objects.equals(this.storageSize, patchClusterProperties.storageSize) && Objects.equals(this.connections, patchClusterProperties.connections) && Objects.equals(this.displayName, patchClusterProperties.displayName) && Objects.equals(this.maintenanceWindow, patchClusterProperties.maintenanceWindow) && Objects.equals(this.postgresVersion, patchClusterProperties.postgresVersion) && Objects.equals(this.instances, patchClusterProperties.instances);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchClusterProperties {\n");
    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
    sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
    sb.append("    storageSize: ").append(toIndentedString(storageSize)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    maintenanceWindow: ").append(toIndentedString(maintenanceWindow)).append("\n");
    sb.append("    postgresVersion: ").append(toIndentedString(postgresVersion)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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
