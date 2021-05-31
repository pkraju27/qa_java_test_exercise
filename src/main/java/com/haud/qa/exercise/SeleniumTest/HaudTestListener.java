package com.haud.qa.exercise.SeleniumTest;

import com.haud.qa.exercise.Log;
import org.testng.ISuite;
import org.testng.ISuiteListener;

public class HaudTestListener implements ISuiteListener {
   @Override
   public void onStart(ISuite suite) {
      Log.info("TestNG suite default output directory = " + suite.getOutputDirectory());
   }

   @Override
   public void onFinish(ISuite suite) {
      Log.info("TestNG invoked methods = " + suite.getAllInvokedMethods());
   }
}
