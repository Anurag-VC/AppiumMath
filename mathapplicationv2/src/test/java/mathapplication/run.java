package mathapplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class run {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("test");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/artifact/io.appium/java-client/10.1.0");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        //driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.quit();
        System.out.println("Automation Run");
        System.out.println("Test Completed");
        System.out.println();
        System.out.println();
    
    }
}
