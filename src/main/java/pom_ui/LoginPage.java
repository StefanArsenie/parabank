package pom_ui;

import helper.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public static final By userName = By.cssSelector("input[name='username']");
    public static final By password = By.cssSelector("input[name='password']");
    public static final By loginButton = By.cssSelector("input[value='Log In']");
    public static final By registerLink = By.linkText("Register");
    public static final By accountOverview = By.linkText("Accounts Overview");
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void enterUsername(String username) {

    }
    public void enterPassword(String passwd) {
        driver.findElement(password).sendKeys(passwd);
    }
    public void clickOnLoginButton() {
        driver.findElement(loginButton).click();
    }
    public void clickOnRegisterLink() {
        driver.findElement(registerLink).click();
    }
    public String getAccountOverviewText() {
        return driver.findElement(accountOverview).getText();
    }
}
