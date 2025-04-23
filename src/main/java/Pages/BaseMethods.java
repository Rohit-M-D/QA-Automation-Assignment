
package Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.TakeScreenshot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseMethods extends WebLaunch {
    Properties properties = new Properties();

    public void sendKeys(String locator, String value) {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(45))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        element.clear();
        element.sendKeys(value);
    }

    public void clickElement(String locator, String methodName) {
    
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator))).click();
            System.out.println("Clicked: " + locator);
    
        } catch (Exception e) {
            System.out.println("Exception in method: " + methodName);
            System.out.println("Reason: " + e.getMessage());
            TakeScreenshot.takeScreenshot(methodName); 
        }
    }
     
    
     public String getLocators(String value){
        try {
            FileInputStream input = new FileInputStream("src/resources/locator.properties");
            properties.load(input);
     
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(value);
     }

     
        
        
    
}


