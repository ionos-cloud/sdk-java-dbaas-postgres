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
import com.ionoscloud.dbaaspostgres.model.Connection;
import com.ionoscloud.dbaaspostgres.model.MaintenanceWindow;
import com.ionoscloud.dbaaspostgres.model.StorageType;
import com.ionoscloud.dbaaspostgres.model.SynchronizationMode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Properties of a database cluster.
 */
@ApiModel(description = "Properties of a database cluster.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-06T14:30:34.321Z[Etc/UTC]")

public class ClusterProperties {
  
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;


  public static final String SERIALIZED_NAME_POSTGRES_VERSION = "postgresVersion";
  @SerializedName(SERIALIZED_NAME_POSTGRES_VERSION)
  private String postgresVersion;


  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;


  public static final String SERIALIZED_NAME_DNS_NAME = "dnsName";
  @SerializedName(SERIALIZED_NAME_DNS_NAME)
  private String dnsName;


  public static final String SERIALIZED_NAME_BACKUP_LOCATION = "backupLocation";
  @SerializedName(SERIALIZED_NAME_BACKUP_LOCATION)
  private String backupLocation;


  public static final String SERIALIZED_NAME_INSTANCES = "instances";
  @SerializedName(SERIALIZED_NAME_INSTANCES)
  private Integer instances;


  public static final String SERIALIZED_NAME_RAM = "ram";
  @SerializedName(SERIALIZED_NAME_RAM)
  private Integer ram;


  public static final String SERIALIZED_NAME_CORES = "cores";
  @SerializedName(SERIALIZED_NAME_CORES)
  private Integer cores;


  public static final String SERIALIZED_NAME_STORAGE_SIZE = "storageSize";
  @SerializedName(SERIALIZED_NAME_STORAGE_SIZE)
  private Integer storageSize;


  public static final String SERIALIZED_NAME_STORAGE_TYPE = "storageType";
  @SerializedName(SERIALIZED_NAME_STORAGE_TYPE)
  private StorageType storageType;


  public static final String SERIALIZED_NAME_CONNECTIONS = "connections";
  @SerializedName(SERIALIZED_NAME_CONNECTIONS)
  private List<Connection> connections = null;


  public static final String SERIALIZED_NAME_MAINTENANCE_WINDOW = "maintenanceWindow";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_WINDOW)
  private MaintenanceWindow maintenanceWindow;


  public static final String SERIALIZED_NAME_SYNCHRONIZATION_MODE = "synchronizationMode";
  @SerializedName(SERIALIZED_NAME_SYNCHRONIZATION_MODE)
  private SynchronizationMode synchronizationMode;

  

  public ClusterProperties displayName(String displayName) {
    
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



  public ClusterProperties postgresVersion(String postgresVersion) {
    
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



  public ClusterProperties location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * The physical location where the cluster will be created. This will be where all of your instances live. Property cannot be modified after datacenter creation. 
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "de/fra", value = "The physical location where the cluster will be created. This will be where all of your instances live. Property cannot be modified after datacenter creation. ")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }



  public ClusterProperties dnsName(String dnsName) {
    
    this.dnsName = dnsName;
    return this;
  }

   /**
   * The DNS name pointing to your cluster.
   * @return dnsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pg.example.com", value = "The DNS name pointing to your cluster.")

  public String getDnsName() {
    return dnsName;
  }


  public void setDnsName(String dnsName) {
    this.dnsName = dnsName;
  }



  public ClusterProperties backupLocation(String backupLocation) {
    
    this.backupLocation = backupLocation;
    return this;
  }

   /**
   * The S3 location where the backups will be stored.
   * @return backupLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "de", value = "The S3 location where the backups will be stored.")

  public String getBackupLocation() {
    return backupLocation;
  }


  public void setBackupLocation(String backupLocation) {
    this.backupLocation = backupLocation;
  }



  public ClusterProperties instances(Integer instances) {
    
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



  public ClusterProperties ram(Integer ram) {
    
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



  public ClusterProperties cores(Integer cores) {
    
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



  public ClusterProperties storageSize(Integer storageSize) {
    
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



  public ClusterProperties storageType(StorageType storageType) {
    
    this.storageType = storageType;
    return this;
  }

   /**
   * Get storageType
   * @return storageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StorageType getStorageType() {
    return storageType;
  }


  public void setStorageType(StorageType storageType) {
    this.storageType = storageType;
  }



  public ClusterProperties connections(List<Connection> connections) {
    
    this.connections = connections;
    return this;
  }

  public ClusterProperties addConnectionsItem(Connection connectionsItem) {
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



  public ClusterProperties maintenanceWindow(MaintenanceWindow maintenanceWindow) {
    
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



  public ClusterProperties synchronizationMode(SynchronizationMode synchronizationMode) {
    
    this.synchronizationMode = synchronizationMode;
    return this;
  }

   /**
   * Get synchronizationMode
   * @return synchronizationMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SynchronizationMode getSynchronizationMode() {
    return synchronizationMode;
  }


  public void setSynchronizationMode(SynchronizationMode synchronizationMode) {
    this.synchronizationMode = synchronizationMode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterProperties clusterProperties = (ClusterProperties) o;
    return Objects.equals(this.displayName, clusterProperties.displayName) && Objects.equals(this.postgresVersion, clusterProperties.postgresVersion) && Objects.equals(this.location, clusterProperties.location) && Objects.equals(this.dnsName, clusterProperties.dnsName) && Objects.equals(this.backupLocation, clusterProperties.backupLocation) && Objects.equals(this.instances, clusterProperties.instances) && Objects.equals(this.ram, clusterProperties.ram) && Objects.equals(this.cores, clusterProperties.cores) && Objects.equals(this.storageSize, clusterProperties.storageSize) && Objects.equals(this.storageType, clusterProperties.storageType) && Objects.equals(this.connections, clusterProperties.connections) && Objects.equals(this.maintenanceWindow, clusterProperties.maintenanceWindow) && Objects.equals(this.synchronizationMode, clusterProperties.synchronizationMode);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterProperties {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");

    sb.append("    postgresVersion: ").append(toIndentedString(postgresVersion)).append("\n");

    sb.append("    location: ").append(toIndentedString(location)).append("\n");

    sb.append("    dnsName: ").append(toIndentedString(dnsName)).append("\n");

    sb.append("    backupLocation: ").append(toIndentedString(backupLocation)).append("\n");

    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");

    sb.append("    ram: ").append(toIndentedString(ram)).append("\n");

    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");

    sb.append("    storageSize: ").append(toIndentedString(storageSize)).append("\n");

    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");

    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");

    sb.append("    maintenanceWindow: ").append(toIndentedString(maintenanceWindow)).append("\n");

    sb.append("    synchronizationMode: ").append(toIndentedString(synchronizationMode)).append("\n");
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

