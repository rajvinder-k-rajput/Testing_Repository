package selfpractices;

import io.cucumber.java.bs.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextOrRightClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.in");
        Actions act = new Actions(driver);

        WebElement signIn = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
        act.contextClick(signIn).perform();
        //or
        //act.moveToElement(signIn).contextClick().build().perform();


    }
}
