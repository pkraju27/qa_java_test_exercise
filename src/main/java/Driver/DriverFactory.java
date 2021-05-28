package Driver;

import Util.AppProperties;
import Util.GetProperty;
import com.haud.qa.exercise.Log;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;

public class DriverFactory {
   public WebDriver getDriver() {
      return driver;
   }

   public void setDriver(WebDriver driver) {
      this.driver = driver;
   }

   WebDriver driver;
   public DriverFactory(){
      createDriver();
   }
   private void createDriver(){
      switch(GetProperty.PLATFORM){
         case "Desktop":
            Log.info("Platform : Desktop");
             setDriver(new Desktop().getDriver());
            break;
         case "Mobile" :
            Log.info("Platform : Mobile");
            setDriver(new Mobile().getDriver());
            // setDriver(new Mobile().getDriver());
            break;
         default:
            Assert.fail("Invalid platform name"+GetProperty.PLATFORM+", Please use supported platform Desktop and Mobile");
      }
   }
}
