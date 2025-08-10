package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static WebDriver getDriver(String browser) {
        WebDriver driver = switch (browser) {
            case "Chrome" -> new ChromeDriver();
            case "Firefox" -> new FirefoxDriver();
            case "Edge" -> new EdgeDriver();
            default -> throw new IllegalArgumentException("Unsupported browser");
        };
        driver.manage().window().maximize();
        return driver;
    }
}
