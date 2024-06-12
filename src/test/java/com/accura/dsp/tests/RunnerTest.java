package com.accura.dsp.tests;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.service.DriverService;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Landing_screen.feature",
        glue = "com.accura.dsp.definitions"
)
public class RunnerTest {




}
