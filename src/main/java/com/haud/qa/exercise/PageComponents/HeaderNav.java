package com.haud.qa.exercise.PageComponents;

import com.haud.qa.exercise.AbstractComponents.AbstractComponent;
import com.haud.qa.exercise.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HeaderNav extends AbstractComponent {

   By logo = By.cssSelector(".custom-logo");
   By home = By.id("menu-item-5319");
   By haudSolutons = By.xpath("//*[@id='menu-item-5320']//a");
   By haudSolutonsDropdown = By.xpath("//*[@id='menu-item-5320']//*[@class='sub-menu']");
   By AboutUsDropDown = By.xpath("//*[@id='menu-item-5328']//*[@class='sub-menu']");
   By KnowledgeCenter = By.xpath("//*[@id='menu-item-5327']/a");
   By About = By.xpath("//*[@id='menu-item-5328']/a");
   By TrendingTopics = By.xpath("//*[@id='menu-item-5329']/a");
   By Contact = By.xpath("//*[@id='menu-item-5330']/a");
   By SmartXchange = By.xpath("//*[@id='menu-item-5321']/a");
   By SmartNForce = By.xpath("//*[@id='menu-item-5322']/a");
   By SmartCharge = By.xpath("//*[@id='menu-item-5325']/a");
   By SmartNvision = By.xpath("//*[@id='menu-item-5323']/a");
   By SmartEnabled = By.xpath("//*[@id='menu-item-5326']/a");
   By SmartBid = By.xpath("//*[@id='menu-item-5324']/a");
   By Company = By.xpath("//*[@id='menu-item-5607']/a");
   By MeetTheTeam = By.xpath("//*[@id='menu-item-5829']/a");
   By Careers = By.xpath("//*[@id='menu-item-5606']/a");
   By HaudSolutionsDrownDownMenuList = By.cssSelector(".menu-item-type-post_type");
   By AboutUsDropDownList = By.cssSelector(".menu-item");
   By HamburgerMenu = By.cssSelector(".menu-toggle");
   By HaudSolutionsDropDownIcon = By.xpath("//*[@id='menu-item-5320']//*[@class='dropdown-toggle']//*[@class='icon-drop-down']");
   By AboutUsDropDownIcon = By.xpath("//*[@id='menu-item-5328']//*[@class='dropdown-toggle']//*[@class='screen-reader-text']");


   public HeaderNav(WebDriver driver, By headerSection) {
      super(driver, headerSection);
   }

   public WebElement getElement(By by) {
      return findElement(by);
   }

   public WebElement getlogo() {
      return getElement(logo);
   }

   public WebElement getHomeLink() {
      return getElement(home);
   }

   public WebElement getHaudSolutonsLink() {
      return getElement(haudSolutons);
   }

   public WebElement getKnowledgeCenterLink() {
      return getElement(KnowledgeCenter);
   }

   public WebElement getAboutLink() {
      return getElement(About);
   }

   public WebElement getTrendingTopicsLink() {
      return getElement(TrendingTopics);
   }

   public WebElement getContactLink() {
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
   }

   public void clickTrendingTopics() {
      getTrendingTopicsLink().click();
   }

   public void clickContact() {
      getContactLink().click();
   }

   public void clickHamburgerMenu() {
      getElement(HamburgerMenu).click();
   }

   public WebElement getSmartXchange() {
      return getElement(SmartXchange);
   }

   public WebElement getSmartNForce() {
      return getElement(SmartNForce);
   }

   public WebElement getSmartCharge() {
      return getElement(SmartCharge);
   }

   public WebElement getSmartEnabled() {
      return getElement(SmartEnabled);
   }

   public WebElement getSmartNvision() {
      return getElement(SmartNvision);
   }

   public WebElement getSmartBid() {
      return getElement(SmartBid);
   }

   public WebElement getCompany() {
      return getElement(Company);
   }

   public WebElement getMeetTheTeam() {
      return getElement(MeetTheTeam);
   }

   public WebElement getCareers() {
      return getElement(Careers);
   }

   public WebElement getHaudSolutionsDropDown() {
      return getElement(haudSolutonsDropdown);
   }

   public WebElement getAboutusDropDown() {
      return getElement(AboutUsDropDown);
   }

   public void clickHaudSolutionsDrownDownIcon(){
      getElement(HaudSolutionsDropDownIcon).click();
   }

   public void clickAboutUsDrownDownIcon(){
      getElement(AboutUsDropDownIcon).click();
   }

   public boolean isHaudSolutionsDropDownMatch(List<String> list) {
      return isdropDownListMenuMatch(getHaudSolutionsDropDown(), list, HaudSolutionsDrownDownMenuList);
   }

   public boolean isAboutUsDropDownMatch(List<String> list) {
      return isdropDownListMenuMatch(getAboutusDropDown(), list, AboutUsDropDownList);
   }


}
