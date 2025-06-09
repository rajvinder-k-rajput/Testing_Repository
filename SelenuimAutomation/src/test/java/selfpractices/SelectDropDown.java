package selfpractices;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/reg/");

        //UserName and Password
        driver.findElement(By.name("firstname")).sendKeys("SitaRam");
        driver.findElement(By.name("lastname")).sendKeys("testing");

        //DAY
        WebElement element = driver.findElement(By.id("day"));
        int size = element.findElements(By.tagName("option")).size();

        /*for (int i = 0 ; i < size ; i++){
            element.findElements(By.tagName("option")).get(i).click();
            //Thread.sleep(200);
        }*/

        Select selDay = new Select(element);
        selDay.selectByValue("18");

        // Month
        WebElement month = driver.findElement(By.id("month"));
        int sizeMonth = month.findElements(By.tagName("option")).size();

        /*for (int j = 0 ; j < sizeMonth ; j++){
            month.findElements(By.tagName("option")).get(j).click();
           // Thread.sleep(200);
        }*/
        Select selMonth = new Select(month);
        selMonth.selectByValue("7");

        // YEAR
        WebElement year = driver.findElement(By.id("year"));
        int sizeYear = year.findElements(By.tagName("option")).size();
/*
        for (int k = 0 ; k < sizeYear ; k++){
            year.findElements(By.tagName("option")).get(k).click();
           // Thread.sleep(100);
        }*/
        Select selYear = new Select(year);
        selYear.selectByValue("2000");

        //GENDER
        driver.findElement(By.xpath("//span[@class='_5k_3']/child::span[1]/child::label/child::input")).click();
        // EMAIL ADDRESS
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abcd@.com");
        //PASSWORD
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("welcome");
        //LOGIN by Click action
        driver.findElement(By.xpath("//button[@id='u_0_n_cS']")).click();


        Thread.sleep(2000);
        driver.close();

    }
}
