package com.juaracoding.parabank.runners;

import org.testng.annotations.BeforeClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {
        "src/test/resources/features/Register.feature"
}, glue = {
        "com.juaracoding.parabank.hooks",
        "com.juaracoding.parabank.definitions",
}
// plugin = { "pretty" }
)
public class RunnerTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Ini before class!");
    }

}