package com.github.jlugo4.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    //Initialize signUpLink
    private By signUpLink = By.cssSelector("a[href*='/login']");

    //Initialize ProductsLink
    private By productsLink = By.cssSelector("a[href*='/products']");

    // Initialize the WebDriver
    private WebDriver driver;

    // Initialize LandingPage Web Driver
    public LandingPage(WebDriver driver){this.driver = driver;}

    // click signUpLink
    public void clickSignUpLink(){
        driver.findElement(signUpLink).click();
    }

    // click productsLink
    public void clickProducts(){
        driver.findElement(productsLink).click();
    }
}
