package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AccountSummaryPage extends AbstractPageBase {

    public void verifyAccounts(String account) {
        List<WebElement> elementsLst = driver.findElements(By.xpath("//*[text()='" + account + "']"));
        List<String> we = new ArrayList<>(BrowserUtilities.getTextFromWebElements(elementsLst));
        for (String elements : we) {
            assertEquals(elements, account);
            System.out.println(account + " verified");
        }
    }

    @FindBy(xpath = "(//th[text()='Account'])[3]")
    private WebElement account;

    public void verifyAccountColumn(String expectedText) {
        assertEquals(account.getText(), expectedText);
        System.out.println("Account column verified");
    }

    @FindBy(xpath = "(//th[text()='Credit Card'])")
    private WebElement CreditCard;

    public void verityCreditColumn(String expectedText) {
        assertEquals(CreditCard.getText(), expectedText);
        System.out.println("Credit Card column verified");
    }

    @FindBy(xpath = "(//th[text()='Balance'])[3]")
    private WebElement balance;

    public void verifyBalanceColumn(String expectedText) {
        assertEquals(balance.getText(), expectedText);
        System.out.println("Balance column verified");
    }

}
