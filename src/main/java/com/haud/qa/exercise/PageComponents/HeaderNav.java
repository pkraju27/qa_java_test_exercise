package com.haud.qa.exercise.PageComponents;

import com.haud.qa.exercise.AbstractComponents.AbstractComponent;
import com.haud.qa.exercise.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderNav extends AbstractComponent {

   By logo = By.cssSelector(".custom-logo");
   By home = By.linkText("Home");
   By haudSolutons = By.linkText("HAUD Solutions");
   By KnowledgeCenter = By.linkText("Knowledge Centre");
   By About = By.linkText("About HAUD");
   By TrendingTopics = By.linkText("Trending Topics");
   By Contact = By.linkText("Contact Us");

   public HeaderNav(WebDriver driver, By headerSection) {
      super(driver, headerSection);
   }

   public WebElement getElement(By by) {
      return findElement(by);
   }
   public WebElement getlogo(){
      return getElement(logo);
   }
   public WebElement getHomeLink(){
      return getElement(home);
   }
   public WebElement getHaudSolutonsLink(){
      return getElement(haudSolutons);
   }
   public WebElement getKnowledgeCenterLink(){
      return getElement(KnowledgeCenter);
   }
   public WebElement getAboutLink(){
      return getElement(About);
   }
   public WebElement getTrendingTopicsLink(){
      return getElement(TrendingTopics);
   }
   public WebElement getContactLink(){
      return getElement(Contact);
   }

   public void clickLogo() {
      getlogo().click();
   }
   public void clickHome() {
      getHomeLink().click();
   }
   public void clickHaudSolutons() {
      getHaudSolutonsLink().click();
   }
   public void clickKnowledgeCenter() {
      getKnowledgeCenterLink().click();
   }
   public void clickAbout() {
      getAboutLink().click();
   }public void clickTrendingTopics() {
      getTrendingTopicsLink().click();
   }
   public void clickContact() {
      getContactLink().click();
   }



}
