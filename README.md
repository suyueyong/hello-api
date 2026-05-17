# Hello API

Simple Spring Boot API with controller and service layers.

## Endpoint

```http
GET /hello
```

Response:

```json
{"message":"Hello"}
```

## Requirements

- JDK 17+
- Maven

## Run

```sh
mvn spring-boot:run
```

Then call:

```sh
curl http://localhost:8080/hello
```

## Build

```sh
mvn package
java -jar target/hello-api-1.0.0.jar
```
