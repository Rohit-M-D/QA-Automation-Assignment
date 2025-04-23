package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import utils.ExtentReportManager;
public class WebLaunch extends ExtentReportManager {
    public String portalUrl = BaseMethods.getLocators("PortalURL");
    public static WebDriver driver;

    @BeforeSuite
    public void setUpReport() {
        extent = ExtentReportManager.getInstance();
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

     @AfterSuite
    public void flushReport() {
        extent.flush(); 
    }
}