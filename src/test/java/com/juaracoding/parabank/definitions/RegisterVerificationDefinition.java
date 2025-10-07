package com.juaracoding.parabank.definitions;

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
        System.out.println("Klik register");
        homePage.clickRegisterLink();
    }

    @And("Isi semua field dengan data valid & unik.")
    public void step03() {
        registerPage.inputFirstName("User " + randomUsername);
        registerPage.inputLastName("Santoso");
        registerPage.inputAddress("Blok M");
        registerPage.inputCity("Bandung");
        registerPage.inputState("Jawa Barat");
        registerPage.inputZip("12345");
        registerPage.inputPhone("08123456789");
        registerPage.inputSSN("123456789");
        registerPage.inputUsername(randomUsername);
        registerPage.inputPassword("123qwe");
        registerPage.inputConfirmPassword("123qwe");
        registerPage.clickRegisterButton();
    }

    @And("Klik tombol 'Register'.")
    public void step04() {

    }

    @Then("Pengguna berhasil terdaftar, melihat pesan selamat datang, dan otomatis login.")
    public void step05() {

    }

}
