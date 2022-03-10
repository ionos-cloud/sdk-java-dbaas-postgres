[![Gitter](https://img.shields.io/gitter/room/ionos-cloud/sdk-general)](https://gitter.im/ionos-cloud/sdk-general)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.ionoscloud/ionos-cloud-sdk-dbaas-postgres/badge.svg?style=plastic)](https://mvnrepository.com/artifact/com.ionoscloud/ionos-cloud-sdk-dbaas-postgres)

## Overview

An enterprise-grade Database is provided as a Service (DBaaS) solution that can be managed through a browser-based "Data Center Designer" (DCD) tool or via an easy-to-use API.

With IONOS Cloud Database as a Service, you can quickly setup and manage a PostgreSQL database. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive.


## Getting Started

### Instalation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

#### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.ionoscloud</groupId>
  <artifactId>ionos-cloud-sdk-dbaas-postgres</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

#### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.ionoscloud:ionos-cloud-sdk-dbaas-postgres:1.0.0"
```

#### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/ionos-cloud-sdk-dbaas-postgres-1.0.0.jar`
* `target/lib/*.jar`


### Usage

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.ClustersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    ClustersApi apiInstance = new ClustersApi(defaultClient);
    String clusterId = "clusterId_example"; // String | The unique ID of the cluster.
    try {
      PostgresVersionList result = apiInstance.clusterPostgresVersionsGet(clusterId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClustersApi#clusterPostgresVersionsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

## FAQ

 - How can I open a bug/feature request?
	Bugs & feature requests can be open on the repository issues: https://github.com/ionos-cloud/ionos-cloud-sdk-dbaas-postgres/issues/new

 - Can I contribute to the DBaaS PostgreSQL Java SDK?
    Pur SDKs are automatically generated using OpenAPI Generator and don’t support manual changes. If you need changes please open an issue and we’ll try to take care of it.
