package com.haud.qa.exercise.SeleniumTest.Desktop;

import Driver.DriverFactory;
import Util.TestVerificationData;
import Util.DriverHelper;
import com.haud.qa.exercise.Log;
import com.haud.qa.exercise.PageObjects.HaudHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

@Test
public class DTHaudHeaderNavigationTest {
   WebDriver driver;
   HaudHomePage homePage;
   DriverHelper driverHelper;


   @BeforeClass
   public void setup() {
      driver = new DriverFactory().getDriver();
      homePage = new HaudHomePage(driver);
      driverHelper = new DriverHelper(driver);
   }

   @AfterClass
   public void teardown() {
      driver.quit();
   }


   @Test(priority = 1)
   public void test_LogoClick() {
      homePage.getHeaderNav().clickLogo();
      Log.info("Logoclicked");
      Assert.assertTrue(homePage.getHeaderNav().verifyPageTitle(driver, TestVerificationData.getPageTitleList().get("logo"))
         , "Page title doesn't match");
      Log.info("Page title matched");
      Assert.assertTrue(homePage.getHeaderNav().verifyCurrentURL(driver, TestVerificationData.getPageURLList().get("logo"))
         , "Page url not matching");
      Log.info("Page url matched");
   }

   @Test(priority = 2)
   public void test_HomeLink() {
      homePage.getHeaderNav().clickHome();
      driverHelper.waitForPageLoad();
      Log.info("Home link clicked");
      Assert.assertTrue(homePage.getHeaderNav().verifyPageTitle(driver, TestVerificationData.getPageTitleList().get("home"))
         , "Page title doesn't match");
      Log.info("Page title matched");
      Assert.assertTrue(homePage.getHeaderNav().verifyCurrentURL(driver, TestVerificationData.getPageURLList().get("home"))
         , "Page url not matching");
      Log.info("Page url matched");

   }

   @Test(priority = 3)
   public void test_KnowledgeCenterLink() {
      homePage.getHeaderNav().clickKnowledgeCenter();
      driverHelper.waitForPageLoad();
      Log.info("Home link clicked");
      Assert.assertTrue(homePage.getHeaderNav().verifyPageTitle(driver, TestVerificationData.getPageTitleList().get("Knowledge center"))
         , "Page title doesn't match");
      Log.info("Page title matched");
      Assert.assertTrue(homePage.getHeaderNav().verifyCurrentURL(driver, TestVerificationData.getPageURLList().get("Knowledge center"))
         , "Page url not matching");
      Log.info("Page url matched");

   }

   @Test(priority = 4)
   public void test_TrendingTopicsLink() {
      homePage.getHeaderNav().clickTrendingTopics();
      driverHelper.waitForPageLoad();
      Log.info("Home link clicked");
      Assert.assertTrue(homePage.getHeaderNav().verifyPageTitle(driver, TestVerificationData.getPageTitleList().get("Trending Topics"))
         , "Page title doesn't match");
      Log.info("Page title matched");
      Assert.assertTrue(homePage.getHeaderNav().verifyCurrentURL(driver, TestVerificationData.getPageURLList().get("Trending Topics"))
         , "Page url not matching");
      Log.info("Page url matched");

   }

   @Test(priority = 5)
   public void test_ContactLink() {
      homePage.getHeaderNav().clickContact();
      driverHelper.waitForPageLoad();
      Log.info("Contact us clicked");
      Assert.assertTrue(homePage.getHeaderNav().verifyPageTitle(driver, TestVerificationData.getPageTitleList().get("Contact Us"))
         , "Page title doesn't match");
      Log.info("Page title matched");
      Assert.assertTrue(homePage.getHeaderNav().verifyCurrentURL(driver, TestVerificationData.getPageURLList().get("Contact Us"))
         , "Page url not matching");
      Log.info("Page url matched");
   }

   @Test(priority = 6)
   public void test_HaudSolutionsLink() {
      homePage.getHeaderNav().clickHaudSolutons();
      driverHelper.waitForPageLoad();
      Log.info("Home link clicked");
      Assert.assertTrue(homePage.getHeaderNav().verifyPageTitle(driver, TestVerificationData.getPageTitleList().get("Haud solutions"))
         , "Page title doesn't match");
      Log.info("Page title matched");
      Assert.assertTrue(homePage.getHeaderNav().verifyCurrentURL(driver, TestVerificationData.getPageURLList().get("Haud solutions"))
         , "Page url not matching");
      Log.info("Page url matched");
      Log.info("Haud Solutions drop down menu verification");
      driverHelper.moveCursorOverElement(homePage.getHeaderNav().getHaudSolutonsLink());
      Assert.assertTrue(homePage.getHeaderNav().isHaudSolutionsDropDownMatch(TestVerificationData.haudSolutionsDropDownMenuList())
         , "Dropdown link doesn't match");
   }


