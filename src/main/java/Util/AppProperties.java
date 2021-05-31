package Util;

import com.haud.qa.exercise.Log;
import java.io.FileReader;
import java.util.Properties;

public class AppProperties {
   public AppProperties()  {
      try {
         FileReader reader = new FileReader("src/main/resources/main.properties");
         Properties prop = new Properties();
         prop.load(reader);
         setBrowser_name(prop.getProperty("browser.name"));
         setBrowser_version(prop.getProperty("browser.version"));
         setPlatform_type(prop.getProperty("platform"));
      }
      catch (Exception e){
         Log.error(e);
      }

   }
   public String getBrowser_name() {
      return browser_name;
   }

   private void setBrowser_name(String browser_name) {
      this.browser_name = browser_name;
   }

   public String getBrowser_version() {
      return browser_version;
   }

   private void setBrowser_version(String browser_version) {
      this.browser_version = browser_version;
   }

   public String getPlatform_type() {
      return platform_type;
   }

   private void setPlatform_type(String platform_type) {
      this.platform_type = platform_type;
   }

   private String browser_name;
   private String browser_version;
   private String platform_type;

}
