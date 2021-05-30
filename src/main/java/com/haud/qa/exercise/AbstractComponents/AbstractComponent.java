package com.haud.qa.exercise.AbstractComponents;

import com.haud.qa.exercise.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class AbstractComponent {
   WebElement sectionElement;

   public AbstractComponent(WebDriver driver, By sectionElement) {
      this.sectionElement = driver.findElement(sectionElement);
   }

   public WebElement findElement(By by) {
      return sectionElement.findElement(by);
   }

   /**
    * Method to verify current page title match
    * @param driver
    * @param title
    * @return True if current page Title matches with Expected title
    */
   public boolean verifyPageTitle(WebDriver driver,String title) {
      Log.info("Expected Title: "+title);
      Log.info("Actual Title: "+ driver.getTitle());
      return driver.getTitle().equalsIgnoreCase(title);
   }

   /**
    * Method to verify current page url match
    * @param driver
    * @param url
    * @return True if current page url matches with Expected url
    */
   public boolean verifyCurrentURL(WebDriver driver,String url) {
      return driver.getCurrentUrl().equalsIgnoreCase(url);
   }

   /**
    * Checks if passed dropdown Element contents matches the list
    * @param e
    * @param list
    * @param by
    * @return
    */
   public boolean isdropDownListMenuMatch(WebElement e, List<String> list,By by){
      List <WebElement> op = e.findElements(by);
      int size = op.size();
      for(int i =0; i<size ; i++){
         Log.info(list.get(i)+" : "+op.get(i).getText());
         if(!list.get(i).equalsIgnoreCase(op.get(i).getText()))
            return false;
      }
      return true;
   }


}
