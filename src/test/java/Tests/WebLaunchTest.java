package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.cdimascio.dotenv.Dotenv;


public class WebLaunchTest {
    WebDriver driver;
    Dotenv dotenv = Dotenv.load();
    String email = dotenv.get("EMAIL");
    String password = dotenv.get("PASSWORD");
    String url = dotenv.get("URL");

    @BeforeClass(alwaysRun = true)
    public void start() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url);
         
    }
    
    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
