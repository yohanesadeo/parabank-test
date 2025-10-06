package com.juaracoding.parabank.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {
        "src/test/resources/features/Register.feature"
}, glue = {
        "com.juaracoding.parabank.definitions",
})
public class RunnerTest extends AbstractTestNGCucumberTests {
}
