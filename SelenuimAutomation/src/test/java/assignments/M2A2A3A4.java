package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class M2A2A3A4 {
    public static void main(String[] args) throws InterruptedException {
        // Chrome Browser
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        driver.close();
        // FireFox Browser
        WebDriver driver1 = new FirefoxDriver();
        driver1.get("http://www.google.com");
        Thread.sleep(5000);
        System.out.println(driver1.getTitle());
        driver1.close();
        // Internet Browser
        WebDriver driver2 = new InternetExplorerDriver();
        driver2.get("http://www.google.com");
        Thread.sleep(5000);
        System.out.println(driver2.getTitle());
        driver2.close();
    }
}
