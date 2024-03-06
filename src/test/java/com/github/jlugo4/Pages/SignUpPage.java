package com.github.jlugo4.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
    private WebDriver driver;

    //Initializing PasswordField
    final private By PasswordField = By.cssSelector("input[data-qa*='password']");

    //Initializing FirstNameField
    final private By FirstNameField = By.cssSelector("input[data-qa*='first_name']");

    //Initializing SignUpPage
    public SignUpPage(WebDriver driver){this.driver = driver;}

    //Selecting the PasswordField
    public void clickPassWordField(){
        driver.findElement(PasswordField).click();
    }

    //Entering the password string into the passwordField
    public void enterPassword(String password){
        WebElement passwordField = driver.findElement(PasswordField);
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    //Selecting the FirstNameField
    public void clickFirstNameField(){
        driver.findElement(FirstNameField).click();
    }

    public void enterFirstName(String firstName){
        WebElement FirstName = driver.findElement(FirstNameField);
        FirstName.clear();
        FirstName.sendKeys(firstName);
    }

}
