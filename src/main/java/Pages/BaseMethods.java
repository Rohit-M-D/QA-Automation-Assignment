
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseMethods extends WebLaunch {
    static Properties properties = new Properties();

    public void sendKeys(String locator, String value) {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(45))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        element.clear();
        element.sendKeys(value);
    }

    public void clickElement(String locator, String methodName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator))).click();
            System.out.println("Clicked: " + locator);
    }

    public void validatingTextMessage(String locator, String methodName, String expectedMessage) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
            WebElement actualMessage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
            System.out.println("Verifying the page label: "+actualMessage.getText());
            Assert.assertEquals(actualMessage.getText(), expectedMessage, "The messages do not match!");
        } catch (Exception e) {
            System.out.println("Exception in method: " + methodName);
            System.out.println("Reason: " + e.getMessage());
        }
    }

    public static String getLocators(String value) {
        try {
            File folder = new File("src/resources");
            File[] files = folder.listFiles((dir, name) -> name.endsWith(".properties"));
            if (files != null) {
                for (File file : files) {
                    FileInputStream input = new FileInputStream(file);
                    properties.load(input);
                    input.close();
            }
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(value);
    }

}
