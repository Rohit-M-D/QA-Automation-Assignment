package Pages;
import com.aventstack.extentreports.Status;
import io.github.cdimascio.dotenv.Dotenv;

public class LoginFlow extends BaseMethods { 

    Dotenv dotenv = Dotenv.load();
    public String email = dotenv.get("EMAIL");
    public String password = dotenv.get("PASSWORD");
    public String mobNo = getLocators("mobileNumber");

    public void clickFirstLoginButton() {
        driver.navigate().refresh();
        test.log(Status.INFO, "Clicking first login button");
        clickElement(getLocators("firstLoginButton"), "clickFirstLoginButton");
        
    }
    public void clickLoginWithEmailAndPassword() { 
        clickElement(getLocators("loginWithEmailAndPasswordButton"), "clickLoginWithEmailAndPassword");
        test.log(Status.INFO, "Clicked login with email & password");
    }

    public void enterEmail(String email) {
        sendKeys(getLocators("emailField"), email);
        test.log(Status.INFO, "Entered email");
    }

    public void enterPassword(String password) {
        sendKeys(getLocators("passwordField"), password);
        test.log(Status.INFO, "Entered password");
    }

    public void enterMobileNumber(){
        sendKeys(getLocators("otpInput"), mobNo);
        test.log(Status.INFO, "Entered Mobile Number");
    }

    public void clickGetOtpBtn(){
        clickElement(getLocators("getOtpBtn"), "getOtp");
        test.log(Status.INFO, "Clicked otp button");
    }

    public void clickLoginButton() {
        clickElement(getLocators("loginBtn"), "clickLoginButton");
        test.log(Status.INFO, "Clicked login button");
    }

    public void clickSettingsBtn() {
        clickElement(getLocators("settingsBtn"), "clickSettingsBtn");
        test.log(Status.INFO, "Clicking settings button");
    }

    public void clickLogoutBtn() {
        clickElement(getLocators("logoutBtn"), "clickLogoutBtn");
        test.log(Status.INFO, "Clicking logout button");
    }

    public void clickTransactionBtn(){
        clickElement(getLocators("transactionBtn"), "clickTransactionBtn");
        test.log(Status.INFO, "Clicking transaction button");
    }

    public void validate_alertMessageForLoginPage(){
        validatingTextMessage(getLocators("invalidAlertMessage"),"verifying_loginpage","Your authentication information is incorrect. Please try again.");
        test.log(Status.INFO, "Got an alert message");
    }
}
