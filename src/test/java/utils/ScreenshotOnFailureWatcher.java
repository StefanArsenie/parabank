package utils;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Supplier;

public class ScreenshotOnFailureWatcher implements TestWatcher {

    private final Supplier<WebDriver> driverSupplier;

    public ScreenshotOnFailureWatcher(Supplier<WebDriver> driverSupplier) {
        this.driverSupplier = driverSupplier;
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        try {
            WebDriver driver = driverSupplier.get();
            System.out.println("Driver available: " + (driver != null));
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Failure Screenshots", "image/png", new ByteArrayInputStream(screenshot), "png");
            String testName = context.getDisplayName().replaceAll("[^a-zA-Z0-9.-]", "_");
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            File screenshotsDir = new File("target/screenshots");
            Files.createDirectories(screenshotsDir.toPath());
            File screenshotFile = new File(screenshotsDir, testName + "_" + timestamp + ".png");
            Files.write(screenshotFile.toPath(), screenshot);
        } catch (Exception e) {
            System.out.println("Could not take screenshot: " + e.getMessage());
        }
    }
}
