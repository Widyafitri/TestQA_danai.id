package com.adiwisista.qatest.pages;

import com.adiwisista.qatest.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Url {

    private WebDriver driver;

    public Url() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3[@class='panel-title']")
    WebElement txtValidUrl;

    @FindBy(xpath = "//*[@id=\"error-message\"]/div/p[1]")
    WebElement txtInvalidUrl;


    public String getTxtValidUrl() {
        return txtValidUrl.getText();
    }

    public String getTxtInvalidUrl() {
        return txtInvalidUrl.getText();
    }



}
