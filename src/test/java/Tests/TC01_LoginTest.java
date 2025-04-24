package Tests;
import org.testng.annotations.Test;
import Pages.LoginFlow;


// This test case is for verifting whole login-logout process
public class TC01_LoginTest extends LoginFlow {

    @Test
    public void validLoginTest() {
        
            clickFirstLoginButton();
            clickLoginWithEmailAndPassword();
            enterEmail(email);
            enterPassword(password);
            clickLoginButton();
            clickSettingsBtn();
            clickLogoutBtn();
            validate_alertMessageforLogout();
            
    }




    
}
