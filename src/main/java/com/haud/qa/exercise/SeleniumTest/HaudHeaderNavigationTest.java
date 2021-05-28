package com.haud.qa.exercise.SeleniumTest;

import Driver.DriverFactory;
import com.haud.qa.exercise.Log;
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

   @Test
   public void test_HomeLink() {
      homePage.getHeaderNav().clickHome();
   }

   @Test
   public void test_KnowledgeCenterLink() {
      homePage.getHeaderNav().clickKnowledgeCenter();
   }

   @Test
   public void test_TrendingTopicsLink() {
      homePage.getHeaderNav().clickTrendingTopics();
   }

   @Test
   public void test_ContactLink() {
      homePage.getHeaderNav().clickContact();
   }

   @Test
   public void test_HaudSolutionsLink() {
      homePage.getHeaderNav().clickHaudSolutons();
   }

   @Test
   public void test_AboutHaudLink() {
      homePage.getHeaderNav().clickAbout();
   }
}
