# UI Test 
Selenide, Java, TestNG

## Install
First of all you need to install Maven, Git and Java (13)
https://maven.apache.org/install.html
Open project in IntelliJ Idea as a Maven project and Install "lombok" plugin.


## Run Default suite
```
mvn test -PDefault
```
## Run test separately
```
mvn test -Dtest=CheckTextOnThePageAndReturnToHomePageTest test

## Run test locally
```
Clone the project, right click on default.xml file and chose "Run" (suite will be run).

Screenshots with failed tests are saved on test-result/reports folder in the src of project.