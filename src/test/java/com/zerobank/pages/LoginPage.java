package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class LoginPage extends AbstractPageBase{

    @FindBy(css = "#user_login")
    private WebElement username;

    @FindBy(css = "#user_password")
    private WebElement password;

    @FindBy(id = "_submit")
    private WebElement login;

    @FindBy(linkText = "Forgot your password?")
    private WebElement forgotPassword;

    @FindBy(css = "[class='alert alert-error']")
    private WebElement warningMessage;

    //PageFactory.initElements(Driver.getDriver(), this); was implemented in the parent, AbstractBasePage class
    /*
        public LoginPage() {
        //to connect our webdriver, page class and page factory
        //PageFactory - used to use @FindBy annotations
        //PageFactory - helps to find elements easier
        PageFactory.initElements(Driver.getDriver(), this);
    }
     */


    public String getWarningMessageText() {
        return warningMessage.getText();
    }

    /**
     * Method to login, version #1
     * Login as a specific user
     *
     * @param usernameValue
     * @param passwordValue
     */
    public void login(String usernameValue, String passwordValue) {
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(10);
        BrowserUtilities.wait(3);
    }

    /**
     * Method to login, version #2
     * Login as a default user
     * Credentials will be retrieved from configuration.properties file
     */
    public void login() {
        username.sendKeys(ConfigurationReader.getPropertyFromPropertiesFile("userName"));
        password.sendKeys(ConfigurationReader.getPropertyFromPropertiesFile("password"), Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(10);
        BrowserUtilities.wait(3);
    }

    public void login(String role){
        String username = "";
        if (role.equalsIgnoreCase("Driver")) {
            username = "user15";
        }else if (role.equalsIgnoreCase("sales manager")){
            username = "salesmanager115";
        }else if (role.equalsIgnoreCase("store manager")){
            username = "storemanager85";
        }else {
            throw new RuntimeException("Invalid role");
        }
        System.out.println("Login as " + role);
        login(username, "UserUser123");
        FluentWait webDriverWait = new FluentWait<>(driver);
        webDriverWait.withTimeout(Duration.ofSeconds(5)).pollingEvery(1, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

    }
    public static boolean charz(String a, String b){
        Map<Character, Integer> chars = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            chars.put(a.charAt(i), 1);

        }
        return true;
    }
}