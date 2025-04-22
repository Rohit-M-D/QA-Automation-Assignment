package Pages;

public class LoginFlow extends BaseMethods{

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
}
