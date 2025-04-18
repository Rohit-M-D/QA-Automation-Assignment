package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class WebLaunchTest {
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void start() throws InterruptedException {

        driver = new ChromeDriver();

        driver.get("https://datman--6n98h2um82.expo.app/");
         
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
