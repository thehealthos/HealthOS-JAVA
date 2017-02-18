# Getting started

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=HealthOS-Java&workspaceName=HealthOS&projectName=HealthOSLib&rootNamespace=com.example)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=HealthOS-Java&workspaceName=HealthOS&projectName=HealthOSLib&rootNamespace=com.example)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=HealthOS-Java&workspaceName=HealthOS&projectName=HealthOSLib&rootNamespace=com.example)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=HealthOS-Java&workspaceName=HealthOS&projectName=HealthOSLib&rootNamespace=com.example)

## How to Use

The following section explains how to use the HealthOS library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=HealthOS-Java&workspaceName=HealthOS&projectName=HealthOSLib&rootNamespace=com.example)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=HealthOS-Java&workspaceName=HealthOS&projectName=HealthOSLib&rootNamespace=com.example)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=HealthOS-Java&workspaceName=HealthOS&projectName=HealthOSLib&rootNamespace=com.example)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=HealthOS-Java&workspaceName=HealthOS&projectName=HealthOSLib&rootNamespace=com.example)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=HealthOS-Java&workspaceName=HealthOS&projectName=HealthOSLib&rootNamespace=com.example)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *HealthOSLib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=HealthOS-Java&workspaceName=HealthOS&projectName=HealthOSLib&rootNamespace=com.example)

Clicking the ``` Add ``` button will open a dialog where you need to specify HealthOS in ``` Group Id ``` and HealthOSLib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=HealthOS-Java&workspaceName=HealthOS&projectName=HealthOSLib&rootNamespace=com.example)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=HealthOS-Java&workspaceName=HealthOS&projectName=HealthOSLib&rootNamespace=com.example)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *HealthOSLib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| host | TODO: add a description |
| oAuthAccessToken | The OAuth 2.0 access token to be set before API calls |



API client can be initialized as following.

```java
// Initializing Object Mapper for Serialization and Deserialization purposes
public static ObjectMapper mapper = new ObjectMapper()
{
	private static final long serialVersionUID = -174113593500315394L;
	{
		configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}
};

// Configuration parameters and credentials
String host = "host";
String oAuthAccessToken = "oAuthAccessToken"; // The OAuth 2.0 access token to be set before API calls

HealthOSClient client = new HealthOSClient(host, oAuthAccessToken);
```

## Class Reference

### <a name="list_of_controllers"></a>List of Controllers

