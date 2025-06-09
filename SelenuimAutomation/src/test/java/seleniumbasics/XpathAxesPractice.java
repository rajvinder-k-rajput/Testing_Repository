package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.WatchEvent;

public class XpathAxesPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/reg/");

        // Parent to Child [GET UI TEXT]
        String text = driver.findElement(By.xpath("//div[@class='pvl _52lp']/child::div[@class='mbs _52lq _9bp_ fsl fwb fcb']")).getText();
        System.out.println(text);

        // Parent to child to "following-sibling" [send USERNAME]
        driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/child::div[@class='placeholder']/following-sibling::input[@name='firstname']")).sendKeys("welcome");

        // "Grand-Parent" to "Grand-Child" using "descendant" [send PASSWORD]
        driver.findElement(By.xpath("//div[@class='_5dbb']/descendant::input[@name='lastname']")).sendKeys("testing");

        //child to preceding-sibling-parent-child
        driver.findElement(By.xpath("//input[@type='text']/preceding-sibling::div[@class='placeholder']/parent::div/child::input[@name='reg_email__']")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']/preceding-sibling::div[@class='placeholder']/parent::div/child::input[@type='password']")).sendKeys("testing");

        //parent -> child -> preceding-sibling
        driver.findElement(By.xpath("//div[@class='_1lch']/child::span/preceding-sibling::button[@type='submit']")).click();

        Thread.sleep(3000);
        driver.close();
    }
}
