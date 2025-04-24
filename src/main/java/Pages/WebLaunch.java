package Pages;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import TestUtils.ExtentReportNG;

public class WebLaunch {
    public String portalUrl = BaseMethods.getLocators("PortalURL");
    public static WebDriver driver;
    public static ExtentReports extent; // Shared instance

    @BeforeSuite
    public void setUpReport() {
        extent = ExtentReportNG.generateReport();
    }

    @BeforeClass(alwaysRun = true)
    public void start() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(portalUrl);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }

    public static String getScreenshotPath(String testcaseName, WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String relativePath = "screenshots/" + testcaseName + ".png";
        String destinationPath = System.getProperty("user.dir") + "/reports/" + relativePath;

        // Create screenshots directory if it doesn't exist
        File directory = new File(System.getProperty("user.dir") + "/reports/screenshots");
        if (!directory.exists()) {
            directory.mkdirs();
        }

        File destinationFile = new File(destinationPath);
        FileUtils.copyFile(source, destinationFile);
        return relativePath;
    }
}