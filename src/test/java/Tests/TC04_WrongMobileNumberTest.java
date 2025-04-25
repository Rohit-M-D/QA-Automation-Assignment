package Tests;

import org.testng.annotations.Test;

import Pages.LoginFlow;


//This test is for wrong mibile number

public class TC04_WrongMobileNumberTest extends LoginFlow {
    String dummyMobNo = "8739383948";
    @Test
    public void wrongMobNoTest() {
            clickFirstLoginButton();
            enterMobileNumber(dummyMobNo);
            clickGetOtpBtn();   
    }
    
}
