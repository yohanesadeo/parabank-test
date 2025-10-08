package com.juaracoding.parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;
    private By firstNameBy = By.id("customer.firstName");
    private By lastNameBy = By.id("customer.lastName");
    private By addressBy = By.id("customer.address.street");
    private By cityBy = By.id("customer.address.city");
    private By stateBy = By.id("customer.address.state");
    private By zipCodeBy = By.id("customer.address.zipCode");
    private By phoneNumberBy = By.id("customer.phoneNumber");
    private By ssnBy = By.id("customer.ssn");
    private By usernameBy = By.id("customer.username");
    private By passwordBy = By.id("customer.password");
    private By repeatPasswordBy = By.id("repeatedPassword");
    private By registerButtonBy = By.xpath("//input[@type='submit'  and @value='Register']");
    private By titleBy = By.xpath("//div[@id='rightPanel']/h1[@class='title']");
    private By paragraphBy = By.xpath("//div[@id='rightPanel']/p");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setFirstName(String firstName) {
        driver.findElement(firstNameBy).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        driver.findElement(lastNameBy).sendKeys(lastName);
    }

    public void setAddress(String address) {
        driver.findElement(addressBy).sendKeys(address);
    }

    public void setCity(String city) {
        driver.findElement(cityBy).sendKeys(city);
    }

    public void setState(String state) {
        driver.findElement(stateBy).sendKeys(state);
    }

    public void setZipCode(String zipCode) {
        driver.findElement(zipCodeBy).sendKeys(zipCode);
    }

    public void setPhoneNumber(String phoneNumber) {
        driver.findElement(phoneNumberBy).sendKeys(phoneNumber);
    }

    public void setSsn(String ssn) {
        driver.findElement(ssnBy).sendKeys(ssn);
    }

    public void setUsername(String username) {
        driver.findElement(usernameBy).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(passwordBy).sendKeys(password);
    }

    public void setRepeatPassword(String repeatPassword) {
        driver.findElement(repeatPasswordBy).sendKeys(repeatPassword);
    }

    public void clickRegisterButton() {
        driver.findElement(registerButtonBy).click();
    }

    public String getTitleText() {
        return driver.findElement(titleBy).getText();
    }

    public String getParagraphText() {
        return driver.findElement(paragraphBy).getText();
    }

    public void register() {

    }
}
