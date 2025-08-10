package utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class BaseTestClass {
    protected WebDriver driver;

    @RegisterExtension
    ScreenshotOnFailureWatcher watcher = new ScreenshotOnFailureWatcher(() -> driver);


    @BeforeEach
    public void setup(TestInfo testInfo) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/test/resources/config.properties"));
        String browser = properties.getProperty("browser");
        driver = WebDriverFactory.getDriver(browser);

    }
    @AfterEach
    public void teardown() {
        driver.quit();
    }
}
