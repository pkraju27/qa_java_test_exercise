package Util;

import com.haud.qa.exercise.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DriverHelper {
   WebDriver driver;
   WebDriverWait wait;
      public DriverHelper(WebDriver driver){
         this.driver = driver;
         wait = new WebDriverWait(this.driver,50);
      }

      public void waitForPageLoad(){
         waitImplicit();
         wait.until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").toString().equals("complete"));
      }
      public void waitForElementInteractable(WebElement element){
         wait.until(ExpectedConditions.elementToBeClickable(element));
      }
      public void moveCursorOverElement(WebElement e){
         Actions actions = new Actions(driver);
         actions.moveToElement(e).build().perform();
         waitImplicit();
      }
   public void moveCursorAndClickSubMenu(WebElement e){
      Actions actions = new Actions(driver);
      actions.moveToElement(e).click().build().perform();
   }

   public void analyzeBrowserLog(WebDriver driver) {
      LogEntries logs = driver.manage().logs().get(LogType.BROWSER);
      for (LogEntry entry : logs) {
         Log.info(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
      }
   }

    public void waitImplicit() {
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
