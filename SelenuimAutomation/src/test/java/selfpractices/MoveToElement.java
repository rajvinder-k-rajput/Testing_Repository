package selfpractices;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");

        // ***** Using build() and perform() methods *******

        WebElement userName = driver.findElement(By.id("email"));
      //  userName.sendKeys("abc@gmail.com");
        WebElement userPass = driver.findElement(By.name("pass"));
     //   userPass.sendKeys("Test");
        WebElement login = driver.findElement(By.name("login"));
        /* Not needed
        int x = login.getLocation().getX();
        int y = login.getLocation().getY(); */

        Actions act = new Actions(driver);
        act.moveToElement(userName).sendKeys("abc@gmail.com").build().perform();
        userPass.click();
        act.moveToElement(userPass).sendKeys("test").build().perform();
        // act.moveByOffset(x,y).click().build().perform();
        act.moveToElement(login).click().build().perform();


    }
}
