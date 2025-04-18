 package Demo;

import org.openqa.selenium.By;

public class LoginLogoutApp extends BasePageTest {

    // By  firstLoginButton = By.xpath("//button[contains(text(),'Log in')]");
    By firstLoginButton=By.xpath("//button[@role='button' and .//div[text()='Log in']]");

    By loginWithEmailAndPasswordButton = By.xpath("//div[text()='Log in with email & password']");
    By emailField = By.xpath("//input[@placeholder='Enter email']");
    By passwordField = By.xpath("//input[@placeholder='Enter password']");
    By loginButton = By.xpath("//div[text()='Log in']");
    // By loginButton = By.xpath("//button[@role='button' and .//div[contains(text(), 'Log in')]]");
    // By loginButton = By.xpath("//button[@role='button' and .//div[text()='Log in']]");



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
        clickElement(loginButton);
    }

}
