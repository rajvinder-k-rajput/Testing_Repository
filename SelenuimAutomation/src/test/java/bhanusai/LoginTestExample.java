package bhanusai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        //driver.manage().window().minimize();

        WebElement userName = driver.findElement(By.id("user-name"));
        WebElement passWord = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.id("login-button"));

        userName.sendKeys("standard_user");
        passWord.sendKeys("secret_sauce");
        login.click();

        WebElement text = driver.findElement(By.xpath("//span[@class='title']"));
        String expectedResult1 = "Products";
        String expectedResult2 = "https://www.saucedemo.com/inventory.html";

        String str = text.getText();
        String urlExp = driver.getCurrentUrl();

        if (str.equals("Products") && urlExp.equals(expectedResult2)){
            System.out.println("Matching Successfully");
            Thread.sleep(2000);
            driver.close();
        } else {
            System.out.println("Test Failed");
            driver.close();
        }
    }
}
