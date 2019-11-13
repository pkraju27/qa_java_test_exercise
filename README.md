# Automated Test 2019 Exercise 
Java application exercise to test multiple interfaces in one scenario.

## Requirements
1. [Java 11](https://maven.apache.org/download.cgi)
2. [Maven v3+](https://maven.apache.org/download.cgi)

## Getting Started
The application should start from `com.haud.qa.exercise.autotest2019.Main` class.
Create all the necessary classes to write the following tests.
Use `com.haud.qa.exercise.autotest2019.Log` class to report the test result.

---

## 1. Automated Selenium test
Use Selenium library to test the Header menu of website [https://www.haud.com](https://www.haud.com). Test only the visible links are not broken. i.e.:

1. link _Home_ redirects to [/](https://haud.com/);
2. link _Products and services_ redirects to [/products-and-services](https://haud.com/products-and-services);
3. link _Knowledge Centre_ to [/knowledge-centre](https://haud.com/knowledge-centre)
4. link _About Haud_ to [/about-haud](https://haud.com/about-haud)
5. link _Careers_ to [/blog/category/careers](https://haud.com/blog/category/careers)
6. link _Blog_ to [/blog](https://haud.com/blog);
7. link _Contact us_ to [/contact-us](https://haud.com/contact-us)

## 2. Write Test Case

Write a complete _test case_ to test the Header menu of website [https://www.haud.com](https://www.haud.com) for manual regression testing. 

Choose the format you are most comfortable with. e.g. Excel, Word, LibreOffice, Markdown etc...


## 3. Automated API test

Use [RestAssured](http://rest-assured.io) library to test [Pet Store](https://petstore.swagger.io) for the following two APIs:

1. create Pet. Name and ID are not important;
2. get Pet;
3. test Pet payload has the expected name and ID.

API Reference can be found in [Pet Store](https://petstore.swagger.io)

Use the API libraries you are most familiar with. 


## 4. Optional

Write some unit tests.
