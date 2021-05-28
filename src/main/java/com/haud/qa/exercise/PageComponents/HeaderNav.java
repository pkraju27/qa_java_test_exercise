package com.haud.qa.exercise.PageComponents;

import com.haud.qa.exercise.AbstractComponents.AbstractComponent;
import com.haud.qa.exercise.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderNav extends AbstractComponent {


   By logo = By.cssSelector(".custom-logo");

   public HeaderNav(WebDriver driver, By headerSection) {
      super(driver, headerSection);
   }

   public void clickLogo() {
      Log.info(findElement(logo).getAttribute("alt"));
      findElement(logo).click();
   }

}
