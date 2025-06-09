package selfpractices;

import io.cucumber.java.bs.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        Actions act = new Actions(driver);

        WebElement ele = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(0);
        Thread.sleep(1000);

        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        System.out.println(drag.getText());

        act.dragAndDrop(drag,drop).build().perform();
        if (drop.getText().matches("Dropped!")){
            System.out.println("Successfully Dropped");
        }
        else {
            System.out.println("Not Dropped Successfully");
        }

    }
}
