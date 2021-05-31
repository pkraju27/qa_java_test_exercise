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
      testSuite.addListener(new HaudTestListener());
      testSuite.setDefaultSuiteName("Haud");
      testSuite.setParallel(XmlSuite.ParallelMode.TESTS);
      testSuite.setThreadCount(4);
      testSuite.getReporters();
      if (GetProperty.PLATFORM.equalsIgnoreCase("Desktop"))
         testSuite.setTestClasses(new Class[]{DTHaudHeaderNavigationTest.class});
      else
         testSuite.setTestClasses(new Class[]{MWHaudHeaderNavigationTest.class});
      testSuite.setOutputDirectory("src/main/java/com/haud/qa/exercise/SeleniumTest/Results/"+GetProperty.PLATFORM);
      testSuite.setDefaultTestName(GetProperty.PLATFORM);
      testSuite.run();
      Log.info("Test execution completed, find test results here : " + testSuite.getOutputDirectory());
   }
}
