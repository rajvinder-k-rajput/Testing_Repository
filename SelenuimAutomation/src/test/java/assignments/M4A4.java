package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class M4A4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.facebook.com");

        ArrayList<WebElement> links = new ArrayList<>(driver.findElements(By.tagName("a")));
        for (int i =1 ; i < links.size() ; i++){
            WebElement linkText = links.get(i);
            System.out.println("The link text name is : " + linkText.getText() + " : and the link is : " + linkText.getAttribute("href"));
        }
        driver.close();

    }
}
