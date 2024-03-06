package com.github.jlugo4;

import com.github.jlugo4.Pages.LandingPage;
import com.github.jlugo4.Pages.LoginSignUpPage;
import com.github.jlugo4.Pages.MetaDataUtility;
import com.github.jlugo4.Pages.SignUpPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
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

        //Instantiating LandingPage
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

        //Create SignInEmail
        String signInEmail = MetaDataUtility.createEmail();

        //Send Random Email to emailField
        loginSignUpPage.enterEmail(signInEmail);

        //Select and Click Sign up Button
        loginSignUpPage.clickSignUpButton();

        //Instantiate SignUpPage
        final SignUpPage signUpPage = new SignUpPage(driver);

        //Select Password Field
        signUpPage.clickPassWordField();

        //Create password
        String password = MetaDataUtility.createPassword();

        //Send password to Password field
        signUpPage.enterPassword(password);

        // Create a JavascriptExecutor object
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down the page by a specific number of pixels (e.g., 500 pixels)
        js.executeScript("window.scrollBy(0, 750)");

        //Select FirstName field
        signUpPage.clickFirstNameField();

        //Create FirstName
        String firstName = MetaDataUtility.createFirstName();

        //Send first name to first Name field
        signUpPage.enterFirstName(firstName);

        // Scroll down the page by a specific number of pixels (e.g., 500 pixels)
        js.executeScript("window.scrollBy(0, 750)");

        //Select LastName field
        signUpPage.clickLastNameField();

        //Create LastName
        String lastName = MetaDataUtility.createFirstName();

        //Send last name to last Name Field
        signUpPage.enterLastName(lastName);
    }
}
