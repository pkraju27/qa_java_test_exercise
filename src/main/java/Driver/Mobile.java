package Driver;

import Util.GetProperty;
import com.haud.qa.exercise.Log;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class Mobile {
   WebDriver driver;
   String browser_version=GetProperty.BROWSER_VERSION;
   Mobile(){
      createMobileDriver();
   }
   public WebDriver getDriver() {
      return driver;
   }

   public void setDriver(WebDriver driver) {
      driver.manage().window().setSize(new Dimension(375,812));
      this.driver = driver;
   }

   /**
    * Creates Mobile driver
    */
   public void createMobileDriver(){
      switch (GetProperty.BROWSER_NAME){
         case "chrome":
            Log.info("Chrome browser on Mobile");
            createChromeDriver();
            break;
         case "firefox":
            Log.info("Firefox browser on Mobile");
            createFirefoxDriver();
            break;
         default:
            Log.warn("Unsupported browser selected");
            Assert.fail("Browser "+GetProperty.BROWSER_NAME+" is not supported, please use chrome or firefox" );
      }
   }


   /**
    * Creates and sets firefoxDriver for Mobile
    * Browser version is configured in main.properties file
    * Will create driver for latest version.
    */
   private void createFirefoxDriver() {
      if(isDefaultBrowser()){
         WebDriverManager.firefoxdriver().setup();
      }else{
         WebDriverManager.firefoxdriver().browserVersion(browser_version).setup();
      }
      FirefoxOptions firefoxOptions = new FirefoxOptions();
      FirefoxProfile ffProfile = new FirefoxProfile();
      ffProfile.setPreference(
         // set user agent as firefox on iphone
         "general.useragent.override", "Mozilla/5.0 (iPhone; CPU iPhone OS 8_3 like Mac OS X) AppleWebKit/600.1.4 (KHTML, like Gecko) FxiOS/1.0 Mobile/12F69 Safari/600.1.4"
      );
      firefoxOptions.setProfile(ffProfile);
      firefoxOptions.setAcceptInsecureCerts(true);
      setDriver(new FirefoxDriver(firefoxOptions));
      // iphone 8 plus dimensions

   }

   /**
    * Creates and sets Chromedriver for Mobile
    * Browser version is configured in main.properties file
    * Will create driver for latest version.
    */
   private void createChromeDriver() {
      if(isDefaultBrowser()){
         WebDriverManager.chromedriver().setup();
      }else{
         WebDriverManager.chromedriver().browserVersion(browser_version).setup();
      }
      ChromeOptions chromeOptions = new ChromeOptions();
      chromeOptions.setAcceptInsecureCerts(true);
      chromeOptions.addArguments("user-agent=Mozilla/5.0 (iPhone; CPU iPhone OS 10_3 like Mac OS X) \n" +
         "AppleWebKit/602.1.50 (KHTML, like Gecko) CriOS/56.0.2924.75\n" +
         "Mobile/14E5239e Safari/602.1"); // Chrome on iOS user agent
      setDriver(new ChromeDriver(chromeOptions));

   }

   private boolean isDefaultBrowser(){
      return (browser_version.isEmpty()||browser_version.equalsIgnoreCase("latest"));
   }
}
