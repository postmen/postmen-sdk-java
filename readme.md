<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->
**Table of Contents**  *generated with [DocToc](https://github.com/thlorenz/doctoc)*

- [Installation](#installation)
  - [Requirements](#requirements)
  - [Manual Installation](#manual-installation)
  - [Using Maven](#using-maven)
  - [Using Gradle](#using-gradle)
  - [Quickstart](#quickstart)
- [API References (Link to JavaDocs)](#api-references-link-to-javadocs)
  - [Configuration](#configuration)
  - [Proxy](#proxy)
  - [Changing the configuration of an instantiated Service Class](#changing-the-configuration-of-an-instantiated-service-class)
  - [Service Classes](#service-classes)
  - [service.create(Request Object);](#servicecreaterequest-object)
  - [service.get();](#serviceget)
  - [service.getWithParam(Map<String, String> query)](#servicegetwithparammapstring-string-query)
  - [service.getWithParam(String query)](#servicegetwithparamstring-query)
  - [service.getById(String id)](#servicegetbyidstring-id)
  - [service.createAsync(Object); (This is in beta)](#servicecreateasyncobject-this-is-in-beta)
  - [Custom Request Config](#custom-request-config)
  - [Generic Methods available in Service Classes](#generic-methods-available-in-service-classes)
  - [Request Objects](#request-objects)
  - [Response Object](#response-object)
- [Retry Strategy](#retry-strategy)
  - [Rate Limit](#rate-limit)
  - [Retryable Error](#retryable-error)
- [ErrorHandling](#errorhandling)
- [Examples](#examples)
- [Testing](#testing)
- [License](#license)
- [Contributors](#contributors)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

JAVA SDK for Postmen API. For problems and suggestions, please open a GitHub Issue.

## Installation

### Requirements

JVM version >= 1.6.
tested on
 - oraclejdk8
 - openjdk7
 - openjdk6

### Manual Installation
 - Download release from this repository
 - Add to class path

### Using Maven
(no info yet)

### Using Gradle
(no info yet)

### Quickstart
In order to get API key and choose a region refer to the [documentation](https://docs.postmen.com/overview.html).
``` JAVA
// create config
Config config = new ConfigBuilder().setRegion("sandbox").setApiKey(apiKey).build();
// instantiate label service
LabelService service = new LabelService(config);
try {
    // get labels you have already created
    Labels labels = service.get();
    // prints object into the console
    ExampleHelper.printObj(labels);
} catch (IOException e) {
    e.printStackTrace();
}
```
## API References (Link to JavaDocs)
### Configuration
Instantiate a ConfigBuilder class, set options, and then use the build() method.
``` Java
ConfigBuilder cb = new ConfigBuilder();
Config config = cb.set(apiKey).setRetry(false).build();
````
| parameter | explanation                                                      |
|-----------|------------------------------------------------------------------|
| apiKey    | your api key to access Postmen                                   |
| region    | choose which region you are using (sandbox or production)        |
| endpoint  | sets a custom endpoint (ignores version and region if populated) |
| version   | version of the api (used in conjunction with region)             |
| proxyUrl  | Url of the proxy                                                 |
| proxyPort | Port of the proxy (default: 80)                                  |
| retry     | retry if there are errors (default: true)                        |
| rate      | helps you handle the rate limit (default: true)                  |

### Proxy
The sdk only allows defining proxy url and proxy port. If you are using socks proxy, then please check JVM systemwide proxy configuration

### Changing the configuration of an instantiated Service Class
``` Java
Config config = LabelService.getConfig();
config.setProxy("some.proxy.com");
// applies the recent configuration
service.reInitialize();
```
### Service Classes
Instantiate a specific Service Class that will help you process Label, Rate, Manifest, Cancel Label or Address

| Transaction Type          | Service Class      |
|---------------------------|--------------------|
| Label Transactions        | LabelService       |
| Rate Transactions         | RateService        |
| Manifest Transactions     | ManifestService    |
| Cancel Label Transactions | CancelLabelService |
| Address Transactions      | AddressService     |


### service.create(Request Object);
Creates either a label, rate, manifest, cancel label or address validation depending on the instantiate service class

### service.get();
Gets a List of objects you have

### service.getWithParam(Map<String, String> query)
Gets a list of objects you have filtered by a query parameter in a Map

### service.getWithParam(String query)
Gets a list of objects you have filtered by a query string

### service.getById(String id)
Gets an object by Id

### service.createAsync(Object); (This is in beta)
``` Java
Future<LabelResponse> f = service.createAsync(req);
// do other things then retrieve
// remember, .get() is a blocking call
LabelResponse labelResponse = f.get();
Label label = labelResponse.getData();
```
### Custom Request Config
If you want to use a different configuration for a certain request, you can do this:
``` Java
// don't forget to clone, otherwise you might override the existing config
Config newConfig = service.getConfig().clone();
newConfig.setRetry(false);
Service.create(Object, newConfig);
```

### Generic Methods available in Service Classes
callAsMap(String method, String path, Object body)
``` Java
// returns a Map Response, do response.getData() to get the Map Object
MapResponse response = LabelService.callAsMap("GET", "", null);
Map<Object, Object> map = response.getData();
```
callAsRaw(String method, String path, Object body)
``` Java
// returns the raw json string response
String response = LabelService.callAsRaw("GET", "", null);
```

### Request Objects
you have to either pass a Request Object or a JSON Object to the Service class in order to make a request.
There are 4 main Request Objects:
1. LabelRequest
2. RateRequest
3. ManifestRequest
4. CancelLabelRequest
5. AddressRequest

Creating a Label example:
``` Java
LabelRequest req = new LabelRequest();

req.setAsync(false);
req.setServiceType("spsr_intl");

ShipperAccount shipperAccount = new ShipperAccount(getShipperAccount());
req.setShipperAccount(shipperAccount);

Parcel parcel = new Parcel();
parcel.setDescription("Parcel");
parcel.setBoxType("custom");
parcel.setWeight(new Weight(1.5, "kg"));
parcel.setDimension(new Dimension(20, 30, 30, "cm"));

Item item = new Item();
item.setDescription("Food Bar");
item.setOriginCountry("USA");
item.setQuantity(2);

item.setPrice(new Money(50, "USD"));

item.setWeight(new Weight(0.6, "kg"));
item.setSku("Epic_Food_Bar");
item.setHsCode("7877966");

parcel.addItems(item);

Address shipFrom = new Address();
shipFrom.setContactName("Joe Smith");
shipFrom.setCompanyName("Aftership");
shipFrom.setStreet1("bal");
shipFrom.setCity("NT");
shipFrom.setState("HK");
shipFrom.setPostalCode("N/A");
shipFrom.setCountry("HKG");
shipFrom.setPhone("123456789");
shipFrom.setEmail("mail@mail.com");
shipFrom.setType("business");

Address shipTo = new Address();
shipTo.setContactName("Jon Poole");
shipTo.setStreet1("test");
shipTo.setCity("Concord");
shipTo.setState("New Hampshire");
shipTo.setPostalCode("03301");
shipTo.setCountry("RUS");
shipTo.setPhone("12345");
shipTo.setEmail("test@test.com");
shipTo.setType("residential");

Shipment shipment = new Shipment();
shipment.addParcels(parcel);
shipment.setShipFrom(shipFrom);
shipment.setShipTo(shipTo);
req.setShipment(shipment);

Customs customs = new Customs();
customs.setPurpose("gift");
customs.setTermsOfTrade("ddu");
req.setCustoms(customs);

LabelService service = new LabelService(config);
service.create(req);
```

### Response Object
There are also 4 types of Response Objects
1. LabelResponse
2. RateResponse
3. ManifestResponse
4. CancelLabelResponse
5. AddressResponse

``` Java
LabelResponse response = labelService.create(req);
Label label = response.getData();
// label contains your label info
```

## Retry Strategy
### Rate Limit
if you set config.setRate(true), the sdk will help you handle the rate limit.
### Retryable Error
if you set config.setRetry(true), the sdk will help you retry for errors returned by the server.
There will be 5 retries, and then the SDK will throw a PostmenException.
To catch the error:
``` Java
try {
    labelService.create(req);
} catch (PostmenException e) {
    // returns the response of the API server
    Response response = e.getResponse()
    // returns the message
    e.getMessage();
} catch (IOException e1) {

}
```
Remember to catch PostmenException before IOException since PostmenException is a child of IOException.

## ErrorHandling
As long as you set `config.setRetry(true)`, the sdk will help you retry the request for 4 times, each with an increasing delay.

| retry | delay |
|-------|-------|
| 1     | 1s    |
| 2     | 2s    |
| 3     | 4s    |
| 4     | 8s    |

After the 4th retry, the service class will throw PostmenException.
You may choose to catch or not to catch the error since the parent class of PostmenException is IOException.
Available method for PostmenException:

| Method        | Return Trype | Explanation                                                                |
|---------------|--------------|----------------------------------------------------------------------------|
| getCode()     | Integer      | Error code                                                                 |
| isRetryable() | Boolean      | Indicates if error is retryable                                            |
| getMessage()  | String       | Error message (e.g. The request was invalid or cannot be otherwise served) |
| getDetails()  | Array        | Error details (e.g. Destination country must be RUS or KAZ)                |


## Examples
There are 5 example class in com.postmen.javasdk. To run, simple choose an operation and provide your API KEY.

Change the API key in `CredentialHelper`

| File                        | Description                      |
|-----------------------------|----------------------------------|
| RateExample.create()        | rates object creation            |
| RateExample.get()           | rates object(s) retrieve         |
| LabelExample.create()       | labels object creation           |
| LabelExample.get()          | labels object(s) retrieve        |
| ManifestExample.create()    | manifests object creation        |
| ManifestExample.get()       | manifests object(s) retrieve     |
| CancelLabelExample.create() | cancel-labels object creation    |
| CancelLabelExample.get()    | cancel-labels object(s) retrieve |
| AddressExample.create()     | address validation               |

## Testing
if you want to contribute to the SDK, run the automated unit test before making a pull request.
`mvn test`

## License
Released under the MIT license. See the LICENSE file for details.

## Contributors
- Heinrich Chan -
- Kyle Yang -
