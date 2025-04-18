package Demo;
import org.testng.annotations.Test;

public class LoginTest extends LoginLogoutApp {

    @Test
    public void test() throws InterruptedException {

        driver.navigate().refresh();

        // Wait for the page to load naturally instead of refresh + sleep
        Thread.sleep(3000); // optional if you want to visually see the flow

        clickFirstLoginButton();
        
        Thread.sleep(2000);

        clickLoginWithEmailAndPassword();
        Thread.sleep(1000);

        enterEmail("chandan.n+10jul23@datman.je");
        enterPassword("Datman@123");

        Thread.sleep(500);

        try {
            clickLoginButton();
        } catch (Exception e) {
            System.out.println("Login button click failed: " + e.getMessage());
        }
    }  
}
