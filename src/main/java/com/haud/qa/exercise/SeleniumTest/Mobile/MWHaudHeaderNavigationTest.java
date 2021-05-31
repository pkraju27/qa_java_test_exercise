package com.haud.qa.exercise.SeleniumTest.Mobile;

import Driver.DriverFactory;
import Util.DriverHelper;
import Util.TestVerificationData;
import com.haud.qa.exercise.Log;
import com.haud.qa.exercise.PageObjects.HaudHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

@Test
public class MWHaudHeaderNavigationTest {
   WebDriver driver;
   HaudHomePage homePage;
   DriverHelper driverHelper;


   @BeforeMethod
   public void setup() {
      driver = new DriverFactory().getDriver();
      homePage = new HaudHomePage(driver);
      driverHelper = new DriverHelper(driver);
   }

   @AfterMethod
   public void teardown() throws InterruptedException {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.quit();
   }


   @Test(priority = 1)
   public void test_LogoClick() {
      Log.info("Test Logo click started");
      homePage.getHeaderNav().clickLogo();
      Log.info("Logo clicked");
      Assert.assertTrue(homePage.getHeaderNav().verifyPageTitle(driver, TestVerificationData.getPageTitleList().get("logo"))
         , "Page title doesn't match");
      Log.info("Page title matched");
      Assert.assertTrue(homePage.getHeaderNav().verifyCurrentURL(driver, TestVerificationData.getPageURLList().get("logo"))
         , "Page url not matching");
      Log.info("Page url matched");
   }

   @Test(priority = 2)
   public void test_HomeLink() {
      Log.info("Test Home click started");
      homePage.getHeaderNav().clickHamburgerMenu();
      Log.info("Menu toggle clicked");
      driverHelper.waitImplicit();
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
      Log.info("Test Knowledge center started");
      homePage.getHeaderNav().clickHamburgerMenu();
      Log.info("Menu toggle clicked");
      driverHelper.waitImplicit();
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
      Log.info("Test Trending topic started");
      homePage.getHeaderNav().clickHamburgerMenu();
      Log.info("Menu toggle clicked");
      driverHelper.waitImplicit();
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
      Log.info("Test Contract link started");
      homePage.getHeaderNav().clickHamburgerMenu();
      Log.info("Menu toggle clicked");
      driverHelper.waitImplicit();
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
      Log.info("Test Haud solution started");
      homePage.getHeaderNav().clickHamburgerMenu();
      Log.info("Menu toggle clicked");
      driverHelper.waitImplicit();
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


   @Test(priority = 7)
   public void test_SmartXchangeLink() {
      Log.info("Smart Xchange Link started");
      homePage.getHeaderNav().clickHamburgerMenu();
      Log.info("Menu toggle clicked");
      driverHelper.waitImplicit();
      homePage.getHeaderNav().clickHaudSolutionsDrownDownIcon();
      Log.info("Haud Solutions Drop down icon clicked");
      driverHelper.waitImplicit();
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

   @Test(priority = 8)
   public void test_SmartNForceLink() {
      Log.info("Smart NForce Link started");
      homePage.getHeaderNav().clickHamburgerMenu();
      Log.info("Menu toggle clicked");
      driverHelper.waitImplicit();
      homePage.getHeaderNav().clickHaudSolutionsDrownDownIcon();
      Log.info("Haud Solutions Drop down icon clicked");
      driverHelper.waitImplicit();
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

   @Test(priority = 9)
   public void test_SmartChargeLink() {
      Log.info("Smart Charge Link started");
      homePage.getHeaderNav().clickHamburgerMenu();
      Log.info("Menu toggle clicked");
      driverHelper.waitImplicit();
      homePage.getHeaderNav().clickHaudSolutionsDrownDownIcon();
      Log.info("Haud Solutions Drop down icon clicked");
      driverHelper.waitImplicit();
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

   @Test(priority = 10)
   public void test_SmartEnabledLink() {
      Log.info("Smart Enabled Link started");
      homePage.openHomePage();
      homePage.getHeaderNav().clickHamburgerMenu();
      Log.info("Menu toggle clicked");
      driverHelper.waitImplicit();
      homePage.getHeaderNav().clickHaudSolutionsDrownDownIcon();
      Log.info("Haud Solutions Drop down icon clicked");
      driverHelper.waitImplicit();
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

   @Test(priority = 11)
   public void test_SmartNvisionLink() {
      Log.info("Smart Nvision Link started");
      homePage.openHomePage();
      homePage.getHeaderNav().clickHamburgerMenu();
      Log.info("Menu toggle clicked");
      driverHelper.waitImplicit();
      homePage.getHeaderNav().clickHaudSolutionsDrownDownIcon();
      Log.info("Haud Solutions Drop down icon clicked");
      driverHelper.waitImplicit();
      Log.info("Smart Nvision Link verification");
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
      Log.info("Smart Bid Link started");
      homePage.openHomePage();
      homePage.getHeaderNav().clickHamburgerMenu();
      Log.info("Menu toggle clicked");
      driverHelper.waitImplicit();
      homePage.getHeaderNav().clickHaudSolutionsDrownDownIcon();
      Log.info("Haud Solutions Drop down icon clicked");
      driverHelper.waitImplicit();
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

   @Test(priority = 13)
   public void test_AboutHaudLink() {
      Log.info("Test About Link started");
      homePage.openHomePage();
      homePage.getHeaderNav().clickHamburgerMenu();
      Log.info("Menu toggle clicked");
      driverHelper.waitImplicit();
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
   public void test_CompanyLink() {
      Log.info("Test company link started");
      homePage.openHomePage();
      homePage.getHeaderNav().clickHamburgerMenu();
      Log.info("Menu toggle clicked");
      driverHelper.waitImplicit();
      homePage.getHeaderNav().clickAboutUsDrownDownIcon();
      Log.info("About us drown down clicked");
      driverHelper.waitImplicit();
      Log.info("Company link verification");
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

   @Test(priority = 15)
   public void test_MeetTeamLink() {
      Log.info("Test Meet the team link started");
      homePage.openHomePage();
      homePage.getHeaderNav().clickHamburgerMenu();
      Log.info("Menu toggle clicked");
      driverHelper.waitImplicit();
      Log.info("Meet team link verification");
      homePage.getHeaderNav().clickAboutUsDrownDownIcon();
      Log.info("Smart Xchange Link started");
      driverHelper.waitImplicit();
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

   @Test(priority = 16)
   public void test_CareersLink() {
      Log.info("Test careers link started");
      homePage.getHeaderNav().clickHamburgerMenu();
      Log.info("Menu toggle clicked");
      driverHelper.waitImplicit();
      Log.info("Careers link verification");
      Log.info("Smart Xchange Link started");
      homePage.getHeaderNav().clickAboutUsDrownDownIcon();
      driverHelper.waitImplicit();
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
