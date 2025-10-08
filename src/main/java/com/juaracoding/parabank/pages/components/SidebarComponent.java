package com.juaracoding.parabank.pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SidebarComponent {
    private WebDriver driver;
    private By linkOpenNewAccount = By.xpath("//div[@id='leftPanel']/ul/li/a[text()='Open New Account']");

    public SidebarComponent(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLinkOpenNewAccount() {
        driver.findElement(linkOpenNewAccount).click();
    }
}
