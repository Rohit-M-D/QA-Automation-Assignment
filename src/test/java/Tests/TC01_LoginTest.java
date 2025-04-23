package Tests;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import Pages.LoginFlow;



// This test case is for verifting whole login-logout process
public class TC01_LoginTest extends LoginFlow {

    @Test
    public void validLoginTest() {
        test = extent.createTest("validLoginTest"); 
            
            clickFirstLoginButton();
            clickLoginWithEmailAndPassword();
            enterEmail(email);
            enterPassword(password);
            clickLoginButton();
            clickSettingsBtn();
            clickLogoutBtn();
            test.log(Status.PASS, "Login and Logout flow passed successfully");
    }




    
}
