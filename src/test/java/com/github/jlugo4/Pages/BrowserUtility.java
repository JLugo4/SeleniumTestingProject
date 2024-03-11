package com.github.jlugo4.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BrowserUtility {
        private WebDriver driver;
        public BrowserUtility(WebDriver driver) {
            this.driver = driver;
        }

        public void scrollDown(int pixels) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, " + pixels + ")");
        }
}
