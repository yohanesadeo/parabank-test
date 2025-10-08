package com.juaracoding.parabank.context;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.juaracoding.parabank.models.User;

public class DriverContext {
    public WebDriver driver;

    public User user;

    public Map<String, String> dataProvider;

}
