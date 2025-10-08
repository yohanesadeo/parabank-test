package com.juaracoding.parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameBy = By.xpath("//input[@name='username']");
    private By passwordBy = By.xpath("//input[@name='password']");
    private By loginButtonBy = By.xpath("//input[@type='submit' and @value='Log In']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {
        driver.findElement(usernameBy).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(passwordBy).sendKeys(password);
    }

    public void clickLogInButton() {
        driver.findElement(loginButtonBy).click();
    }
}
