package assignments;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class M4A3Chrome {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(500);
        // Registration
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]")).click();
        Thread.sleep(2000);
        // Add details
        // 1. Username and Password
        driver.findElement(By.name("firstname")).sendKeys("SitaRam");
        driver.findElement(By.name("lastname")).sendKeys("testing");
        // 2. Add date of Birth
        // Day
        WebElement birthDay = driver.findElement(By.id("day"));
        Select day = new Select(birthDay);
        day.selectByValue("18");
        // Month
        WebElement birthMonth = driver.findElement(By.id("month"));
        Select month = new Select(birthMonth);
        month.selectByValue("10");
        // Year
        WebElement birthYear = driver.findElement(By.id("year"));
        Select year = new Select(birthYear);
        year.selectByValue("2000");

        WebElement gender = driver.findElement(By.xpath("//label[normalize-space()='Female']"));

        if (!gender.isSelected()){
            gender.click();
        } else {
            System.out.println("Gender is not selected !!!! ");
        }

        driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("testing");
        Thread.sleep(3000);

        driver.findElement(By.name("websubmit")).click();
        driver.close();
    }
}
