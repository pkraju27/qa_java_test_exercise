package com.haud.qa.exercise.SeleniumTest;

import Driver.DriverFactory;
import com.haud.qa.exercise.PageObjects.HaudHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HaudHeaderNavigationTest {
   WebDriver driver;
   HaudHomePage homePage;

   @BeforeClass
   public void setup() {
      driver = new DriverFactory().getDriver();
      homePage = new HaudHomePage(driver);
   }

   @AfterClass
   public void teardown() {
      driver.quit();
   }

   @Test
   public void pageLoadTest() {
      homePage.getHeaderNav().clickLogo();
   }
}
