package com.github.jlugo4;

import com.github.jlugo4.Pages.LandingPage;
import com.github.jlugo4.Pages.ProductsPage;
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

        final ProductsPage productsPage = new ProductsPage(driver);

        //Click search
        productsPage.clickSearchProduct();

        //Search sweater
        productsPage.searchForSweater();

        //submit search
        productsPage.clickSubmitSearch();

        //no sweater found, let's look at the polos
        productsPage.clickPolo();
    }
}
