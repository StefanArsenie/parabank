package pom_ui;

import helper.BasePage;
import helper.RegisterPageBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {
    public static final By firstName = By.cssSelector("#customer\\.firstName");
    public static final By lastName = By.cssSelector("#customer\\.lastName");
    public static final By address = By.cssSelector("#customer\\.address\\.street");
    public static final By city = By.cssSelector("#customer\\.address\\.city");
    public static final By state = By.cssSelector("#customer\\.address\\.state");
    public static final By zipCode = By.cssSelector("#customer\\.address\\.zipCode");
    public static final By phoneNumber = By.cssSelector("#customer\\.phoneNumber");
    public static final By ssn = By.cssSelector("#customer\\.ssn");
    public static final By userName = By.cssSelector("#customer\\.username");
    public static final By password = By.cssSelector("#customer\\.password");
    public static final By repeatedPassword = By.cssSelector("#repeatedPassword");
    public static final By registerButton = By.cssSelector("input[value='Register']");
    public static final By titleRegister = By.xpath("//h1[contains(text(),'Welcome')]");
    public static final By userNameError = By.cssSelector("#customer\\.username\\.errors");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    public void enterFirstName(String firstname) {
        clearAndEnterText(firstName, firstname);
    }
    public void enterLastName(String lastname) {
        clearAndEnterText(lastName, lastname);
    }
    public void enterAddress(String addressParam) {
        clearAndEnterText(address, addressParam);
    }
    public void enterCity(String cityParam) {
        clearAndEnterText(city, cityParam);
    }
    public void enterState(String stateParam) {
        clearAndEnterText(state, stateParam);
    }
    public void enterZipCode(String zipCodeParam) {
        clearAndEnterText(zipCode, zipCodeParam);
    }
    public void enterPhoneNumber(String phoneNumberParam) {
        clearAndEnterText(phoneNumber, phoneNumberParam);
    }
    public void enterSocialSecurityNumber(String ssnParam) {
        clearAndEnterText(ssn, ssnParam);
    }
    public void enterUserName(String userNameParam) {
        clearAndEnterText(userName, userNameParam);
    }
    public void enterPassword(String pass) {
        clearAndEnterText(password, pass);
    }
    public void enterPasswordSecondTime(String passSecondTime) {
        clearAndEnterText(repeatedPassword, passSecondTime);
    }
    public void clickOnRegisterButton() {
        click(registerButton);
    }
    public String getTitle() {
        return getText(titleRegister);
    }
    public String getUsernameError() {
        return getText(userNameError);
    }
    public void register(RegisterPageBuilder registerPageBuilder) {
        enterFirstName(registerPageBuilder.getFirstName());
        enterLastName(registerPageBuilder.getLastName());
        enterAddress(registerPageBuilder.getAddress());
        enterCity(registerPageBuilder.getCity());
        enterState(registerPageBuilder.getState());
        enterZipCode(registerPageBuilder.getZipCode());
        enterPhoneNumber(registerPageBuilder.getPhoneNumber());
        enterSocialSecurityNumber(registerPageBuilder.getSsn());
        enterUserName(registerPageBuilder.getUsername());
        enterPassword(registerPageBuilder.getPassword());
        enterPasswordSecondTime(registerPageBuilder.getRepeatedPassword());
        clickOnRegisterButton();
    }
}
