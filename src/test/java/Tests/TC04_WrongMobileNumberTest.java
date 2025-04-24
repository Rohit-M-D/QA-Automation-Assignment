package Tests;

import org.testng.annotations.Test;

import Pages.LoginFlow;


//This test is for wrong mibile number

public class TC04_WrongMobileNumberTest extends LoginFlow {
    String dummyMobNo = "0000000000";
    @Test
    public void otpPageTest() {
        
        
            clickFirstLoginButton();
            enterMobileNumber(dummyMobNo);
            clickGetOtpBtn();   
    }
    
}
