package com.juaracoding.parabank.definitions;

import org.testng.Assert;

import com.juaracoding.parabank.context.DriverContext;
import com.juaracoding.parabank.pages.LoginPage;
import com.juaracoding.parabank.pages.OpenNewAccountPage;
import com.juaracoding.parabank.pages.components.SidebarComponent;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenNewAccountCheckingDefinition {

  private DriverContext driverContext;
  private LoginPage loginPage;
  private OpenNewAccountPage openNewAccountPage;
  private SidebarComponent sidebarComponent;

  public OpenNewAccountCheckingDefinition(DriverContext driverContext) {
    this.driverContext = driverContext;
    loginPage = new LoginPage(this.driverContext.driver);
    sidebarComponent = new SidebarComponent(this.driverContext.driver);
    openNewAccountPage = new OpenNewAccountPage(this.driverContext.driver);
  }

  @Given("Pengguna sudah login.")
  public void preCondition() {
    driverContext.driver.get("https://parabank.parasoft.com/parabank/index.htm");
    loginPage.setUsername(driverContext.user.getUsername());
    loginPage.setPassword(driverContext.user.getPassword());
    loginPage.clickLogInButton();
  }

  @When("Klik menu 'Open New Account'.")
  public void step01() throws InterruptedException {
    Thread.sleep(1500);
    sidebarComponent.clickLinkOpenNewAccount();
  }

  @And("Pilih 'CHECKING'.")
  public void step02() throws InterruptedException {
    Thread.sleep(1500);
    // openNewAccountPage.setSelectType("CHECKING");
  }

  @And("Klik 'Open New Account'.")
  public void step03() throws InterruptedException {
    Thread.sleep(1500);
    openNewAccountPage.clickOpenNewAccount();
  }

  @Then("Sistem menampilkan pesan 'Account Opened!' dan nomor rekening baru.")
  public void step04() throws InterruptedException {
    Thread.sleep(1500);
    String newAccountId = openNewAccountPage.getNewAccountId();

    Assert.assertNotNull(newAccountId);
    Assert.assertTrue(newAccountId.length() == 5);
    Assert.assertEquals(openNewAccountPage.getOpenAccountResult(), "Account Opened!");
  }
}
