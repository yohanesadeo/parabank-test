package com.juaracoding.parabank.definitions;

import org.testng.Assert;

import com.juaracoding.parabank.context.DriverContext;
import com.juaracoding.parabank.pages.HomePage;
import com.juaracoding.parabank.pages.RegisterPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterVerificationDefinition {
    private HomePage homePage;
    private RegisterPage registerPage;
    private DriverContext driverContext;

    public RegisterVerificationDefinition(DriverContext driverContext) {
        this.driverContext = driverContext;
        homePage = new HomePage(this.driverContext.driver);
        registerPage = new RegisterPage(this.driverContext.driver);
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
        registerPage.setFirstName(driverContext.user.getFirstName());
        registerPage.setLastName(driverContext.user.getLastName());
        registerPage.setAddress(driverContext.user.getAddress());
        registerPage.setCity(driverContext.user.getCity());
        registerPage.setState(driverContext.user.getState());
        registerPage.setZipCode(driverContext.user.getZipCode());
        registerPage.setPhoneNumber(driverContext.user.getPhoneNumber());
        registerPage.setSsn(driverContext.user.getSsn());
        registerPage.setUsername(driverContext.user.getUsername());
        registerPage.setPassword(driverContext.user.getPassword());
        registerPage.setRepeatPassword(driverContext.user.getPassword());
    }

    @And("Klik tombol 'Register'.")
    public void step04() {
        registerPage.clickRegisterButton();
    }

    @Then("Pengguna berhasil terdaftar, melihat pesan selamat datang, dan otomatis login.")
    public void step05() {
        Assert.assertEquals(registerPage.getTitleText(), "Welcome " + driverContext.user.getUsername());
        Assert.assertEquals(registerPage.getParagraphText(),
                "Your account was created successfully. You are now logged in.");
    }

}
