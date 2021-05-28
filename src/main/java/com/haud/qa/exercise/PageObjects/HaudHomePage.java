package com.haud.qa.exercise.PageObjects;

import com.haud.qa.exercise.PageComponents.HeaderNav;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HaudHomePage {
   WebDriver driver;
   By HeaderSection =  By.id("masthead");

  public HaudHomePage(WebDriver driver){
      this.driver = driver;
      driver.get("https://haud.com/");
   }

   public HeaderNav getHeaderNav(){
      return new HeaderNav(driver,HeaderSection);
   }
}
