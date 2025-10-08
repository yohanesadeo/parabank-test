package com.juaracoding.parabank.definitions;

import org.testng.Assert;

import com.juaracoding.parabank.context.DriverContext;
import com.juaracoding.parabank.pages.HomePage;
import com.juaracoding.parabank.pages.RegisterPage;
import com.juaracoding.parabank.utils.TextGen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterVerificationDefinition {
    private HomePage homePage;
    private RegisterPage registerPage;
    private DriverContext driverContext;
    private String randomUsername;

    public RegisterVerificationDefinition(DriverContext driverContext) {
        this.driverContext = driverContext;
        homePage = new HomePage(this.driverContext.driver);
        registerPage = new RegisterPage(this.driverContext.driver);
        randomUsername = TextGen.getRandomString(10);
    }

    @Given("Buka halaman utama.")
    public void step01() {
        driverContext.driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("Klik 'Register'.")
    public void step02() {
        homePage.clickRegisterLink();
    }

    @And("Isi semua field dengan data valid & unik.")
    public void step03() {
        registerPage.setFirstName("User " + randomUsername);
        registerPage.setLastName("Santoso");
        registerPage.setAddress("Jl. Jalanan");
        registerPage.setCity("Jakarta");
        registerPage.setState("Indonesia");
        registerPage.setZipCode("11234");
        registerPage.setPhoneNumber("0895567123");
        registerPage.setSsn("123456");
        registerPage.setUsername(randomUsername);
        registerPage.setPassword("123qwe");
        registerPage.setRepeatPassword("123qwe");
    }

    @And("Klik tombol 'Register'.")
    public void step04() {
        registerPage.clickRegisterButton();
    }

    @Then("Pengguna berhasil terdaftar, melihat pesan selamat datang, dan otomatis login.")
    public void step05() {
        Assert.assertEquals(registerPage.getTitleText(), "Welcome " + randomUsername);
        Assert.assertEquals(registerPage.getParagraphText(),
                "Your account was created successfully. You are now logged in.");
    }

}
