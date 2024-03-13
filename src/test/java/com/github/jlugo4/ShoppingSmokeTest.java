package com.github.jlugo4;

import com.github.jlugo4.Pages.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShoppingSmokeTest {

    @Test
    public void tbdSmokeTest(){
        // Use WebDriver to manage FireFox
        WebDriverManager.firefoxdriver().setup();

        // Initialize the WebDriver
        final WebDriver driver = new FirefoxDriver();

        //Navigate to the web page
        driver.get("https://automationexercise.com/");

        //Instantiating LandingPage
        final LandingPage landingPage = new LandingPage(driver);

        //Click the products link
        landingPage.clickProducts();
    }
}
