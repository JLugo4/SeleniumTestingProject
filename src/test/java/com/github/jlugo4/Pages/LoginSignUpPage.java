package com.github.jlugo4.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSignUpPage {

    //Initialize webDriver
    private WebDriver driver;

    //Initialize SignUpName
    private By SignUpName = By.cssSelector("input[data-qa*='sign-name']");

    //Instantiate WebDriver
    public LoginSignUpPage(WebDriver driver){this.driver = driver;}

    // Click name field method
    public void clickNameField()
    {driver.findElement(SignUpName).click();}

}
