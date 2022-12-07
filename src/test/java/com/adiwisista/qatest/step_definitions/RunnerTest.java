package com.adiwisista.qatest.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {
                "src/main/resources/features/01.Url.feature",
                //"src/main/resources/features/02.Register.feature",
        "src/main/resources/features/03.Login.feature"},
        glue = "com.adiwisista.qatest.step_definitions",
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {
}
