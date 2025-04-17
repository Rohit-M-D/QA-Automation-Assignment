
package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;

    // Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    // By usernameField = By.id("username");
    // By passwordField = By.id("password");
    By loginButton = By.className("css-146c3p1 data-[hover=true]:text-primary-500 data-[active=true]:text-primary-500 font-ManropeSemiBold text-base text-typography-4");
    // Actions
    // public void enterUsername(String username) {
    //     driver.findElement(usernameField).sendKeys(username);
    // }

    // public void enterPassword(String password) {
    //     driver.findElement(passwordField).sendKeys(password);
    // }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}

