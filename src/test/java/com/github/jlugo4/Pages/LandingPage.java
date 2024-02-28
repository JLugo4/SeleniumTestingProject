package com.github.jlugo4.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    private By signUpLink = By.cssSelector("a[href*='/login']");
    private WebDriver driver;

    public LandingPage(WebDriver driver){this.driver = driver;}

    public void clickSignUpLink(){
        driver.findElement(signUpLink).click();
    }
}