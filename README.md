# QA Java Test Exercise 

Quality Assurance aim is to provide rigor and validation to the target application. 
The following tasks are about testing a website's _header_ navigation, intended for automated regression testing. 

This project is located [here](https://github.com/haudcpiccinino/qa_java_test_exercise).
Please fork this project if you intend to commit to it.

Please note the last task is optional.

When submitting the project please provide a brief of required tools and how to run the application.

Thank you for trying the test.


## Tasks

1. [Write Test Specification](#1-write-test-specification)
2. [Automated Selenium Test](#2-automated-selenium-test)
3. [Automated API Test](#2-automated-selenium-test)
4. [Unit Tests (optional)](#3-unit-test-optional)


---


## 1. Write Test Specification

Write a test specification to test the _header_ navigation menu of the website [https://www.haud.com](https://www.haud.com).

Choose the format you are most comfortable with. E.g. Excel, Word, LibreOffice, Markdown etc.... 
In the specification include user actions taken, any values used, and important assertions.


## 2. Automated Selenium Test

Use Selenium library to test the specification you have just created. Please note that the application should start from
class `com.haud.qa.exercise.Main` and use class `com.haud.qa.exercise.Log` to report the test result.


## 3. Automated API Test

Use the same Application and any API library to test [Pet Store](https://petstore.swagger.io).
API Reference can be found in [Pet Store](https://petstore.swagger.io)
Test only the following two APIs...

1.  Create Pet
    Test response is successful
2.  Get Pet
    Test response is successful and has the expected _name_ and _ID_ 


### 4. Unit Tests (optional)

Write some unit tests of the script above.
