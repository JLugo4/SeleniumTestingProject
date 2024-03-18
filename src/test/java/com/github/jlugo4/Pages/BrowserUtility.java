package com.github.jlugo4.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtility {

        //WebDriver
        private WebDriver driver;

        //Initialize BrowserUtility WebDriver
        public BrowserUtility(WebDriver driver) {
            this.driver = driver;
        }

        //Scroll down method
        public void scrollDown(int pixels) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, " + pixels + ")");
        }

        // Wait Method
        public void waitForElementToBeClickable(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
