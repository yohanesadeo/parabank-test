package com.juaracoding.parabank.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenNewAccountPage {
    private WebDriver driver;
    private By typeBy = By.xpath("//select[@id='type']");
    private By fromAccountIdBy = By.xpath("//select[@id='fromAccountId']");
    private By buttonOpenNewAccountBy = By.xpath("//input[@type='button' and @value = 'Open New Account']");
    private By openAccountResultBy = By.xpath("//div[@id='openAccountResult']/h1");
    private By newAccountIdBy = By.xpath("//a[@id='newAccountId']");
    private By formOpenNewAccountBy = By.xpath("//div[@id='openAccountForm']/form");
    private WebDriverWait wait;
    private JavascriptExecutor js;

    public OpenNewAccountPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(60));
        js = (JavascriptExecutor) driver;
    }

    public void setSelectType(String type) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(typeBy));
        new Select(element).selectByVisibleText(type);
    }

    public void setSelectAccountId(String accountID) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(fromAccountIdBy));
        new Select(element).selectByVisibleText(accountID);
    }

    public void clickOpenNewAccount() {
        WebElement elemen = wait.until(ExpectedConditions.presenceOfElementLocated(buttonOpenNewAccountBy));
        js.executeScript("arguments[0].click();", elemen);
    }

    public void submitForm() {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(formOpenNewAccountBy));
        element.submit();
    }

    public String getOpenAccountResult() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(openAccountResultBy)).getText();
    }

    public String getNewAccountId() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(newAccountIdBy)).getText();
    }

}
