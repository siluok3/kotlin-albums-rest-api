# Photo Albums REST API
The Photo Album API is a Spring Boot application developed 
in Kotlin that interacts with the [JSONPlaceholder API](https://jsonplaceholder.typicode.com/) to retrieve photo album data. 
It provides 2 GET endpoints to access information about albums and their associated photos.

## Endpoints
#### Get All Albums - Retrieves a list of all albums.

```
Endpoint: /api/albums
HTTP Method: GET
Response: JSON array containing album information
```
#### Get Photos By Album Id - Retrieves a list of photos associated with a specific album.
```
Endpoint: /api/photos/{albumId}
HTTP Method: GET
Path Variable: albumId - ID of the album
Response: JSON array containing photo information
```

### Accessing Swagger UI
The API documentation is available through the Swagger UI interface, allowing you to explore and interact with the available endpoints.

**URL**: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

**Instructions**: Navigate to the Swagger UI URL in your browser to view and test the available API endpoints.

## Running the Application
Clone this repository to your local machine from the public [github repository](https://github.com/siluok3/kotlin-albums-rest-api)
and make sure you have Java version 17 and Gradle installed.
Open a terminal and navigate to the project directory.
Run the application using the following command:

```
./gradlew bootRun
```

Once the application is running, you can access the API endpoints (via Postman for example) and the Swagger UI as described above.

## Testing

Unit tests have been implemented for the service layer using JUnit and Mockito. To run the tests, use the following command:

```
./gradlew test
```