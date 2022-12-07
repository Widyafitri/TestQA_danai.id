package com.adiwisista.qatest.step_definitions;

import com.adiwisista.qatest.pages.Login;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private Login login = new Login();

    public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("TCC.003 User input data login dan kosongkan kode perusahaan")
    public void user_kosongkan_kode_perusahaan() {
        this.login.login("", "23fortest@gmail.com","$Test123");
        extentTest.log(LogStatus.PASS, "User input data login dan kosongkan kode perusahaan");
    }

    @And("TCC.003 User klik button login")
    public void user_click_button_login_kosongkan_kode_perusahaan() {
        this.login.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User klik button login");
    }

    @Then("TCC.003 User gagal login, Company code tidak boleh kosong")
    public void alert_kode_perusahaan_kosong() {
        Assert.assertEquals(this.login.getTxtAlertKode(), "Company code tidak boleh kosong");
        extentTest.log(LogStatus.PASS, "User gagal login, Company code tidak boleh kosong");
    }

    @When("TCC.004 User input data login dan kosongkan Username")
    public void user_kosongkan_username() {
        this.login.login("PD49", "","$Test123");
        extentTest.log(LogStatus.PASS, "User input data login dan kosongkan Username");
    }

    @And("TCC.004 User klik button login")
    public void user_click_button_login_kosongkan_username() {
        this.login.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User klik button login");
    }

    @Then("TCC.004 User gagal login, Username tidak boleh kosong")
    public void alert_username_kosong() {
        Assert.assertEquals(this.login.getTxtAlertUsername(), "Username tidak boleh kosong");
        extentTest.log(LogStatus.PASS, "User gagal login, Username tidak boleh kosong");
    }

    @When("TCC.005 User input data login dan kosongkan Password")
    public void user_kosongkan_password() {
        this.login.login("PD49", "23fortest@gmail.com","");
        extentTest.log(LogStatus.PASS, "User input data login dan kosongkan Password");
    }

    @And("TCC.005 User klik button login")
    public void user_click_button_login_kosongkan_password() {
        this.login.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User klik button login");
    }

    @Then("TCC.005 User gagal login, Password tidak boleh kosong")
    public void alert_password_kosong() {
        Assert.assertEquals(this.login.getTxtAlerPassword(), "Password tidak boleh kosong");
        extentTest.log(LogStatus.PASS, "User gagal login, Password tidak boleh kosong");
    }

}
