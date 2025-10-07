package com.juaracoding.parabank.hooks;

import java.util.HashMap;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.juaracoding.parabank.context.DriverContext;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DriverHook {
    private DriverContext driverContext;

    public DriverHook(DriverContext driverContext) {
        this.driverContext = driverContext;
        this.driverContext.password = "123qwe";
        this.driverContext.username = "YanzenSquadDev";
        this.driverContext.dataProvider = new HashMap<>();
        this.driverContext.dataProvider.put("username", "andika");
        this.driverContext.dataProvider.put("password", "123qweqwe");
    }

    @Before
    public void setup() {
        driverContext.driver = new FirefoxDriver();
        driverContext.driver.manage().window().maximize();
    }

    @After
    public void teardown() throws InterruptedException {
        if (driverContext.driver != null) {
            Thread.sleep(4000);
            // driverContext.driver.quit();
            driverContext.dataProvider = null;
        }
    }
}
