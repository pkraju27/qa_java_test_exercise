package Driver;

import Util.GetProperty;
import com.haud.qa.exercise.Log;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.util.logging.Level;

public class Desktop {
   WebDriver driver;
   Desktop(){
      createDesktopDriver();
   }

   public WebDriver getDriver() {
      return driver;
   }

   public void setDriver(WebDriver driver) {
      this.driver = driver;
      driver.manage().window().maximize();
   }
   public void createDesktopDriver(){
      switch (GetProperty.BROWSER_NAME){
         case "chrome":
            Log.info("Chrome browser");
            createChromeDriver();
            break;
         case "firefox":
            createFirefoxDriver();
            Log.info("Firefox browser");
            break;
         default:
            Log.warn("Unsupported browser selected");
            Assert.fail("Browser "+GetProperty.BROWSER_NAME+" is not supported, please use chrome or firefox" );
      }
   }
   private void createChromeDriver(){
      String browser_version=GetProperty.BROWSER_VERSION;
      if(browser_version.isEmpty()||browser_version.equalsIgnoreCase("latest")){
         WebDriverManager.chromedriver().setup();
      }else{
         WebDriverManager.chromedriver().browserVersion(browser_version).setup();
      }
      ChromeOptions chromeOptions = new ChromeOptions();
      LoggingPreferences logPrefs = new LoggingPreferences();
      logPrefs.enable(LogType.BROWSER, Level.ALL);
      chromeOptions.setAcceptInsecureCerts(true);
      chromeOptions.setCapability(CapabilityType.LOGGING_PREFS,logPrefs);
      setDriver(new ChromeDriver(chromeOptions));
   }
   private void createFirefoxDriver(){
      String browser_version=GetProperty.BROWSER_VERSION;
      if(browser_version.isEmpty()||browser_version.equalsIgnoreCase("latest")){
         WebDriverManager.firefoxdriver().setup();
      }else{
         WebDriverManager.firefoxdriver().browserVersion(browser_version).setup();
      }
      FirefoxOptions firefoxOptions = new FirefoxOptions();
      firefoxOptions.setAcceptInsecureCerts(true);
      setDriver(new FirefoxDriver(firefoxOptions));
   }
}
