package com.github.jlugo4.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
    private WebDriver driver;

    final private By PasswordField = By.cssSelector("input[data-qa*='password']");

    public SignUpPage(WebDriver driver){this.driver = driver;}

    public void clickPassWordField(){
        driver.findElement(PasswordField).click();
    }

    public void enterPassword(String password){
        WebElement passwordField = driver.findElement(PasswordField);
        passwordField.clear();
        passwordField.sendKeys(password);

    }
}
