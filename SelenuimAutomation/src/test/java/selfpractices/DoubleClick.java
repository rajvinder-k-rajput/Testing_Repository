package selfpractices;

import io.cucumber.java.bs.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.in");

        WebElement signin = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));

        Actions act = new Actions(driver);
        // Case1: Direct Method --> doubleClick(element)
        act.doubleClick(signin).build().perform();
        // Case2: moveToElement(element).doubleClick()
        // act.moveToElement(signin).doubleClick().build().perform();

}
}
