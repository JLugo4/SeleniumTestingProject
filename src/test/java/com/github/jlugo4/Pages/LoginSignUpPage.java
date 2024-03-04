package com.github.jlugo4.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSignUpPage {

    //Initialize webDriver
    private WebDriver driver;

    //Initialize SignUpName
    final private By SignUpNameField = By.cssSelector("input[data-qa*='signup-name']");

    final private By EmailField = By.cssSelector("input[data-qa*='signup-email']");

    //Instantiate WebDriver
    public LoginSignUpPage(WebDriver driver){this.driver = driver;}

    // Click name field method
    public void clickNameField()
    {driver.findElement(SignUpNameField).click();}

    public void enterName(String name){
        WebElement nameField = driver.findElement(SignUpNameField);
        nameField.clear();
        nameField.sendKeys(name);
    }

    public void clickEmailField(){
        driver.findElement(EmailField).click();
    }

    public void enterEmail(String email){
        WebElement emailField = driver.findElement(EmailField);
        emailField.clear();
        emailField.sendKeys(email);
    }
}
