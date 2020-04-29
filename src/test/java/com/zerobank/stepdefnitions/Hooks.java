package com.zerobank.stepdefnitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;


public class Hooks {

    LoginPage loginPage = new LoginPage();

    @Before
    public void setup() {
        System.out.println("Login setup");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.clickOnSignInButton();
    }


    @After
    public void teardown() {
        Driver.closeDriver();
    }
}
