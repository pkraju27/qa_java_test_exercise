# [QA Java Test Exercise Submission](https://github.com/pkraju27/qa_java_test_exercise)

##Objective

The Quality Assurance team's main aim is to provide rigor and validation to the target application.
The following tasks are about testing a website's _header_ navigation and the test is intended for automated regression testing.

Please either download or fork this project to start working on this test. Also please note that the last task is optional.

When submitting the project please provide a summary of the required tools to run the application.

Thank you for trying the test.


## Tasks

1. [Write Test Specification](#1-write-test-specification)
2. [Automated Selenium Test](#2-automated-selenium-test)
3. [Automated API Test](#3-automated-API-test)



---


## 1. Write Test Specification - Solution

Test Specification added for Haud home page navigation menu. Test case document created in google sheets and document link can be found [here](https://docs.google.com/spreadsheets/d/11Ewn33zfWBUK8JJuR1nzduQ83bPuc5zhJ7mlUBvbAw0/edit#gid=0)


## 2. Automated Selenium Test - Solution

### How to run 
<li> Execute class <i>com.haud.qa.exercise.Main</i>
<li> Test report can be found in <i>com/haud/qa/exercise/SeleniumTest/Results</i>

### Configuration
<li> <i>main.propperties</i> file is used for configuration
<li> Default browser choses is Chrome. Firefox is also supported
<li> By default latest version of chrome browser is supported. browser version can be changed in properies file to match local browser version

### Tools used 
<li> webdrivermanager library is used to manage driver
<li> TestNg framework is used for running test and generating test reports
<li> <i>com.haud.qa.exercise.Log</i> class is used to log the events 

## 3. Automated API Test - Solution

API library to test [Pet Store](https://petstore.swagger.io).

###How to run
<li> <i>mvn clean test</i>
<br> or
<li> run <i>src/test/java/com/haud/qa/exercise/cucumber/options/Testrunner.java</i> class directly

### Tools used
<li> Cucumber with Junit libraries has been used to automate the test
<li> <i>src/test/java/com/haud/qa/exercise/feature/petStore.feature</i> file is used to define Feaute and scenario
<li> Cucumber html reports is used for reporting. Reports can be found <i>target/jsonReports/cucumber-report.html</i>
<li> Logs can be found in logging.log file 

### Config files
<li> <i>ApiTest.properties</i> file is used to set BaseURL and apiKey properties
<li> Default connection time out is set to 60 secs



