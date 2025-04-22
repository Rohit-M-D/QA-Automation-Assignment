package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.cdimascio.dotenv.Dotenv;
import utils.ExtentReportManager;

public class WebLaunch extends ExtentReportManager {
    public WebDriver driver;
    protected static ExtentReports extent;
    protected static ExtentTest test;
    Dotenv dotenv = Dotenv.load();
    public String email = dotenv.get("EMAIL");
    public String password = dotenv.get("PASSWORD");
    public String url = dotenv.get("URL");


    @BeforeSuite
    public void setUpReport() {
        extent = ExtentReportManager.getInstance();
    }

    @BeforeClass(alwaysRun = true)
    public void start() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url);
         
    }

    public WebDriver getDriver() {
        return driver;
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
