package com.juaracoding.parabank.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterVerificationDefinition {

    @Given("Buka halaman utama.")
    public void step01() {
        System.out.println("Buka halaman utama.");
    }

    @When("Klik 'Register'.")
    public void step02() {
        System.out.println("Klik 'Register'.");
    }

    @And("Isi semua field dengan data valid & unik.")
    public void step03() {
        System.out.println("Isi semua field dengan data valid & unik.");
    }

    @And("Klik tombol 'Register'.")
    public void step04() {
        System.out.println("Klik tombol 'Register'");
    }

    @Then("Pengguna berhasil terdaftar, melihat pesan selamat datang, dan otomatis login.")
    public void step05() {
        System.out.println("Pengguna berhasil terdaftar, melihat pesan selamat datang, dan otomatis login.");
    }

}