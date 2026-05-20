package mathapplication;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.time.Duration;

public class LaunchApp {

    public static void main(String[] args) throws Exception {

        // Set up the UiAutomator2Options
        UiAutomator2Options options = new UiAutomator2Options();

        // Set the correct device details (Use the correct device UDID and name)
        options.setDeviceName("26df23ba"); // Update this with your actual device name or UDID
        options.setUdid("26df23ba"); // Replace with the actual device UDID
        options.setAutomationName("UiAutomator2"); // Automation engine
        options.setAppPackage("com.teachbuddy.tv"); // App package name
        options.setAppActivity("com.teachbuddy.tv.MainActivity"); // Main activity of the app
        options.setNoReset(true); // Don't reset app state between sessions

        // Create the AndroidDriver instance and initialize the Appium server URL
        AndroidDriver driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"), // Appium server URL
                options
        );

        // Set an implicit wait for the driver to wait for elements to appear
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Explicit Wait Setup
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        System.out.println("App launched successfully!");

        // Step 1: Wait for and click on "Start Online setup"
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.androidUIAutomator("new UiSelector().text(\"Start Online setup\")")
        )).click();

        System.out.println("Start Online setup clicked!");

        // Step 2: Wait for and send keys "D11B32" to "Enter NPSN code" field
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                AppiumBy.androidUIAutomator("new UiSelector().text(\"Enter NPSN code\")")
        )).sendKeys("D11B32");

        System.out.println("Entered D11B32");

        // Step 3: Wait for and click the "Continue" button
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.androidUIAutomator("new UiSelector().text(\"Continue\")")
        )).click();

        System.out.println("Continue button clicked!");

        // Step 4: Wait for and click the "Correct, continue" confirmation button
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.androidUIAutomator("new UiSelector().text(\"Correct, continue\")")
        )).click();

        System.out.println("Clicked on confirmation button");

        // Sleep for a while to see the app interaction
        Thread.sleep(5000); // You can replace this with a more specific wait condition if needed

        // Quit the driver session after completion
        driver.quit();
    }
}