   @Test(priority = 7)
   public void test_SmartXchangeLink() {
      Log.info("SmartXchange Link verification");
      driverHelper.moveCursorOverElement(homePage.getHeaderNav().getHaudSolutonsLink());
      homePage.getHeaderNav().getSmartXchange().click();
      driverHelper.waitForPageLoad();
      Log.info("SmartXChange link clicked");
      Assert.assertTrue(homePage.getHeaderNav().verifyPageTitle(driver, TestVerificationData.getPageTitleList().get("Smart Xchange"))
         , "Page title doesn't match");
      Log.info("Page title matched");
      Assert.assertTrue(homePage.getHeaderNav().verifyCurrentURL(driver, TestVerificationData.getPageURLList().get("Smart Xchange"))
         , "Page url not matching");
      Log.info("Page url matched");
   }

   @Test(priority = 8)
   public void test_SmartNForceLink() {

      Log.info("Smart Nforce Link verification");
      driverHelper.moveCursorOverElement(homePage.getHeaderNav().getHaudSolutonsLink());
      homePage.getHeaderNav().getSmartNForce().click();
      driverHelper.waitForPageLoad();
      Log.info("Smart Nforce link clicked");
      Assert.assertTrue(homePage.getHeaderNav().verifyPageTitle(driver, TestVerificationData.getPageTitleList().get("Smart NForce"))
         , "Page title doesn't match");
      Log.info("Page title matched");
      Assert.assertTrue(homePage.getHeaderNav().verifyCurrentURL(driver, TestVerificationData.getPageURLList().get("Smart NForce"))
         , "Page url not matching");
      Log.info("Page url matched");
   }

   @Test(priority = 9)
   public void test_SmartChargeLink() {

      Log.info("Smart charge Link verification");
      driverHelper.moveCursorOverElement(homePage.getHeaderNav().getHaudSolutonsLink());
      homePage.getHeaderNav().getSmartCharge().click();
      driverHelper.waitForPageLoad();
      Assert.assertTrue(homePage.getHeaderNav().verifyCurrentURL(driver, TestVerificationData.getPageURLList().get("Smart Charge"))
         , "Page url not matching");
      Log.info("Page url matched");
      Log.info("Smart charge link clicked");
      Assert.assertTrue(homePage.getHeaderNav().verifyPageTitle(driver, TestVerificationData.getPageTitleList().get("Smart Charge"))
         , "Page title doesn't match");
      Log.info("Page title matched");

   }

   @Test(priority = 10)
   public void test_SmartEnabledLink() {
      Log.info("Smart Enabled Link verification");
      driverHelper.moveCursorOverElement(homePage.getHeaderNav().getHaudSolutonsLink());
      homePage.getHeaderNav().getSmartEnabled().click();
      driverHelper.waitForPageLoad();
      Log.info("Smart Enabled link clicked");
      Assert.assertTrue(homePage.getHeaderNav().verifyPageTitle(driver, TestVerificationData.getPageTitleList().get("Smart Enable"))
         , "Page title doesn't match");
      Log.info("Page title matched");
      Assert.assertTrue(homePage.getHeaderNav().verifyCurrentURL(driver, TestVerificationData.getPageURLList().get("Smart Enable"))
         , "Page url not matching");
      Log.info("Page url matched");
   }

   @Test(priority = 11)
   public void test_SmartNvisionLink() {

      Log.info("Smart Nvision Link verification");
      driverHelper.moveCursorOverElement(homePage.getHeaderNav().getHaudSolutonsLink());
      homePage.getHeaderNav().getSmartNvision().click();
      driverHelper.waitForPageLoad();
      Log.info("Smart Nvision link clicked");
      Assert.assertTrue(homePage.getHeaderNav().verifyPageTitle(driver, TestVerificationData.getPageTitleList().get("Smart Nvision"))
         , "Page title doesn't match");
      Log.info("Page title matched");
      Assert.assertTrue(homePage.getHeaderNav().verifyCurrentURL(driver, TestVerificationData.getPageURLList().get("Smart Nvision"))
         , "Page url not matching");
      Log.info("Page url matched");
   }

