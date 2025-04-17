// package Demo;

// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.testng.annotations.AfterClass;
// import org.testng.annotations.BeforeClass;

// public class WebLaunch {
//     WebDriver driver;

//     @BeforeClass(alwaysRun = true)
//     public void setUp() throws InterruptedException {
//         driver = new ChromeDriver();
//         driver.get("https://datman--6n98h2um82.expo.app/");
//         Thread.sleep(4000);
        
//     }


//     @AfterClass(alwaysRun = true)
//     public void tearDown() {
//         driver.quit();
//     }
// }
package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Demo.BasePage;;

public class WebLaunch {

    @Test
    public void testLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://datman--6n98h2um82.expo.app/otp-signin");

        // BasePage login = new BasePage(driver);
        // login.enterUsername("testuser");
        // login.enterPassword("password123");
        // login.clickLogin();
        Thread.sleep(5000);

        driver.quit();
    }
}
