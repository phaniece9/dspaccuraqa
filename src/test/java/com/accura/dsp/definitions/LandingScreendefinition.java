package com.accura.dsp.definitions;

import com.accura.dsp.steps.StepLanding_Screen;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class LandingScreendefinition {
    @Managed(driver = "appium")
    AppiumDriver driver;

    @Steps
    StepLanding_Screen landing_screen;
    @Given("I open the URL")
    public void iOpenTheURL() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("noReset", "true");

        //capabilities.setCapability("appPackage", "com.amazon.mShop.android.shopping");
        //capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.get("https://www.acura.com/");

        Thread.sleep(5000);


    }

    @Then("verify the page title")
    public void verifyThePageTitle(){
        landing_screen=new StepLanding_Screen(driver);
        String title= landing_screen.getWindowTitle();
         System.out.println("Window Title: " + title);
        
    }

    @And("verify the accura logo")
    public void verifyTheAccuraLogo() {
        landing_screen=new StepLanding_Screen(driver);
        landing_screen.verifylogo();
    }
}
