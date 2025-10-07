package com.juaracoding.parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By byRegisterLink = By.linkText("Register");
    
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRegisterLink() {
        driver.findElement(byRegisterLink).click();
    }
}
