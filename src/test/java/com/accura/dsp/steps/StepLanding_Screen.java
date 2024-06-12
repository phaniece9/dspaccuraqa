package com.accura.dsp.steps;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class StepLanding_Screen extends PageObject {
    WebDriver driver;

    public StepLanding_Screen(WebDriver driver)
    {

        super(driver);
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public String getWindowTitle() {

        return getDriver().getTitle();
    }

     public WebElementFacade verifylogo()
     {
         WebElementFacade logo=find(By.xpath("//a[@class='acr-nav__logo-link']"));
         logo.isDisplayed();
         return logo;
     }


}
