package com.haud.qa.exercise;

import Driver.DriverFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Main {

    public static void main(String[] args)  {
       WebDriver driver = new DriverFactory().getDriver();
       String userAgent = (String) ((JavascriptExecutor) driver).executeScript("return navigator.userAgent;");
       Log.info(userAgent);
       driver.get("https://haud.com/");
       Log.info(driver.getCurrentUrl()+" "+driver.getTitle());
       driver.quit();
    }
}
