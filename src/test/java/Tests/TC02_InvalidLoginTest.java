package Tests;
import org.testng.annotations.Test;
import Pages.LoginFlow;


// This test is for verifying invalid login credentials 

public class TC02_InvalidLoginTest extends LoginFlow {
    String pswd = "Datman@122";

    @Test
    public void invalidLoginTest() {
        
    
            clickFirstLoginButton();
            clickLoginWithEmailAndPassword();           
            enterEmail(email);           
            enterPassword(pswd);           
            clickLoginButton();
            validate_alertMessageForLoginPage();
              
    }

}
