 package Tests;

import org.openqa.selenium.By;

public class LoginLogoutApp extends BasePageTest {

    // By  firstLoginButton = By.xpath("//button[contains(text(),'Log in')]");
    By firstLoginButton=By.xpath("//button[@role='button' and .//div[text()='Log in']]");

    By loginWithEmailAndPasswordButton = By.xpath("//div[text()='Log in with email & password']");
    By emailField = By.xpath("//input[@placeholder='Enter email']");
    By passwordField = By.xpath("//input[@placeholder='Enter password']");
    By loginButton = By.xpath("//div[text()='Log in']");
    By loginBtn= By.xpath("(//div[contains(text(),'Log in')])[3]");
    // By loginButton = By.xpath("//button[@role='button' and .//div[contains(text(), 'Log in')]]");
    // By loginButton = By.xpath("//button[@role='button' and .//div[text()='Log in']]");


    By settingsBtn = By.xpath("//span[text()='Settings']");
    By logoutBtn = By.xpath("//div[text()='Logout']");




    public void clickFirstLoginButton() {
        clickElement(firstLoginButton);
    }

    public void clickLoginWithEmailAndPassword() {
        clickElement(loginWithEmailAndPasswordButton);
    }

    public void enterEmail(String email) {
        sendKeys(emailField, email);
    }

    public void enterPassword(String password) {
        sendKeys(passwordField, password);
    }

    public void clickLoginButton() {
        clickElement(loginBtn);
    }

    public void clickSettingsBtn(){
        clickElement(settingsBtn);
    }

    public void clickLogoutBtn(){
        clickElement(logoutBtn);
    }

}
