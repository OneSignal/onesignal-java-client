# onesignal-java-client

OneSignal
- API version: 1.0.2
  - Build date: 2022-12-29T22:16:40.373Z[Etc/UTC]

A powerful way to send personalized messages at scale and build effective customer engagement strategies. Learn more at onesignal.com

  For more information, please visit [https://onesignal.com](https://onesignal.com)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>onesignal-java-client</artifactId>
  <version>1.0.2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'onesignal-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'onesignal-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:onesignal-java-client:1.0.2"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/onesignal-java-client-1.0.2.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  private static final String appId = "YOUR_APP_ID";
  private static final String appKeyToken = "YOUR_APP_KEY";
  private static final String userKeyToken = "YOUR_USER_TOKEN";

  private static Notification createNotification() {
    Notification notification = new Notification();
    notification.setAppId(appId);
    notification.setIsChrome(true);
    notification.setIsAnyWeb(true);
    notification.setIncludedSegments(Arrays.asList(new String[]{"Subscribed Users"}));
    StringMap contentStringMap = new StringMap();
    contentStringMap.en("Test");
    notification.setContents(contentStringMap);

    return notification;
  }

  public static void main(String[] args) {
    // Setting up the client
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    HttpBearerAuth appKey = (HttpBearerAuth) defaultClient.getAuthentication("app_key");
    appKey.setBearerToken(appKeyToken);
    HttpBearerAuth userKey = (HttpBearerAuth) defaultClient.getAuthentication("user_key");
    userKey.setBearerToken(userKeyToken);
    api = new DefaultApi(defaultClient);

    // Setting up the notification
    Notification notification = createNotification();

    // Sending the request
    CreateNotificationSuccessResponse response = api.createNotification(notification);

    // Checking the result
    System.out.print(response.getId();
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://onesignal.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**beginLiveActivity**](docs/DefaultApi.md#beginLiveActivity) | **POST** /apps/{app_id}/live_activities/{activity_id}/token | Start Live Activity
*DefaultApi* | [**cancelNotification**](docs/DefaultApi.md#cancelNotification) | **DELETE** /notifications/{notification_id} | Stop a scheduled or currently outgoing notification
*DefaultApi* | [**createApp**](docs/DefaultApi.md#createApp) | **POST** /apps | Create an app
*DefaultApi* | [**createNotification**](docs/DefaultApi.md#createNotification) | **POST** /notifications | Create notification
*DefaultApi* | [**createPlayer**](docs/DefaultApi.md#createPlayer) | **POST** /players | Add a device
*DefaultApi* | [**createSegments**](docs/DefaultApi.md#createSegments) | **POST** /apps/{app_id}/segments | Create Segments
*DefaultApi* | [**deletePlayer**](docs/DefaultApi.md#deletePlayer) | **DELETE** /players/{player_id} | Delete a user record
*DefaultApi* | [**deleteSegments**](docs/DefaultApi.md#deleteSegments) | **DELETE** /apps/{app_id}/segments/{segment_id} | Delete Segments
*DefaultApi* | [**endLiveActivity**](docs/DefaultApi.md#endLiveActivity) | **DELETE** /apps/{app_id}/live_activities/{activity_id}/token/{subscription_id} | Stop Live Activity
*DefaultApi* | [**exportPlayers**](docs/DefaultApi.md#exportPlayers) | **POST** /players/csv_export?app_id&#x3D;{app_id} | CSV export
*DefaultApi* | [**getApp**](docs/DefaultApi.md#getApp) | **GET** /apps/{app_id} | View an app
*DefaultApi* | [**getApps**](docs/DefaultApi.md#getApps) | **GET** /apps | View apps
*DefaultApi* | [**getNotification**](docs/DefaultApi.md#getNotification) | **GET** /notifications/{notification_id} | View notification
*DefaultApi* | [**getNotificationHistory**](docs/DefaultApi.md#getNotificationHistory) | **POST** /notifications/{notification_id}/history | Notification History
*DefaultApi* | [**getNotifications**](docs/DefaultApi.md#getNotifications) | **GET** /notifications | View notifications
*DefaultApi* | [**getOutcomes**](docs/DefaultApi.md#getOutcomes) | **GET** /apps/{app_id}/outcomes | View Outcomes
*DefaultApi* | [**getPlayer**](docs/DefaultApi.md#getPlayer) | **GET** /players/{player_id} | View device
*DefaultApi* | [**getPlayers**](docs/DefaultApi.md#getPlayers) | **GET** /players | View devices
*DefaultApi* | [**updateApp**](docs/DefaultApi.md#updateApp) | **PUT** /apps/{app_id} | Update an app
*DefaultApi* | [**updateLiveActivity**](docs/DefaultApi.md#updateLiveActivity) | **POST** /apps/{app_id}/live_activities/{activity_id}/notifications | Update a Live Activity via Push
*DefaultApi* | [**updatePlayer**](docs/DefaultApi.md#updatePlayer) | **PUT** /players/{player_id} | Edit device
*DefaultApi* | [**updatePlayerTags**](docs/DefaultApi.md#updatePlayerTags) | **PUT** /apps/{app_id}/users/{external_user_id} | Edit tags with external user id


## Documentation for Models

 - [App](docs/App.md)
 - [BadRequestError](docs/BadRequestError.md)
 - [BasicNotification](docs/BasicNotification.md)
 - [BasicNotificationAllOf](docs/BasicNotificationAllOf.md)
 - [BasicNotificationAllOfAndroidBackgroundLayout](docs/BasicNotificationAllOfAndroidBackgroundLayout.md)
 - [BeginLiveActivityRequest](docs/BeginLiveActivityRequest.md)
 - [Button](docs/Button.md)
 - [CancelNotificationSuccessResponse](docs/CancelNotificationSuccessResponse.md)
 - [CreateNotificationSuccessResponse](docs/CreateNotificationSuccessResponse.md)
 - [CreatePlayerSuccessResponse](docs/CreatePlayerSuccessResponse.md)
 - [CreateSegmentConflictResponse](docs/CreateSegmentConflictResponse.md)
 - [CreateSegmentSuccessResponse](docs/CreateSegmentSuccessResponse.md)
 - [DeletePlayerNotFoundResponse](docs/DeletePlayerNotFoundResponse.md)
 - [DeletePlayerSuccessResponse](docs/DeletePlayerSuccessResponse.md)
 - [DeleteSegmentNotFoundResponse](docs/DeleteSegmentNotFoundResponse.md)
 - [DeleteSegmentSuccessResponse](docs/DeleteSegmentSuccessResponse.md)
 - [DeliveryData](docs/DeliveryData.md)
 - [ExportPlayersRequestBody](docs/ExportPlayersRequestBody.md)
 - [ExportPlayersSuccessResponse](docs/ExportPlayersSuccessResponse.md)
 - [Filter](docs/Filter.md)
 - [FilterExpressions](docs/FilterExpressions.md)
 - [GetNotificationRequestBody](docs/GetNotificationRequestBody.md)
 - [InvalidIdentifierError](docs/InvalidIdentifierError.md)
 - [Notification](docs/Notification.md)
 - [Notification200Errors](docs/Notification200Errors.md)
 - [NotificationAllOf](docs/NotificationAllOf.md)
 - [NotificationHistorySuccessResponse](docs/NotificationHistorySuccessResponse.md)
 - [NotificationSlice](docs/NotificationSlice.md)
 - [NotificationTarget](docs/NotificationTarget.md)
 - [NotificationWithMeta](docs/NotificationWithMeta.md)
 - [NotificationWithMetaAllOf](docs/NotificationWithMetaAllOf.md)
 - [Operator](docs/Operator.md)
 - [OutcomeData](docs/OutcomeData.md)
 - [OutcomesData](docs/OutcomesData.md)
 - [PlatformDeliveryData](docs/PlatformDeliveryData.md)
 - [PlatformDeliveryDataEmailAllOf](docs/PlatformDeliveryDataEmailAllOf.md)
 - [PlatformDeliveryDataSmsAllOf](docs/PlatformDeliveryDataSmsAllOf.md)
 - [Player](docs/Player.md)
 - [PlayerNotificationTarget](docs/PlayerNotificationTarget.md)
 - [PlayerSlice](docs/PlayerSlice.md)
 - [Purchase](docs/Purchase.md)
 - [Segment](docs/Segment.md)
 - [SegmentNotificationTarget](docs/SegmentNotificationTarget.md)
 - [StringMap](docs/StringMap.md)
 - [UpdateLiveActivityRequest](docs/UpdateLiveActivityRequest.md)
 - [UpdateLiveActivitySuccessResponse](docs/UpdateLiveActivitySuccessResponse.md)
 - [UpdatePlayerSuccessResponse](docs/UpdatePlayerSuccessResponse.md)
 - [UpdatePlayerTagsRequestBody](docs/UpdatePlayerTagsRequestBody.md)
 - [UpdatePlayerTagsSuccessResponse](docs/UpdatePlayerTagsSuccessResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### app_key

- **Type**: HTTP basic authentication

### user_key

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

devrel@onesignal.com

