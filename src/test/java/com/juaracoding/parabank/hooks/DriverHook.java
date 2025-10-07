package com.juaracoding.parabank.hooks;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DriverHook {

    private WebDriver driver;

    protected WebDriver getDriver() {
        return driver;
    }

    @Before
    public void setup() {
        System.out.println("setup");
        // FirefoxOptions options = new FirefoxOptions();
        // options.addArguments("--incognito");
        // driver = new FirefoxDriver();
        // driver.get(baseURL);
    }

    @After
    public void teardown() {
        // driver.quit();
        System.out.println("teardown");
    }
}
