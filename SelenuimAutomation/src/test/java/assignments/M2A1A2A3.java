package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class M2A1A2A3 {
    public static void main(String[] args) throws InterruptedException {
        // Chrome Browser
        WebDriver driver1 = new ChromeDriver();
        driver1.get("http://www.amazon.in");
        Thread.sleep(2000);
        driver1.close();

        // FireFox Browser
        WebDriver driver2 = new FirefoxDriver();
        driver2.get("http://www.amazon.in");
        Thread.sleep(2000);
        driver2.close();

        // Internet Explorer Browser
        WebDriver driver3 = new InternetExplorerDriver();
        driver3.get("http://www.amazon.in");
        Thread.sleep(2000);
        driver3.close();

    }
}
