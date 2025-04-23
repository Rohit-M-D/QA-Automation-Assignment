package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Pages.WebLaunch;

public class TakeScreenshot extends WebLaunch {

    public static void takeScreenshot(String methodName) {
        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String filePath = "screenshots/" + methodName + "_" + System.currentTimeMillis() + ".png";
            FileUtils.copyFile(src, new java.io.File(filePath));
            System.out.println("Screenshot saved at: " + filePath);
        } catch (IOException e) {
            System.out.println("Screenshot capture failed: " + e.getMessage());
        }
    }
    
}
