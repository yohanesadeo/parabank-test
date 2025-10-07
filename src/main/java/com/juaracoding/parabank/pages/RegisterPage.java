package com.juaracoding.parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;

    private By firstName = By.id("customer.firstName");
    private By lastName = By.id("customer.lastName");
    private By address = By.id("customer.address.street");
    private By city = By.id("customer.address.city");
    private By state = By.id("customer.address.state");
    private By zip = By.id("customer.address.zipCode");
    private By phone = By.id("customer.phoneNumber");
    private By ssn = By.id("customer.ssn");
    private By username = By.id("customer.username");
    private By password = By.id("customer.password");
    private By confirmPassword = By.id("repeatedPassword");
    private By registerButton = By.xpath("//input[@value='Register']");
    private By titleBy = By.xpath("//div[@id='rightPanel']/h1[@class='title']");
    private By paragraphBy = By.xpath("//div[@id='rightPanel']/p");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputFirstName(String firstName) {
        driver.findElement(this.firstName).sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        driver.findElement(this.lastName).sendKeys(lastName);
    }

    public void inputAddress(String address) {
        driver.findElement(this.address).sendKeys(address);
    }

    public void inputCity(String city) {
        driver.findElement(this.city).sendKeys(city);
    }

    public void inputState(String state) {
        driver.findElement(this.state).sendKeys(state);
    }

    public void inputZip(String zip) {
        driver.findElement(this.zip).sendKeys(zip);
    }

    public void inputPhone(String phone) {
        driver.findElement(this.phone).sendKeys(phone);
    }

    public void inputSSN(String ssn) {
        driver.findElement(this.ssn).sendKeys(ssn);
    }

    public void inputUsername(String username) {
        driver.findElement(this.username).sendKeys(username);
    }

    public void inputPassword(String password) {
        driver.findElement(this.password).sendKeys(password);
    }

    public void inputConfirmPassword(String confirmPassword) {
        driver.findElement(this.confirmPassword).sendKeys(confirmPassword);
    }

    public void clickRegisterButton() {
        driver.findElement(this.registerButton).click();
    }

    public void register(String firstName, String lastName, String address, String city, String state, String zip,
            String phone, String ssn, String username, String password, String confirmPassword) {
        inputFirstName(firstName);
        inputLastName(lastName);
        inputAddress(address);
        inputCity(city);
        inputState(state);
        inputZip(zip);
        inputPhone(phone);
        inputSSN(ssn);
        inputUsername(username);
        inputPassword(password);
        inputConfirmPassword(confirmPassword);
        clickRegisterButton();
    }

    

}
