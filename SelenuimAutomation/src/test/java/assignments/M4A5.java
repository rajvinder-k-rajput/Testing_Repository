package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class M4A5 {
    public static void main(String[] args) throws InterruptedException {
        //TC-1
        WebDriver driver = new ChromeDriver();
        //TC-2
        driver.get("https://www.facebook.com/reg/");
        //TC-3
        WebElement userName = driver.findElement(By.name("firstname"));
        userName.sendKeys("welcome");
        Thread.sleep(2000);
        //TC-4
        userName.clear();
        Thread.sleep(1000);
        //TC-5
        userName.sendKeys("welcome back");
        //TC-6 **** getText does not work for <input> or <textarea>
        System.out.println(userName.getAttribute("value"));
        //TC-7
        driver.close();
    }
}
