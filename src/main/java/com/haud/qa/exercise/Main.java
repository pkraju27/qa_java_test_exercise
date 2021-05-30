package com.haud.qa.exercise;

import Util.GetProperty;
import com.haud.qa.exercise.SeleniumTest.Desktop.DTHaudHeaderNavigationTest;
import com.haud.qa.exercise.SeleniumTest.HaudTestListener;
import com.haud.qa.exercise.SeleniumTest.Mobile.MWHaudHeaderNavigationTest;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

public class Main {
   public static void main(String[] args) {
      TestNG testSuite = new TestNG();
      if (GetProperty.PLATFORM.equalsIgnoreCase("Desktop"))
         testSuite.setTestClasses(new Class[]{DTHaudHeaderNavigationTest.class});
      else
         testSuite.setTestClasses(new Class[]{MWHaudHeaderNavigationTest.class});
      testSuite.addListener(new HaudTestListener());
      testSuite.setDefaultSuiteName("My Test Suite");
      testSuite.setDefaultTestName("My Test");
      testSuite.setParallel(XmlSuite.ParallelMode.NONE);
      testSuite.setOutputDirectory("src/main/java/com/haud/qa/exercise/SeleniumTest/Results");
      testSuite.getReporters();
      testSuite.run();
      Log.info("Test execution completed, find test results here : " + testSuite.getOutputDirectory());
   }
}
