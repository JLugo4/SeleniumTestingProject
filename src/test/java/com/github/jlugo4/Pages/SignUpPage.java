package com.github.jlugo4.Pages;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.Zip;

public class SignUpPage {
    private WebDriver driver;

    //Initializing Gender Selection(Male)
    final private By GenderInput = By.cssSelector("input[value*='Mr']");

    //Initializing PasswordField
    final private By PasswordField = By.cssSelector("input[data-qa*='password']");

    //Initializing FirstNameField
    final private By FirstNameField = By.cssSelector("input[data-qa*='first_name']");

    //Initializing LastNameField
    final private By LastNameField = By.cssSelector("input[data-qa*='last_name']");

    final private By DaysDropDown = By.cssSelector("select[data-qa*='days']");

    final private By MonthsDropDown = By.cssSelector("select[data-qa*='months']");

    final private By YearsDropDown = By.cssSelector("select[data-qa*='years']");

    final private By NewsLetterInput = By.cssSelector("input[name*='newsletter']");

    final private By OptinInput = By.cssSelector("input[name*='optin']");

    final private By AddressField = By.cssSelector("input[data-qa*='address']");

    final private By CountryDropDown = By.cssSelector("select[data-qa*='country']");

    final private By StateField = By.cssSelector("input[data-qa*='state']");

    final private By CityField = By.cssSelector("input[data-qa*='city']");

    final private By ZipcodeField = By.cssSelector("input[data-qa*='zipcode']");

    final private By MobileNumberField = By.cssSelector("input[data-qa*='mobile_number']");

    final private By CreateAccountButton = By.cssSelector("button[data-qa*='create-account']");

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

    //Enter first name into first name field
    public void enterFirstName(String firstName){
        WebElement FirstName = driver.findElement(FirstNameField);
        FirstName.clear();
        FirstName.sendKeys(firstName);
    }

    //Select Last name field
    public void clickLastNameField(){
        driver.findElement(LastNameField).click();
    }

    //Enter last name into Last name Field
    public void enterLastName(String lastName){
        WebElement LastName = driver.findElement(LastNameField);
        LastName.clear();
        LastName.sendKeys(lastName);
    }

    //Click Address field
    public void clickAddressField(){
        driver.findElement(AddressField).click();
    }

    //Enter Address into Address field
    public void enterAddress(String address){
        WebElement Address = driver.findElement(AddressField);
        Address.clear();
        Address.sendKeys(address);
    }

    //Click Country Drop Down Menu
    public void clickCountry(){
        driver.findElement(CountryDropDown).click();
    }

//TODO
//    public void selectCountry() {
//        Select dropdown = new Select(driver.findElement(By.id("input[data-qa*='country']")));
//        dropdown.selectByIndex(index);
//    }

    //Send keys to drop down
    public void selectUnitedStates(){
        WebElement country = driver.findElement(CountryDropDown);
        country.click();
        country.sendKeys("un");
    }

    public void clickState(){
        driver.findElement(StateField).click();
    }

    public void enterState(String state){
        WebElement stateField = driver.findElement(StateField);
        stateField.clear();
        stateField.sendKeys(state);
    }

    public void clickCity(){
        driver.findElement(CityField).click();
    }

    public void enterCity(String city){
        WebElement City = driver.findElement(CityField);
        City.clear();
        City.sendKeys(city);
    }

    public void clickZipcode(){
        driver.findElement(ZipcodeField).click();
    }

    public void enterZipCode(String zipcode){
        WebElement Zipcode = driver.findElement(ZipcodeField);
        Zipcode.clear();
        Zipcode.sendKeys(zipcode);
    }

    public void clickMobileNumber(){
        driver.findElement(MobileNumberField).click();
    }

    public void enterMobileNumber(String mobileNumber){
        WebElement MobileNumber = driver.findElement(MobileNumberField);
        MobileNumber.clear();
        MobileNumber.sendKeys(mobileNumber);
    }

    public void clickCreateAccountButton(){driver.findElement(CreateAccountButton).click();}

    public void clickGenderMr(){
        driver.findElement(GenderInput).click();
    }

    public void clickDays(){
        driver.findElement(DaysDropDown).click();
    }

    public void enterDateInDays(){
        WebElement Days = driver.findElement(DaysDropDown);
        Days.sendKeys("4");
    }

    public void clickMonths(){
        driver.findElement(MonthsDropDown).click();
    }

    public void enterMonthInMonths(){
        WebElement Months = driver.findElement(MonthsDropDown);
        Months.sendKeys("March");
    }

    public void clickYears(){
        driver.findElement(YearsDropDown).click();
    }

    public void enterYearInYears(){
        WebElement Years = driver.findElement(YearsDropDown);
        Years.sendKeys("2000");
    }

    public void clickNewsletter(){
        driver.findElement(NewsLetterInput).click();
    }

    public void clickOptin(){
        driver.findElement(OptinInput).click();
    }
}