* [MedicinesController](#medicines_controller)
* [LabTestsController](#lab_tests_controller)
* [GenericsController](#generics_controller)
* [FoodController](#food_controller)
* [ExercisesController](#exercises_controller)
* [DrugInteractionsController](#drug_interactions_controller)
* [DiseasesController](#diseases_controller)
* [ChatController](#chat_controller)
* [AutocompleteController](#autocomplete_controller)
* [AuthenticationController](#authentication_controller)

### <a name="medicines_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.MedicinesController") MedicinesController

#### Get singleton instance

The singleton instance of the ``` MedicinesController ``` class can be accessed from the API Client.

```java
MedicinesController medicines = client.getMedicines();
```

#### <a name="get_manufacturer_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.MedicinesController.getManufacturerAsync") getManufacturerAsync

> Get a manufacturer by its id


```java
void getManufacturerAsync(
        final String manufacturerId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| manufacturerId |  ``` Required ```  | Id of the manufacturer |


#### Example Usage

```java
String manufacturerId = "manufacturer_id";
// Invoking the API call with sample inputs
medicines.getManufacturerAsync(manufacturerId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="search_manufacturers_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.MedicinesController.searchManufacturersAsync") searchManufacturersAsync

> Search a manufacturer by its name


```java
void searchManufacturersAsync(
        final String manufacturerQuery,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| manufacturerQuery |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String manufacturerQuery = "manufacturer_query";
// Invoking the API call with sample inputs
medicines.searchManufacturersAsync(manufacturerQuery, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_common_side_effects_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.MedicinesController.getCommonSideEffectsAsync") getCommonSideEffectsAsync

> Get common side effects of a medicine


```java
void getCommonSideEffectsAsync(
        final String medicineId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| medicineId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String medicineId = "medicine_id";
// Invoking the API call with sample inputs
medicines.getCommonSideEffectsAsync(medicineId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_popular_usage_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.MedicinesController.getPopularUsageAsync") getPopularUsageAsync

> Get popular usages of a medicine


```java
void getPopularUsageAsync(
        final String medicineId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| medicineId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String medicineId = "medicine_id";
// Invoking the API call with sample inputs
medicines.getPopularUsageAsync(medicineId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_medicines_by_manufacturer_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.MedicinesController.getMedicinesByManufacturerAsync") getMedicinesByManufacturerAsync

> Get medicines by a manufacturer


```java
void getMedicinesByManufacturerAsync(
        final int page,
        final int size,
        final String manufacturerId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Required ```  | TODO: Add a parameter description |
| size |  ``` Required ```  | TODO: Add a parameter description |
| manufacturerId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int page = 72;
int size = 72;
String manufacturerId = "manufacturer_id";
// Invoking the API call with sample inputs
medicines.getMedicinesByManufacturerAsync(page, size, manufacturerId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_similar_medicines_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.MedicinesController.getSimilarMedicinesAsync") getSimilarMedicinesAsync

> Get similar medicines


```java
void getSimilarMedicinesAsync(
        final String medicineId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| medicineId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String medicineId = "medicine_id";
// Invoking the API call with sample inputs
medicines.getSimilarMedicinesAsync(medicineId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_medicine_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.MedicinesController.getMedicineAsync") getMedicineAsync

> Get a medicine


```java
void getMedicineAsync(
        final String medicineId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| medicineId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String medicineId = "medicine_id";
// Invoking the API call with sample inputs
medicines.getMedicineAsync(medicineId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_all_medicines_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.MedicinesController.getAllMedicinesAsync") getAllMedicinesAsync

> Get all medicines


```java
void getAllMedicinesAsync(
        final int page,
        final int size,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Required ```  | TODO: Add a parameter description |
| size |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int page = 1;
int size = 10;
// Invoking the API call with sample inputs
medicines.getAllMedicinesAsync(page, size, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="search_medicines_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.MedicinesController.searchMedicinesAsync") searchMedicinesAsync

> Search a medicine by name


```java
void searchMedicinesAsync(
        final String medicineQuery,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| medicineQuery |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String medicineQuery = "medicine_query";
// Invoking the API call with sample inputs
medicines.searchMedicinesAsync(medicineQuery, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_all_manufacturers_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.MedicinesController.getAllManufacturersAsync") getAllManufacturersAsync

> Get all manufacturers


```java
void getAllManufacturersAsync(
        final int page,
        final int size,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Required ```  | TODO: Add a parameter description |
| size |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int page = 1;
int size = 10;
// Invoking the API call with sample inputs
medicines.getAllManufacturersAsync(page, size, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_alternative_medicines_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.MedicinesController.getAlternativeMedicinesAsync") getAlternativeMedicinesAsync

> Get substitutes of a medicine


```java
void getAlternativeMedicinesAsync(
        final int page,
        final int size,
        final String medicineId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Required ```  | TODO: Add a parameter description |
| size |  ``` Required ```  | TODO: Add a parameter description |
| medicineId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int page = 164;
int size = 164;
String medicineId = "medicine_id";
// Invoking the API call with sample inputs
medicines.getAlternativeMedicinesAsync(page, size, medicineId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="lab_tests_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.LabTestsController") LabTestsController

#### Get singleton instance

The singleton instance of the ``` LabTestsController ``` class can be accessed from the API Client.

```java
LabTestsController labTests = client.getLabTests();
```

#### <a name="get_lab_test_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.LabTestsController.getLabTestAsync") getLabTestAsync

> Get labtest by id


```java
void getLabTestAsync(
        final String labTestId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| labTestId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String labTestId = "lab_test_id";
// Invoking the API call with sample inputs
labTests.getLabTestAsync(labTestId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_all_lab_tests_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.LabTestsController.getAllLabTestsAsync") getAllLabTestsAsync

> All Lab tests


```java
void getAllLabTestsAsync(
        final int page,
        final int size,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Required ```  | TODO: Add a parameter description |
| size |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int page = 164;
int size = 164;
// Invoking the API call with sample inputs
labTests.getAllLabTestsAsync(page, size, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="search_lab_tests_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.LabTestsController.searchLabTestsAsync") searchLabTestsAsync

> Search a lab test by name


```java
void searchLabTestsAsync(
        final String labTestQuery,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| labTestQuery |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String labTestQuery = "lab_test_query";
// Invoking the API call with sample inputs
labTests.searchLabTestsAsync(labTestQuery, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="generics_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.GenericsController") GenericsController

#### Get singleton instance

The singleton instance of the ``` GenericsController ``` class can be accessed from the API Client.

```java
GenericsController generics = client.getGenerics();
```

#### <a name="get_generic_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.GenericsController.getGenericAsync") getGenericAsync

> Get a generic by id


```java
void getGenericAsync(
        final String genericId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| genericId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String genericId = "generic_id";
// Invoking the API call with sample inputs
generics.getGenericAsync(genericId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_medicines_by_generic_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.GenericsController.getMedicinesByGenericAsync") getMedicinesByGenericAsync

> Get medicines containing the generic


```java
void getMedicinesByGenericAsync(
        final int page,
        final int size,
        final boolean exclusive,
        final String genericId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Required ```  | TODO: Add a parameter description |
| size |  ``` Required ```  | TODO: Add a parameter description |
| exclusive |  ``` Required ```  | TODO: Add a parameter description |
| genericId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int page = 164;
int size = 164;
boolean exclusive = true;
String genericId = "generic_id";
// Invoking the API call with sample inputs
generics.getMedicinesByGenericAsync(page, size, exclusive, genericId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_all_generics_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.GenericsController.getAllGenericsAsync") getAllGenericsAsync

> All generics


```java
void getAllGenericsAsync(
        final int page,
        final int size,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Required ```  | TODO: Add a parameter description |
| size |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int page = 164;
int size = 164;
// Invoking the API call with sample inputs
generics.getAllGenericsAsync(page, size, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="search_generics_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.GenericsController.searchGenericsAsync") searchGenericsAsync

> Search a generic by name


```java
void searchGenericsAsync(
        final String genericQuery,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| genericQuery |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String genericQuery = "generic_query";
// Invoking the API call with sample inputs
generics.searchGenericsAsync(genericQuery, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="food_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.FoodController") FoodController

#### Get singleton instance

The singleton instance of the ``` FoodController ``` class can be accessed from the API Client.

```java
FoodController food = client.getFood();
```

#### <a name="search_food_restaurants_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.FoodController.searchFoodRestaurantsAsync") searchFoodRestaurantsAsync

> TODO: Add Description


```java
void searchFoodRestaurantsAsync(
        final String foodRestaurantQuery,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| foodRestaurantQuery |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String foodRestaurantQuery = "food_restaurant_query";
// Invoking the API call with sample inputs
food.searchFoodRestaurantsAsync(foodRestaurantQuery, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_all_food_brands_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.FoodController.getAllFoodBrandsAsync") getAllFoodBrandsAsync

> TODO: Add Description


```java
void getAllFoodBrandsAsync(
        final int page,
        final int size,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Required ```  | TODO: Add a parameter description |
| size |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int page = 1;
int size = 10;
// Invoking the API call with sample inputs
food.getAllFoodBrandsAsync(page, size, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_food_items_by_restaurant_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.FoodController.getFoodItemsByRestaurantAsync") getFoodItemsByRestaurantAsync

> TODO: Add Description


```java
void getFoodItemsByRestaurantAsync(
        final int page,
        final int size,
        final String foodRestaurantId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Required ```  | TODO: Add a parameter description |
| size |  ``` Required ```  | TODO: Add a parameter description |
| foodRestaurantId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int page = 164;
int size = 164;
String foodRestaurantId = "food_restaurant_id";
// Invoking the API call with sample inputs
food.getFoodItemsByRestaurantAsync(page, size, foodRestaurantId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="search_food_brands_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.FoodController.searchFoodBrandsAsync") searchFoodBrandsAsync

> TODO: Add Description


```java
void searchFoodBrandsAsync(
        final String foodBrandQuery,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| foodBrandQuery |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String foodBrandQuery = "food_brand_query";
// Invoking the API call with sample inputs
food.searchFoodBrandsAsync(foodBrandQuery, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_food_item_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.FoodController.getFoodItemAsync") getFoodItemAsync

> TODO: Add Description


```java
void getFoodItemAsync(
        final String foodItemId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| foodItemId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String foodItemId = "food_item_id";
// Invoking the API call with sample inputs
food.getFoodItemAsync(foodItemId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_all_food_items_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.FoodController.getAllFoodItemsAsync") getAllFoodItemsAsync

> TODO: Add Description


```java
void getAllFoodItemsAsync(
        final int page,
        final int size,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Required ```  | TODO: Add a parameter description |
| size |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int page = 164;
int size = 164;
// Invoking the API call with sample inputs
food.getAllFoodItemsAsync(page, size, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="search_food_items_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.FoodController.searchFoodItemsAsync") searchFoodItemsAsync

> TODO: Add Description


```java
void searchFoodItemsAsync(
        final String foodItemQuery,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| foodItemQuery |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String foodItemQuery = "food_item_query";
// Invoking the API call with sample inputs
food.searchFoodItemsAsync(foodItemQuery, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_all_food_restaurants_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.FoodController.getAllFoodRestaurantsAsync") getAllFoodRestaurantsAsync

> TODO: Add Description


```java
void getAllFoodRestaurantsAsync(
        final int page,
        final int size,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Required ```  | TODO: Add a parameter description |
| size |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int page = 1;
int size = 10;
// Invoking the API call with sample inputs
food.getAllFoodRestaurantsAsync(page, size, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_food_items_by_brand_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.FoodController.getFoodItemsByBrandAsync") getFoodItemsByBrandAsync

> TODO: Add Description


```java
void getFoodItemsByBrandAsync(
        final int page,
        final int size,
        final String foodBrandId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Required ```  | TODO: Add a parameter description |
| size |  ``` Required ```  | TODO: Add a parameter description |
| foodBrandId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int page = 164;
int size = 164;
String foodBrandId = "food_brand_id";
// Invoking the API call with sample inputs
food.getFoodItemsByBrandAsync(page, size, foodBrandId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="exercises_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.ExercisesController") ExercisesController

#### Get singleton instance

The singleton instance of the ``` ExercisesController ``` class can be accessed from the API Client.

```java
ExercisesController exercises = client.getExercises();
```

#### <a name="get_exercise_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.ExercisesController.getExerciseAsync") getExerciseAsync

> TODO: Add Description


```java
void getExerciseAsync(
        final String exerciseId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| exerciseId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String exerciseId = "exercise_id";
// Invoking the API call with sample inputs
exercises.getExerciseAsync(exerciseId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_all_exercises_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.ExercisesController.getAllExercisesAsync") getAllExercisesAsync

> TODO: Add Description


```java
void getAllExercisesAsync(
        final int page,
        final int size,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Required ```  | TODO: Add a parameter description |
| size |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int page = 1;
int size = 10;
// Invoking the API call with sample inputs
exercises.getAllExercisesAsync(page, size, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="search_exercises_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.ExercisesController.searchExercisesAsync") searchExercisesAsync

> TODO: Add Description


```java
void searchExercisesAsync(
        final String exerciseQuery,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| exerciseQuery |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String exerciseQuery = "exercise_query";
// Invoking the API call with sample inputs
exercises.searchExercisesAsync(exerciseQuery, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="drug_interactions_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.DrugInteractionsController") DrugInteractionsController

#### Get singleton instance

The singleton instance of the ``` DrugInteractionsController ``` class can be accessed from the API Client.

```java
DrugInteractionsController drugInteractions = client.getDrugInteractions();
```

#### <a name="get_generics_interactions_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.DrugInteractionsController.getGenericsInteractionsAsync") getGenericsInteractionsAsync

> TODO: Add Description


```java
void getGenericsInteractionsAsync(
        final String genericId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| genericId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String genericId = "generic_id";
// Invoking the API call with sample inputs
drugInteractions.getGenericsInteractionsAsync(genericId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_medicine_interactions_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.DrugInteractionsController.getMedicineInteractionsAsync") getMedicineInteractionsAsync

> TODO: Add Description


```java
void getMedicineInteractionsAsync(
        final String medicineId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| medicineId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String medicineId = "medicine_id";
// Invoking the API call with sample inputs
drugInteractions.getMedicineInteractionsAsync(medicineId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="diseases_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.DiseasesController") DiseasesController

#### Get singleton instance

The singleton instance of the ``` DiseasesController ``` class can be accessed from the API Client.

```java
DiseasesController diseases = client.getDiseases();
```

#### <a name="get_disease_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.DiseasesController.getDiseaseAsync") getDiseaseAsync

> TODO: Add Description


```java
void getDiseaseAsync(
        final String diseaseId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| diseaseId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String diseaseId = "disease_id";
// Invoking the API call with sample inputs
diseases.getDiseaseAsync(diseaseId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_all_diseases_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.DiseasesController.getAllDiseasesAsync") getAllDiseasesAsync

> TODO: Add Description


```java
void getAllDiseasesAsync(
        final int page,
        final int size,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Required ```  | TODO: Add a parameter description |
| size |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int page = 1;
int size = 10;
// Invoking the API call with sample inputs
diseases.getAllDiseasesAsync(page, size, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="search_diseases_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.DiseasesController.searchDiseasesAsync") searchDiseasesAsync

> TODO: Add Description


```java
void searchDiseasesAsync(
        final String diseaseQuery,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| diseaseQuery |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String diseaseQuery = "disease_query";
// Invoking the API call with sample inputs
diseases.searchDiseasesAsync(diseaseQuery, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="chat_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.ChatController") ChatController

#### Get singleton instance

The singleton instance of the ``` ChatController ``` class can be accessed from the API Client.

```java
ChatController chat = client.getChat();
```

#### <a name="get_excercises_chat_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.ChatController.getExcercisesChatAsync") getExcercisesChatAsync

> TODO: Add Description


```java
void getExcercisesChatAsync(final APICallBack<DynamicResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
chat.getExcercisesChatAsync(new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_food_items_chat_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.ChatController.getFoodItemsChatAsync") getFoodItemsChatAsync

> TODO: Add Description


```java
void getFoodItemsChatAsync(final APICallBack<DynamicResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
chat.getFoodItemsChatAsync(new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_medicine_chat_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.ChatController.getMedicineChatAsync") getMedicineChatAsync

> TODO: Add Description


```java
void getMedicineChatAsync(final APICallBack<DynamicResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
chat.getMedicineChatAsync(new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="autocomplete_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.AutocompleteController") AutocompleteController

#### Get singleton instance

The singleton instance of the ``` AutocompleteController ``` class can be accessed from the API Client.

```java
AutocompleteController autocomplete = client.getAutocomplete();
```

#### <a name="get_exercises_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.AutocompleteController.getExercisesAsync") getExercisesAsync

> TODO: Add Description


```java
void getExercisesAsync(
        final String exerciseQuery,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| exerciseQuery |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String exerciseQuery = "exercise_query";
// Invoking the API call with sample inputs
autocomplete.getExercisesAsync(exerciseQuery, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_diseases_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.AutocompleteController.getDiseasesAsync") getDiseasesAsync

> TODO: Add Description


```java
void getDiseasesAsync(
        final String diseaseQuery,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| diseaseQuery |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String diseaseQuery = "disease_query";
// Invoking the API call with sample inputs
autocomplete.getDiseasesAsync(diseaseQuery, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_lab_tests_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.AutocompleteController.getLabTestsAsync") getLabTestsAsync

> TODO: Add Description


```java
void getLabTestsAsync(
        final String labTestQuery,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| labTestQuery |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String labTestQuery = "lab_test_query";
// Invoking the API call with sample inputs
autocomplete.getLabTestsAsync(labTestQuery, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_food_items_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.AutocompleteController.getFoodItemsAsync") getFoodItemsAsync

> TODO: Add Description


```java
void getFoodItemsAsync(
        final String foodItemQuery,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| foodItemQuery |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String foodItemQuery = "food_item_query";
// Invoking the API call with sample inputs
autocomplete.getFoodItemsAsync(foodItemQuery, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_generics_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.AutocompleteController.getGenericsAsync") getGenericsAsync

> TODO: Add Description


```java
void getGenericsAsync(
        final String genericQuery,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| genericQuery |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String genericQuery = "generic_query";
// Invoking the API call with sample inputs
autocomplete.getGenericsAsync(genericQuery, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_medicines_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.AutocompleteController.getMedicinesAsync") getMedicinesAsync

> TODO: Add Description


```java
void getMedicinesAsync(
        final String medicineQuery,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| medicineQuery |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String medicineQuery = "medicine_query";
// Invoking the API call with sample inputs
autocomplete.getMedicinesAsync(medicineQuery, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="authentication_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.AuthenticationController") AuthenticationController

#### Get singleton instance

The singleton instance of the ``` AuthenticationController ``` class can be accessed from the API Client.

```java
AuthenticationController authentication = client.getAuthentication();
```

#### <a name="create_request_access_token_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.AuthenticationController.createRequestAccessTokenAsync") createRequestAccessTokenAsync

> *Tags:*  ``` Skips Authentication ``` 

> TODO: Add Description


```java
void createRequestAccessTokenAsync(
        final RequestAccessTokenRequest body,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String bodyValue = "{\n  \"grant_type\": \"client_credentials\",\n  \"client_id\": \"{{client_id}}\",\n  \"client_secret\": \"{{client_secret}}\",\n  \"scope\": \"public read write\"\n}";
    RequestAccessTokenRequest body = mapper.readValue(bodyValue,new TypeReference<RequestAccessTokenRequest> (){});
    // Invoking the API call with sample inputs
    authentication.createRequestAccessTokenAsync(body, new APICallBack<DynamicResponse>() {
        public void onSuccess(HttpContext context, DynamicResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized |



[Back to List of Controllers](#list_of_controllers)



