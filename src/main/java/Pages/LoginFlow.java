package Pages;
import io.github.cdimascio.dotenv.Dotenv;

public class LoginFlow extends BaseMethods { 

    Dotenv dotenv = Dotenv.load();
    public String email = dotenv.get("EMAIL");
    public String password = dotenv.get("PASSWORD");
    public String mobNo = getLocators("mobileNumber");

    public void clickFirstLoginButton() {
        driver.navigate().refresh();
        clickElement(getLocators("firstLoginButton"), "clickFirstLoginButton");
        
    }
    public void clickLoginWithEmailAndPassword() { 
        clickElement(getLocators("loginWithEmailAndPasswordButton"), "clickLoginWithEmailAndPassword");
    }

    public void enterEmail(String email) {
        sendKeys(getLocators("emailField"), email);
    }

    public void enterPassword(String password) {
        sendKeys(getLocators("passwordField"), password);
    }

    public void enterMobileNumber(){
        sendKeys(getLocators("otpInput"), mobNo);
    }

    public void clickGetOtpBtn(){
        clickElement(getLocators("getOtpBtn"), "getOtp");
    }

    public void clickLoginButton() {
        clickElement(getLocators("loginBtn"), "clickLoginButton");
    }

    public void clickSettingsBtn() {
        clickElement(getLocators("settingsBtn"), "clickSettingsBtn");
    }

    public void clickLogoutBtn() {
        clickElement(getLocators("logoutBtn"), "clickLogoutBtn");
    }

    public void clickTransactionBtn(){
        clickElement(getLocators("transactionBtn"), "clickTransactionBtn");

    }

    public void validate_alertMessageForLoginPage(){
        validatingTextMessage(getLocators("invalidAlertMessage"),"verifying_loginpage","Your authentication information is incorrect. Please try again.");
    }
}
