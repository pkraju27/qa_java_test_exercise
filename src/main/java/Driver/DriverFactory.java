package Driver;

import Util.AppProperties;
import Util.GetProperty;
import com.haud.qa.exercise.Log;
import org.openqa.selenium.WebDriver;

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
            Log.warn("Invalid platform name, Please use supported platform Desktop and Mobile");
      }
   }
}
