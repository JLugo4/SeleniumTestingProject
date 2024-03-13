package com.github.jlugo4.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    private By signUpLink = By.cssSelector("a[href*='/login']");

    private By productsLink = By.cssSelector("a[href*='/products']");

    private WebDriver driver;

    public LandingPage(WebDriver driver){this.driver = driver;}

    public void clickSignUpLink(){
        driver.findElement(signUpLink).click();
    }

    public void clickProducts(){
        driver.findElement(productsLink).click();
    }
}
