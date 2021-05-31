package com.haud.qa.exercise.cucumber.options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/haud/qa/exercise/feature",glue = "com/haud/qa/exercise/stepDefinations",plugin ="html:target/jsonReports/cucumber-report.html")
public class Testrunner {
}
