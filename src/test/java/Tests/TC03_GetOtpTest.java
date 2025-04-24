package Tests;

import org.testng.annotations.Test;
import Pages.LoginFlow;

//This test case is for verifying OTP button

public class TC03_GetOtpTest extends LoginFlow {
    String dummyMobNo = "0000000000";

    @Test
    public void otpPageTest() {
        
            clickFirstLoginButton();
            enterMobileNumber(dummyMobNo);
            clickGetOtpBtn();
            
    }
    
}
