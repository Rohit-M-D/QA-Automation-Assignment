package Tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Pages.LoginFlow;
import utils.TakeScreenshot;

public class TC02_InvalidLoginTest extends LoginFlow {
    String pswd = "Datman@122";

    @Test(priority = 2)
    public void invalidLoginTest() {
        test = extent.createTest("invalidLoginTest"); 
        try {
            test.log(Status.INFO, "Clicking first login button");
            clickFirstLoginButton();

            test.log(Status.INFO, "Clicking login with email & password");
            clickLoginWithEmailAndPassword();

            test.log(Status.INFO, "Entering email");
            enterEmail(email);

            test.log(Status.INFO, "Entering password");
            enterPassword(pswd);

            test.log(Status.INFO, "Clicking login button");
            clickLoginButton();

            test.log(Status.INFO, "Clicking settings button");
            clickSettingsBtn();

            test.log(Status.INFO, "Clicking logout button");
            clickLogoutBtn();

            test.log(Status.PASS, "Login and Logout flow passed successfully");

        } catch (Exception e) {
            test.log(Status.FAIL, "Test failed with exception: " + e.getMessage());
            TakeScreenshot.takeScreenshot("invalidLoginTest");  
        }
    }

}
