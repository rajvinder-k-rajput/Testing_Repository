package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class M3A4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        Thread.sleep(500);

        driver.manage().window().maximize();
        Thread.sleep(500);

        System.out.println(driver.getTitle());
        Thread.sleep(500);

        driver.switchTo().frame(0);
        WebElement link = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/span[2]/a[1]"));
        link.click();
        Thread.sleep(3000);

        ArrayList<String> list = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(list.get(1));
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.close();

        driver.switchTo().window(list.get(0));
        Thread.sleep(3000);
        System.out.println(driver.getTitle());

        driver.close();
    }
}