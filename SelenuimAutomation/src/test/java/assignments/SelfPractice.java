package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        // WebDriver Methods()
        System.out.println("The current URL is : " + driver.getCurrentUrl());
        System.out.println("The Title is : " + driver.getTitle());

        Thread.sleep(1000);

        driver.navigate().to("http://www.facebook.com");
        System.out.println("The Title is : " + driver.getTitle());
        Thread.sleep(1000);

        driver.navigate().back();
        System.out.println("The Title is : " + driver.getTitle());
        Thread.sleep(1000);

        driver.navigate().refresh();
        Thread.sleep(1000);

        // WebElement Methods()
        WebElement element = driver.findElement(By.name("btnK"));

        String str = driver.findElements(By.tagName("input")).toString();
        System.out.println(str);
        System.out.println("The element2 is : " + element);

        System.out.println("The Text is : " + element.getText());
        System.out.println("The Attribute is : " + element.getAttribute("name"));
        System.out.println("The TagName is : " + (element.getTagName()));
        System.out.println("The cssValue is : " + element.getCssValue("name"));
        //System.out.println("The PageSource is : " + driver.getPageSource());



        driver.close();
    }
}
