package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;
    private static final int TIMEOUT_SECONDS = 10;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    private WebElement find(By locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_SECONDS))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    protected void click(By locator){
        driver.findElement(locator).click();
    }
    protected void clearAndEnterText(By locator, String text) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }
    protected String getText(By locator) {
        return  driver.findElement(locator).getText();
    }
}
