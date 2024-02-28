package com.github.jlugo4.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSignUpPage {

    //Initialize webDriver
    private WebDriver driver;

    //Initialize SignUpName
    private By SignUpName = By.cssSelector("input[data-qa*='signup-name']");

    //Instantiate WebDriver
    public LoginSignUpPage(WebDriver driver){this.driver = driver;}

    // Click name field method
    public void clickNameField()
    {driver.findElement(SignUpName).click();}

    public void enterName(String name){
        WebElement nameField = driver.findElement(SignUpName);
        nameField.clear();
        nameField.sendKeys(name);
    }
}
