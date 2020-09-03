package com.zerobank.stepdefnitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;

class AccountSummaryPage3 {
    private com.zerobank.pages.AccountSummaryPage accountSummaryPage;

    public void AccountSummaryPage2(AccountSummaryPage accountSummaryPage) {
        this.accountSummaryPage = accountSummaryPage;
    }

    public AccountSummaryPage3(AccountSummaryPage accountSummaryPage) {
        this.accountSummaryPage = accountSummaryPage;
    }

//    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    @Then("the page title should be <Account summary>")
    public void the_page_title_should_be_Account_summary() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Zero - Account Summary";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("user verifies the account summary has the following account_types")
    public void user_verifies_the_account_summary_has_the_following_account_types(List<String> account_types) {
        for (String account_type : account_types) {
            accountSummaryPage.verifyAccounts(account_type);
            BrowserUtilities.waitForPageToLoad(2);
        }

    }

    @Then("user verifies that Credit Accounts table contains following columns")
    public void user_verifies_that_Credit_Accounts_table_contains_columns_columns(List<String> columns) {
        accountSummaryPage.verifyAccountColumn(columns.get(0));
        accountSummaryPage.verityCreditColumn(columns.get(1));
        accountSummaryPage.verifyBalanceColumn(columns.get(2));
    }





}
