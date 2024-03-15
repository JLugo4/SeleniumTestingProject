package com.github.jlugo4.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

    private WebDriver driver;
    public ProductsPage(WebDriver driver){this.driver = driver;}

    //Search bar
    final private By SearchBar = By.cssSelector("input[id*='search_product']");

    //sumbit search
    final private By SubmitSearch = By.cssSelector("button[id*='_submit_search']");


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


}
