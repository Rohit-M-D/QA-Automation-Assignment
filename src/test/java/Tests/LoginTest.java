package Tests;
import org.testng.annotations.Test;
import Pages.LoginFlow;

public class LoginTest extends LoginFlow {
    @Test(priority = 1)
    public void validLoginTest() {
        clickFirstLoginButton();
        clickLoginWithEmailAndPassword();
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
        clickSettingsBtn();
        clickLogoutBtn();
    } 
}
