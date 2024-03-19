package com.github.jlugo4.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountCreatedPage {
    // Initialize the WebDriver
    private WebDriver driver;

    // Initialize AccountCreatedPage Web Driver
    public AccountCreatedPage(WebDriver driver){this.driver = driver;}

    private final By continuteButton = By.cssSelector("a[data-qa*='continue-button']");

    public void clickContinueButton(){
        driver.findElement(continuteButton).click();
    }
}
