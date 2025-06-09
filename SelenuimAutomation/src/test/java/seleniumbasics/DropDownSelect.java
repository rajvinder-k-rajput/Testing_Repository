package seleniumbasics;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class DropDownSelect {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.in");

        WebElement element = driver.findElement(By.id("searchDropdownBox"));
        int size = element.findElements(By.tagName("option")).size();

        ArrayList<WebElement> dropName = new ArrayList<>(driver.findElements(By.tagName("option")));

        for (int i = 0; i < dropName.size() ; i++){
            dropName.get(i).click();
        }

        /*for (int i = 0 ; i < size ; i++ ){
            String text = element.findElements(By.tagName("option")).get(i).getText();
            System.out.println(text);
        } */

        Thread.sleep(3000);
        driver.close();

    }
}
