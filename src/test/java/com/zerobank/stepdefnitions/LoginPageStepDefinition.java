package com.zerobank.stepdefnitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class LoginPageStepDefinition {
    private final com.zerobank.pages.LoginPage loginPage;

    public LoginPageStepDefinition(com.zerobank.pages.LoginPage loginPage) {
        this.loginPage = loginPage;
    }

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
        String expectedTitle = "Zero - Account Summar";
        assertEquals(expectedTitle,actualTitle);
    }

    @When("user logs in with invalid credentials")
    public void user_logs_in_with_invalid_credentials() {
       loginPage.login("asds", "sdasd");
    }

    @Then("Login password are wrong message should be displayed")
    public void login_password_are_wrong_message_should_be_displayed() {
        String expectedWarningText = "Login and/or password are wrong.";
        String actualWarningText = loginPage.getWarningMessageText();
        assertEquals(expectedWarningText,actualWarningText);
    }
    @When("user logs in with no login credentials")
    public void user_logs_in_with_no_login_credentials() {
       loginPage.login("", "");
        System.out.println(loginPage.getWarningMessageText());
        String expectedWarningText = "Login and/or password are wrong.";
        String actualWarningText = loginPage.getWarningMessageText();
        assertEquals(expectedWarningText,actualWarningText);
    }

}
