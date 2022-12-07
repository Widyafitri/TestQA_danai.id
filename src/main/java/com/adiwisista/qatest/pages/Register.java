package com.adiwisista.qatest.pages;

import com.adiwisista.qatest.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {

    private WebDriver driver;

    public Register() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "btn-gabung")
    WebElement btnGabung;

    @FindBy(name = "//div[@class='dialog-footer']")
    WebElement btnSyaratKetentuan;





}