   @Test(priority = 12)
   public void test_SmartBidLink() {
      Log.info("Smart BidLink verification");
      driverHelper.moveCursorOverElement(homePage.getHeaderNav().getHaudSolutonsLink());
      homePage.getHeaderNav().getSmartBid().click();
      driverHelper.waitForPageLoad();
      Log.info("Smart Bid link clicked");
      Assert.assertTrue(homePage.getHeaderNav().verifyPageTitle(driver, TestVerificationData.getPageTitleList().get("Smart Bid"))
         , "Page title doesn't match");
      Log.info("Page title matched");
      Assert.assertTrue(homePage.getHeaderNav().verifyCurrentURL(driver, TestVerificationData.getPageURLList().get("Smart Bid"))
         , "Page url not matching");
      Log.info("Page url matched");
   }

   @Test(priority = 13)
   public void test_AboutHaudLink() {
      homePage.getHeaderNav().clickAbout();
      driverHelper.waitForPageLoad();
      Log.info("Home link clicked");
      Assert.assertTrue(homePage.getHeaderNav().verifyPageTitle(driver, TestVerificationData.getPageTitleList().get("About Haud"))
         , "Page title doesn't match");
      Log.info("Page title matched");
      Assert.assertTrue(homePage.getHeaderNav().verifyCurrentURL(driver, TestVerificationData.getPageURLList().get("About Haud"))
         , "Page url not matching");
      Log.info("Page url matched");

   }

   @Test(priority = 14)
   public void test_AboutUsMenu() {
      Log.info("About us drop down menu verification");
      driverHelper.moveCursorOverElement(homePage.getHeaderNav().getAboutLink());
      Assert.assertTrue(homePage.getHeaderNav().isAboutUsDropDownMatch(TestVerificationData.aboutUsDropDownMenuList())
         , "Dropdown link doesn't match");
   }

   @Test(priority = 15)
   public void test_CompanyLink() {
      Log.info("Smart BidLink verification");
      driverHelper.moveCursorOverElement(homePage.getHeaderNav().getAboutLink());
      homePage.getHeaderNav().getCompany().click();
      driverHelper.waitForPageLoad();
      Log.info("Company link clicked");
      Assert.assertTrue(homePage.getHeaderNav().verifyPageTitle(driver, TestVerificationData.getPageTitleList().get("The Company"))
         , "Page title doesn't match");
      Log.info("Page title matched");
      Assert.assertTrue(homePage.getHeaderNav().verifyCurrentURL(driver, TestVerificationData.getPageURLList().get("The Company"))
         , "Page url not matching");
      Log.info("Page url matched");
   }

   @Test(priority = 16)
   public void test_MeetTeamLink() {
      Log.info("Smart BidLink verification");
      driverHelper.moveCursorOverElement(homePage.getHeaderNav().getAboutLink());
      homePage.getHeaderNav().getMeetTheTeam().click();
      driverHelper.waitForPageLoad();
      Log.info("Meet the team clicked");
      Assert.assertTrue(homePage.getHeaderNav().verifyPageTitle(driver, TestVerificationData.getPageTitleList().get("Meet the team"))
         , "Page title doesn't match");
      Log.info("Page title matched");
      Assert.assertTrue(homePage.getHeaderNav().verifyCurrentURL(driver, TestVerificationData.getPageURLList().get("Meet the team"))
         , "Page url not matching");
      Log.info("Page url matched");
   }

   @Test(priority = 17)
   public void test_CareersLink() {
      Log.info("Smart BidLink verification");
      driverHelper.moveCursorOverElement(homePage.getHeaderNav().getAboutLink());
      homePage.getHeaderNav().getCareers().click();
      driverHelper.waitForPageLoad();
      Log.info("Meet the team clicked");
      Assert.assertTrue(homePage.getHeaderNav().verifyPageTitle(driver, TestVerificationData.getPageTitleList().get("Careers"))
         , "Page title doesn't match");
      Log.info("Page title matched");
      Assert.assertTrue(homePage.getHeaderNav().verifyCurrentURL(driver, TestVerificationData.getPageURLList().get("Careers"))
         , "Page url not matching");
      Log.info("Page url matched");
   }


}
