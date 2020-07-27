package com.zerobank.stepdefnitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginStepDefinitions {
    private final LoginPage loginPage;

    public LoginStepDefinitions(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

//    LoginPage loginPage = new LoginPage();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("user is on the login page");
    }

    @When("user logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        loginPage.login();
    }

    @Then("Account summary page should be displayed.")
    public void account_summary_page_should_be_displayed() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Zero - Account Summary";
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("user logs in with invalid credentials")
    public void user_logs_in_with_invalid_credentials() {
       loginPage.login("asds", "sdasd");
        String expectedWarningText = "Login and/or password are wrong.";
        String actualWarningText = loginPage.getWarningMessageText();
        Assert.assertEquals(expectedWarningText,actualWarningText);
    }

    @Then("Login password are wrong message should be displayed")
    public void login_password_are_wrong_message_should_be_displayed() {

    }
    @When("user logs in with no login credentials")
    public void user_logs_in_with_no_login_credentials() {
       loginPage.login("", "");
        System.out.println(loginPage.getWarningMessageText());
    }

}
