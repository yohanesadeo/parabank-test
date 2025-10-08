package com.juaracoding.parabank.hooks;


import org.openqa.selenium.firefox.FirefoxDriver;

import com.juaracoding.parabank.context.DriverContext;
import com.juaracoding.parabank.models.User;
import com.juaracoding.parabank.utils.TextGen;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DriverHook {
    private DriverContext driverContext;
    private static String random;

    public DriverHook(DriverContext driverContext) {
        this.driverContext = driverContext;
        if (random == null) {
            random = TextGen.getRandomString(5);
        }
        this.driverContext.user = new User();
        this.driverContext.user.setFirstName("Budi");
        this.driverContext.user.setLastName("Andika");
        this.driverContext.user.setAddress("Jl. Kemangi");
        this.driverContext.user.setCity("Jakarta Barat");
        this.driverContext.user.setState("Indonesia");
        this.driverContext.user.setZipCode("11234");
        this.driverContext.user.setPhoneNumber("02122211221");
        this.driverContext.user.setSsn("12345");
        this.driverContext.user.setUsername("budi_" + random);
        this.driverContext.user.setPassword("123qwe");

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
            driverContext.driver.quit();
            driverContext.dataProvider = null;
        }
    }
}
