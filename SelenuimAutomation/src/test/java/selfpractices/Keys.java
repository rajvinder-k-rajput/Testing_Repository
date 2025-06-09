package selfpractices;

import io.cucumber.java.bs.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        Actions act = new Actions(driver);

        WebElement userName = driver.findElement(By.id("email"));
        WebElement userPass = driver.findElement(By.id("email"));
        userName.sendKeys("welcome");

        act.click(userName)
                .keyDown(org.openqa.selenium.Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(org.openqa.selenium.Keys.CONTROL)
                .click(userPass)
                .keyDown(org.openqa.selenium.Keys.CONTROL)
                .sendKeys("v")
                .keyUp(org.openqa.selenium.Keys.CONTROL)
                .build()
                .perform();





    }
}
