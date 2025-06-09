package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class M4A1Chrome {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/reg/");

        driver.findElement(By.name("firstname")).sendKeys("sitaram");
        driver.findElement(By.name("lastname")).sendKeys("welcome");

        WebElement day = driver.findElement(By.id("day"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));

        Select dayOption = new Select(day);
        Select monthOption = new Select(month);
        Select yearOption = new Select(year);

        dayOption.selectByValue("18");
        monthOption.selectByIndex(6);
        yearOption.selectByIndex(1);

        ArrayList<WebElement> gender = new ArrayList<>(driver.findElements(By.id("sex")));

        for (int i = 0; i < gender.size() ; i++){
            gender.get(i).click();
            Thread.sleep(2000);
        }



    }
}
