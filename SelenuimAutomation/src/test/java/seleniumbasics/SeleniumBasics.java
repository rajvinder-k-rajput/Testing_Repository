package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");

       // driver.findElement(By.id("username")).sendKeys("RamSita");
        driver.findElement((By.xpath("//input[@type='email']"))).sendKeys("welcome");
        driver.findElement(By.name("pw")).sendKeys("Testing");
        driver.findElement(By.id("Login")).click();
        //String text = driver.findElement(By.id("error")).getText();
        //System.out.println(text);
        // OR
        System.out.println(driver.findElement(By.id("error")).getText());
        //Please check your username and password. If you still can't log in, contact your Salesforce administrator.
        Thread.sleep(4000);
        driver.close();
        /*int num = 10;
        if (num < 5){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        String name = "LMTI";
        String name1 = "LMTI";

        if (name1.equals(name)){
            System.out.println("EQUAL");
        }
        else {
            System.out.println("NOT EQUAL");
        } */

    }
}
