package Demo;
import org.testng.annotations.Test;
import io.github.cdimascio.dotenv.Dotenv;

public class LoginTest extends LoginLogoutApp {

    @Test
    public void test() throws InterruptedException {
        Dotenv dotenv = Dotenv.load();
        String email = dotenv.get("EMAIL");
        String password = dotenv.get("PASSWORD");

        driver.navigate().refresh();

        // Wait for the page to load naturally instead of refresh + sleep
        Thread.sleep(3000); // optional if you want to visually see the flow

        clickFirstLoginButton();
        
        Thread.sleep(2000);

        clickLoginWithEmailAndPassword();
        Thread.sleep(1000);

        enterEmail(email);
        enterPassword(password);

        Thread.sleep(500);

        try {
            clickLoginButton();
        } catch (Exception e) {
            System.out.println("Login button click failed: " + e.getMessage());
        }
    }  
}
