package com.adiwisista.qatest.step_definitions;

import com.adiwisista.qatest.pages.Url;
import com.adiwisista.qatest.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.adiwisista.qatest.step_definitions.Hooks.delay;

public class TestUrl {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private Url url = new Url();

    public TestUrl() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Test Case Invalid URL

    @When("TCC.001 User enter invalid URL")
    public void user_enter_invalid_url() {
        delay(4);
        driver.get(Constants.INVALID_URL);
        extentTest.log(LogStatus.PASS, "User enter invalid URL");
    }

    @Then("TCC.001 User gagal mengakses web danai.id")
    public void user_gagal_mengakses_web() {
        delay(4);
        Assert.assertEquals(url.getTxtInvalidUrl(), "Maaf, halaman yang Anda akses tidak ada.");
        extentTest.log(LogStatus.PASS, "User gagal mengakses web danai.id");
    }

    //Test Case Vlaid URL
    @When("TCC.002 User enter valid URL")
    public void user_enter_valid_url() {
        driver.get(Constants.VALID_URL);
        extentTest.log(LogStatus.PASS, "User enter valid URL");
    }

    @Then("TCC.002 User berhasil mengakses web danai.id")
    public void user_berhasil_mengakses_web() {
        Assert.assertEquals(url.getTxtValidUrl(), "SELAMAT DATANG");
        extentTest.log(LogStatus.PASS, "User berhasil mengakses web danai.id");
    }

}
