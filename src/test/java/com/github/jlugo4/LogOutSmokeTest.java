package com.github.jlugo4;

import com.github.jlugo4.Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogOutSmokeTest {

    @Test
    public void LogOutTest(){
        //Log Out Smoke Test
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

        // Create a JavascriptExecutor object
        BrowserUtility browserUtils = new BrowserUtility(driver);

        //Scroll
        browserUtils.scrollDown(250);

        //Select Gender(Male)
        signUpPage.clickGenderMr();

        //Select Password Field
        signUpPage.clickPassWordField();

        //Create password
        String password = MetaDataUtility.createPassword();

        //Send password to Password field
        signUpPage.enterPassword(password);

        // Scroll down the page by a specific number of pixels (e.g., 750 pixels)
        browserUtils.scrollDown(750);

        //Date of Birth selection
        signUpPage.clickDays();

        //Send Date to days
        signUpPage.enterDateInDays();

        //Click to close drop down bar
        signUpPage.clickDays();

        //Click Month of Birth
        signUpPage.clickMonths();

        //Enter a month
        signUpPage.enterMonthInMonths();

        //Click to close drop down bar
        signUpPage.clickMonths();

        //Click Year of Birth
        signUpPage.clickYears();

        //Enter a Year
        signUpPage.enterYearInYears();

        //Click to close drop down bar
        signUpPage.clickYears();

        //Click newsletter
        signUpPage.clickNewsletter();

        //Click optin
        signUpPage.clickOptin();

        browserUtils.scrollDown(750);

        //Select FirstName field
        signUpPage.clickFirstNameField();

        //Create FirstName
        String firstName = MetaDataUtility.createFirstName();

        //Send first name to first Name field
        signUpPage.enterFirstName(firstName);

        // Scroll down the page by a specific number of pixels (e.g., 750 pixels)
        browserUtils.scrollDown(750);

        //Select LastName field
        signUpPage.clickLastNameField();

        //Create LastName
        String lastName = MetaDataUtility.createLastName();

        //Send last name to last Name Field
        signUpPage.enterLastName(lastName);

        // Scroll down the page by a specific number of pixels (e.g., 750 pixels)
        browserUtils.scrollDown(750);

        //Click company
        signUpPage.clickCompany();

        //create Company
        String company = MetaDataUtility.createCompany();

        //Enter Company
        signUpPage.enterCompany(company);

        //Create Address
        String address = MetaDataUtility.createAddress();

        // Scroll down the page by a specific number of pixels (e.g., 750 pixels)
        browserUtils.scrollDown(750);

        //Select Address field
        signUpPage.clickAddressField();

        //Enter in created address into Address Field
        signUpPage.enterAddress(address);

        //Create Address
        String address2 = MetaDataUtility.createAddress();

        // Scroll down the page by a specific number of pixels (e.g., 750 pixels)
        browserUtils.scrollDown(750);

        //Select Address field
        signUpPage.clickAddress2Field();

        //Enter in created address into Address Field
        signUpPage.enterAddress2(address2);

        // Scroll down the page by a specific number of pixels (e.g., 750 pixels)
        browserUtils.scrollDown(750);

        //Select Country on the Country drop down menu
        signUpPage.selectUnitedStates();

        // Scroll down the page by a specific number of pixels (e.g., 750 pixels)
        browserUtils.scrollDown(750);

        // Create String to send to state
        String state = "Delaware";

        //Select State
        signUpPage.clickState();

        //Send State
        signUpPage.enterState(state);

        // Scroll down the page by a specific number of pixels (e.g., 750 pixels)
        browserUtils.scrollDown(750);

        // Create String to send to City
        String city = "Wilmington";

        //Select City
        signUpPage.clickCity();

        //Send City
        signUpPage.enterCity(city);

        // Scroll down the page by a specific number of pixels (e.g., 750 pixels)
        browserUtils.scrollDown(750);

        //create Zipcode
        String zipcode = MetaDataUtility.createZipcode();

        //Select Zipcode
        signUpPage.clickZipcode();

        //Enter Zipcode into Zipcode Field
        signUpPage.enterZipCode(zipcode);

        // Scroll down the page by a specific number of pixels (e.g., 750 pixels)
        browserUtils.scrollDown(750);

        //Create Mobile Number
        String mobileNumber = MetaDataUtility.createMobileNumber();

        //Select Mobile number field
        signUpPage.clickMobileNumber();

        //Enter created Mobile Number
        signUpPage.enterMobileNumber(mobileNumber);

        // Scroll down the page by a specific number of pixels (e.g., 750 pixels)
        browserUtils.scrollDown(750);

        //Click Create Account
        signUpPage.clickCreateAccountButton();

        //Instantiate AccountCreatedPage
        final AccountCreatedPage accountCreatedPage = new AccountCreatedPage(driver);

        //click continue
        accountCreatedPage.clickContinueButton();

        //click logOut
        landingPage.clickLogOut();

        //Login and Log out successful
    }
}
