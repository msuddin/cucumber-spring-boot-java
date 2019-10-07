# Sample Java Automation Framework
## Purpose of this project
Firstly...
A FRAMEWORK IS NOT THE SOLUTION TO EVERY PROJECT THAT NEEDS AN AUTOMATION SOLUTION - YOU NEED TO UNDERSTAND THE PROBLEM FIRST
ONCE YOU KNOW WHAT THE PROBLEM IS AND WHAT THE REQUIREMENTS ARE, BUILD THE SOLUTION
### Purpose
* Build a simple web application that does some simple online form submission using SpringBoot
* Write tests using plain Java (using RestTestTemplate where needed) and Cucumber
* Incorporate Design Patterns where needed (Page Object, Singleton, Facade)
## Instructions 
### Running via terminal
We need to firstly build the jar locally. Whilst in the root directory of the project run the following (this also run's tests):
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