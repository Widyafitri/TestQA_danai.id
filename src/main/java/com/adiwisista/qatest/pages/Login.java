package com.adiwisista.qatest.pages;

import com.adiwisista.qatest.driver.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    private WebDriver driver;

    public Login() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "login-form:j_idt60")
    WebElement inputKode;

    @FindBy(name = "login-form:inputUsername")
    WebElement inputUsername;

    @FindBy(name = "login-form:inputPassword")
    WebElement inputPassword;

    @FindBy(xpath = "//button[@id='login-form:j_idt66']")
    WebElement btnLogin;

    @FindBy(xpath = "//p[normalize-space()='Company code tidak boleh kosong']")
    WebElement alertKode;

    @FindBy(xpath = "//p[normalize-space()='Username tidak boleh kosong']")
    WebElement alertUsername;

    @FindBy(xpath = "//p[normalize-space()='Password tidak boleh kosong']")
    WebElement alertPassword;


    public void login(String inputKode, String inputUsername, String inputPassword){
        this.inputKode.sendKeys(inputKode);
        this.inputUsername.sendKeys(inputUsername);
        this.inputPassword.sendKeys(inputPassword);

    }

    public void clickBtnLogin() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnLogin);
    }

    public String getTxtAlertKode() {
        return alertKode.getText();
    }

    public String getTxtAlertUsername() {
        return alertUsername.getText();
    }

    public String getTxtAlerPassword() {
        return alertPassword.getText();
    }


}
