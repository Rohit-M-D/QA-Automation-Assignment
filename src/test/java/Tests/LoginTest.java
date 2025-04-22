package Tests;
import org.testng.annotations.Test;

public class LoginTest extends LoginLogoutApp {

    @Test
    public void test() {
        driver.navigate().refresh();
        clickFirstLoginButton();
        clickLoginWithEmailAndPassword();
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
        clickSettingsBtn();
        clickLogoutBtn();

    }  
}
