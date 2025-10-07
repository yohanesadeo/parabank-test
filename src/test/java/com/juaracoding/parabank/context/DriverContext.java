package com.juaracoding.parabank.context;

import java.util.Map;

import org.openqa.selenium.WebDriver;

public class DriverContext {
    public WebDriver driver;

    public String username;
    public String password;

    public Map<String, String> dataProvider;
}
