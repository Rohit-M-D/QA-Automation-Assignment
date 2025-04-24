package TestUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import Pages.WebLaunch;

public class Listeners implements ITestListener {
    ExtentReports extent = ExtentReportNG.generateReport(); 
    ExtentTest test;

    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test Passed");
        captureScreenshot(result, "Success");
    }

    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL, result.getMethod().getMethodName());
        test.fail(result.getThrowable());
        captureScreenshot(result, "Failure");
    }

    public void onTestSkipped(ITestResult result) {
        test.log(Status.SKIP, "Test Skipped: " + result.getMethod().getMethodName());
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        onTestFailure(result);
    }

    public void onStart(ITestContext context) {
        System.out.println("Starting Test Suite: " + context.getName());
    }

    public void onFinish(ITestContext context) {
        System.out.println("Finished Test Suite: " + context.getName());
        extent.flush(); 
    }

    private void captureScreenshot(ITestResult result, String status) {
        try {
            if (WebLaunch.driver != null) {
                String screenshotPath = WebLaunch.getScreenshotPath(result.getMethod().getMethodName() + "_" + status, WebLaunch.driver);
                test.addScreenCaptureFromPath(screenshotPath, result.getMethod().getMethodName());
                System.out.println("Screenshot captured: " + screenshotPath);
            } else {
                System.out.println("Driver is null, unable to capture screenshot.");
            }
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred while capturing the screenshot.");
            e.printStackTrace();
        }
    }
}
