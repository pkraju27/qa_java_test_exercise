package com.haud.qa.exercise.SeleniumTest.Mobile;

import Driver.DriverFactory;
import Util.DriverHelper;
import Util.TestVerificationData;
import com.haud.qa.exercise.Log;
import com.haud.qa.exercise.PageObjects.HaudHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

@Test
public class MWHaudHeaderNavigationTest {
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


//   @BeforeTest
//   public void pageReload(){
//      homePage.openHomePage();
//   }
//   @AfterTest
//   public void analyzeLogs(){
//      driverHelper.analyzeBrowserLog(driver);
//   }

   @Test
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

   @Test
   public void test_HomeLink() {
      homePage.openHomePage();
      homePage.getHeaderNav().clickHamburgerMenu();
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

   @Test
   public void test_KnowledgeCenterLink() {
      homePage.openHomePage();
      homePage.getHeaderNav().clickHamburgerMenu();
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

   @Test
   public void test_TrendingTopicsLink() {
      homePage.openHomePage();
      homePage.getHeaderNav().clickHamburgerMenu();
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

   @Test
   public void test_ContactLink() {
      homePage.openHomePage();
      homePage.getHeaderNav().clickHamburgerMenu();
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

   @Test
   public void test_HaudSolutionsLink() {
      homePage.openHomePage();
      homePage.getHeaderNav().clickHamburgerMenu();
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
   }


   @Test
   public void test_SmartXchangeLink() {
      homePage.openHomePage();
      homePage.getHeaderNav().clickHamburgerMenu();
      homePage.getHeaderNav().clickHaudSolutionsDrownDownIcon();
      Log.info("SmartXchange Link verification");
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

   @Test
   public void test_SmartNForceLink() {
      homePage.openHomePage();
      homePage.getHeaderNav().clickHamburgerMenu();
      homePage.getHeaderNav().clickHaudSolutionsDrownDownIcon();
      Log.info("Smart Nforce Link verification");
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

   @Test
   public void test_SmartChargeLink() {
      homePage.openHomePage();
      homePage.getHeaderNav().clickHamburgerMenu();
      homePage.getHeaderNav().clickHaudSolutionsDrownDownIcon();
      Log.info("Smart charge Link verification");
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

   @Test
   public void test_SmartEnabledLink() {
      homePage.openHomePage();
      homePage.getHeaderNav().clickHamburgerMenu();
      homePage.getHeaderNav().clickHaudSolutionsDrownDownIcon();
      Log.info("Smart Enabled Link verification");
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

   @Test
   public void test_SmartNvisionLink() {
      homePage.openHomePage();
      homePage.getHeaderNav().clickHamburgerMenu();
      homePage.getHeaderNav().clickHaudSolutionsDrownDownIcon();
      Log.info("Smart Nvision Link verification");
      //driverHelper.moveCursorOverElement(homePage.getHeaderNav().getHaudSolutonsLink());
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

   @Test
   public void test_SmartBidLink() {
      homePage.openHomePage();
      homePage.getHeaderNav().clickHamburgerMenu();
      homePage.getHeaderNav().clickHaudSolutionsDrownDownIcon();
      Log.info("Smart BidLink verification");
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

   @Test
   public void test_AboutHaudLink() {
      homePage.openHomePage();
      homePage.getHeaderNav().clickHamburgerMenu();
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



   @Test
   public void test_CompanyLink() {
      homePage.openHomePage();
      homePage.getHeaderNav().clickHamburgerMenu();
      Log.info("Smart BidLink verification");
      homePage.getHeaderNav().clickAboutUsDrownDownIcon();
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

   @Test
   public void test_MeetTeamLink() {
      homePage.openHomePage();
      homePage.getHeaderNav().clickHamburgerMenu();
      Log.info("Smart BidLink verification");
      homePage.getHeaderNav().clickAboutUsDrownDownIcon();
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

   @Test
   public void test_CareersLink() {
      homePage.openHomePage();
      homePage.getHeaderNav().clickHamburgerMenu();
      Log.info("Smart BidLink verification");
      homePage.getHeaderNav().clickAboutUsDrownDownIcon();
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
