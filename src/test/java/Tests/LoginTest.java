package Tests;
import org.testng.annotations.Test;

public class LoginTest extends LoginLogoutApp {

    @Test
    public void test() throws InterruptedException {
        

        driver.navigate().refresh();

        Thread.sleep(3000); 

        clickFirstLoginButton();
        
        Thread.sleep(2000);

        clickLoginWithEmailAndPassword();
        Thread.sleep(1000);

        enterEmail(email);
        enterPassword(password);

        Thread.sleep(500);

        clickLoginButton();

        Thread.sleep(7000);

        clickSettingsBtn();

        Thread.sleep(7000);

        clickLogoutBtn();

        Thread.sleep(10000);
    }  
}
