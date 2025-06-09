package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M3A5Chrome {
    public static void main(String[] args) throws InterruptedException {
        //TC-1
        WebDriver driver = new ChromeDriver();
        //TC-2
        driver.get("http://www.google.com");
        Thread.sleep(3000);
        //TC-3
        driver.manage().window().maximize();
        //TC-4
        System.out.println(driver.getCurrentUrl());
        //TC-5
        driver.navigate().to("http://www.selenium.dev/");
        Thread.sleep(3000);
        //TC-6
        System.out.println(driver.getCurrentUrl());
        //TC-7
        Thread.sleep(3000);
        driver.navigate().back();
        //TC-8
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        //TC-9
        driver.navigate().forward();
        //TC-10
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        //TC-11
        driver.navigate().refresh();
        //TC-12
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        //TC-13
        driver.close();
    }
}
