package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class M3A5Edge {
    public static void main(String[] args) throws InterruptedException {
        //TC-1
        WebDriver driver = new EdgeDriver();
        //TC-2
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        //TC-3
        driver.manage().window().maximize();
        //TC-4
        System.out.println(driver.getCurrentUrl());
        //TC-5
        driver.navigate().to("https://www.selenium.dev/");
        Thread.sleep(1000);
        //TC-6
        System.out.println(driver.getCurrentUrl());
        //TC-7
        driver.navigate().back();
        Thread.sleep(1000);
        //TC-8
        System.out.println(driver.getCurrentUrl());
        //TC-9
        driver.navigate().forward();
        Thread.sleep(1000);
        //TC-10
        System.out.println(driver.getCurrentUrl());
        //TC-11
        driver.navigate().refresh();
        Thread.sleep(1000);
        //TC-12
        System.out.println(driver.getCurrentUrl());
        //TC-13
        driver.close();
    }
}
