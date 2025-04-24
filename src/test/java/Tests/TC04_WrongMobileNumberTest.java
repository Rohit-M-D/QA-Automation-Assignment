package Tests;

import org.testng.annotations.Test;

import Pages.LoginFlow;


//This test is for wrong mibile number

public class TC04_WrongMobileNumberTest extends LoginFlow {
    @Test
    public void otpPageTest() {
        
            clickFirstLoginButton();
            enteredWrongMobileNumber();
            clickGetOtpBtn();
            
    }
    
}
