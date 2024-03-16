package com.github.jlugo4.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

    private WebDriver driver;
    public ProductsPage(WebDriver driver){this.driver = driver;}

    //Search bar
    final private By SearchBar = By.cssSelector("input[id*='search_product']");

    //submit search
    final private By SubmitSearch = By.cssSelector("button[id*='submit_search']");

    //Polo button
    final private By PoloCategory = By.cssSelector("a[href*='/brand_products/Polo']");

    //click Search bar
    public void clickSearchProduct(){
        driver.findElement(SearchBar).click();
    }


    // Search for sweater
    public void searchForSweater(){
        WebElement searchSweater = driver.findElement(SearchBar);
        searchSweater.clear();
        searchSweater.sendKeys("sweater");
    }

    public void clickSubmitSearch(){
        driver.findElement(SubmitSearch).click();
    }

    public void clickPolo(){
        driver.findElement(PoloCategory).click();
    }


}
