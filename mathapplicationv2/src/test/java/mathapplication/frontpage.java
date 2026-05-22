package mathapplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frontpage {
    public static void main(String[] args) {
        System.out.println("Test");
        System.out.println("Test");
        WebDriver driver = new ChromeDriver();
        driver.get("https://uat-new-school-cms.content.classrootsedu.com/auth/login");
        driver.manage().window().maximize();
        driver.quit();
        System.out.println("53w5");
       
    }

}
    
