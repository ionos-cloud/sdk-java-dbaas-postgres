# SDK-Java-DBaaS-Postgres
[![[ CD ] DBaaS Postgres / Java](https://github.com/ionos-cloud/sdk-resources/actions/workflows/release-dbaas-postgres-java.yml/badge.svg)](https://github.com/ionos-cloud/sdk-resources/actions/workflows/release-dbaas-postgres-java.yml)

# Node API Client For IONOS Cloud Dbaas Postgres
An enterprise-grade Database is provided as a Service (DBaaS) solution that
can be managed through a browser-based \"Data Center Designer\" (DCD) tool or
via an easy to use API.

The API allows you to create additional database clusters or modify existing
ones. It is designed to allow users to leverage the same power and
flexibility found within the DCD visual tool. Both tools are consistent with
their concepts and lend well to making the experience smooth and intuitive.

## Installation

#### Maven users

```xml
<dependency>
  <groupId>com.ionoscloud</groupId>
  <artifactId>ionos-cloud-dbaas-sdk</artifactId>
  <version>v1.0.0</version>
  <scope>compile</scope>
</dependency>
```

#### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.ionoscloud:ionos-cloud-dbaas-sdk:v1.0.0"
```

## Usage

```java
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.MetadataApi;

import java.util.List;

public class test {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure HTTP basic authorization: basicAuth
        var basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuthentication.setUsername("username_here");
        basicAuthentication.setPassword("password_here");

        MetadataApi apiInstance = new MetadataApi(defaultClient);
        try {
            List<APIVersion> result = apiInstance.infosVersionsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#infosVersionsGet");
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
	Bugs & feature requests can be open on the repository issues: https://github.com/ionos-cloud/sdk-java-dbaas-postgres/issues/new/choose

 - Can I contribute to the Java DBaaS Postgres SDK?
    Our SDKs are automatically generated using OpenAPI Generator and don’t support manual changes. If you need changes please open an issue and we’ll try to take care of it.
