package com.github.jlugo4.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountCreatedPage {
    // Initialize the WebDriver
    private WebDriver driver;

    // Initialize AccountCreatedPage Web Driver
    public AccountCreatedPage(WebDriver driver){this.driver = driver;}

    private By signUpLink = By.cssSelector("a[href*='/login']");
}
