package com.haud.qa.exercise;

import com.haud.qa.exercise.SeleniumTest.HaudHeaderNavigationTest;
import com.haud.qa.exercise.SeleniumTest.HaudTestListener;
import org.testng.TestNG;

public class Main {
   public static void main(String[] args) {
      TestNG testSuite = new TestNG();
      testSuite.setTestClasses(new Class[]{HaudHeaderNavigationTest.class});
      testSuite.addListener(new HaudTestListener());
      testSuite.setDefaultSuiteName("My Test Suite");
      testSuite.setDefaultTestName("My Test");
      testSuite.setOutputDirectory("src/main/java/com/haud/qa/exercise/SeleniumTest/Results");
      testSuite.getReporters();
      testSuite.run();
   }
}
