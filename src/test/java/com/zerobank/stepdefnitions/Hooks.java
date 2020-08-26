package com.zerobank.stepdefnitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {

    LoginPage loginPage = new LoginPage();
    WebDriver driver;

    @Before
    public void setup() {
        System.out.println("Login setup");
        Driver.getDriver().get(ConfigurationReader.getPropertyFromPropertiesFile("url"));
        loginPage.clickOnSignInButton();

    }

    @After
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()){
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
            byte[] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.embed(image, "image/png", scenario.getName());
        }
        System.out.println("Test clean up");
        Driver.closeDriver();
    }
}
