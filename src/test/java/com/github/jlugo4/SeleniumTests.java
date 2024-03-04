package com.github.jlugo4;

import com.github.jlugo4.Pages.LandingPage;
import com.github.jlugo4.Pages.LoginSignUpPage;
import com.github.jlugo4.Pages.MetaDataUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTests {

    //Regression
    //Smoke Test
    //Contract tests
    //Performance
    @Test
    public void smoke_Test(){
        // Use WebDriver to manage FireFox
        WebDriverManager.firefoxdriver().setup();

        // Initialize the WebDriver
        final WebDriver driver = new FirefoxDriver();

        //Navigate to the web page
        driver.get("https://automationexercise.com/");

        //Instantiating SignUpPage
        final LandingPage landingPage = new LandingPage(driver);

        //Click Sign up/Login Page
        landingPage.clickSignUpLink();

            //Test URL Location
        String actual_URL = driver.getCurrentUrl();
        String expected_URL = "https://automationexercise.com/login";
        Assert.assertEquals(expected_URL, actual_URL);

        //__Sign up Process__
        // Make Driver Click name field

        //Instantiate loginSignUpPage
        final LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);

        //Click Name field and begin sign up process
        loginSignUpPage.clickNameField();

        //Meta-data method class?
        //Create SignInName
        String signInName = MetaDataUtility.createTempName();

        //Send Random signInName to nameField
        loginSignUpPage.enterName(signInName);

        //Select the email field
        loginSignUpPage.clickEmailField();

        String signInEmail = MetaDataUtility.createEmail();

        loginSignUpPage.enterEmail(signInEmail);
    
    }
}
