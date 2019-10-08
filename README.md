# Sample Cucumber Spring Boot Java

## Purpose of this project

### Purpose
* A simple application that has only one endpoint and returns a path variable from the url
* A test using RestTestTemplate and Sprint Boot
* A test using Cucumber with Spring Boot

## Instructions 
### Running via terminal
Firstly need to build the jar locally.
Whilst in the root directory of the project run the following (this also run's unit and cucumber tests):
```
./gradlew clean build
```
Now run the following command from the root directory:
```
java -jar build/lib/*jar
```

### Testing to see if Application is Running
In a terminal, run the following command:
```
curl http://localhost:8080/hi/mo
```
This should return:
```
hi mo
```