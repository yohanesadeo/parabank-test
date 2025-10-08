package com.juaracoding.parabank.runners;

import org.testng.annotations.BeforeClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {
    "src/test/resources/features/01_Register.feature",
    "src/test/resources/features/02_Account.feature",
}, glue = {
    "com.juaracoding.parabank.hooks",
    "com.juaracoding.parabank.definitions",
}, tags = (""), plugin = {
    "pretty",
    "html:target/cucumber-reports.html",
    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
})
public class RunnerTest extends AbstractTestNGCucumberTests {

  @BeforeClass
  public void beforeClass() {
    System.out.println("Ini before class!");
  }

}
