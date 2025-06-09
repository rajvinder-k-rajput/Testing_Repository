package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class AmazonSteps {
    //Way 1:
    WebDriver driver = new ChromeDriver();;
    WebElement element;
    // OR way 2:
    //WebDriver driver = new ChromeDriver(); // --> Acting as Global Variable

    @Given ("user navigate to Amazon HomePage")
    public void amazonHomePage(){
         //--> Driver will get the value
        driver.get("http://www.amazon.in");
    }

    @When("user enter the serach keyword {string}")
    public void userEnterTheSerachKeyword(String productName) {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
    }

    @And("user clicks the search icon")
    public void userClicksTheSearchIcon() {
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @Then("validate the title of the page")
    public void validateTheTitleOfThePage() {
        System.out.println(driver.getTitle());
    }

    @When("user extract the Dropdown values")
    public void userExtractTheDropdownValues() {
        element = driver.findElement(By.id("searchDropdownBox"));
        int size = element.findElements(By.tagName("option")).size();

        for(int i = 0 ; i < size ; i++){
            System.out.println(element.findElements(By.tagName("option")).get(i).getText());
        }
    }

    @Then("user validates the Dropdown values")
    public void userValidatesTheDropdownValues() {
    }

    @And("user select the value from the dropdown")
    public void userSelectTheValueFromTheDropdown() {
        Select s = new Select(element);
        //s.selectByIndex(3);
        //s.selectByVisibleText("Amazon Fashion");
        s.selectByValue("search-alias=nowstore");
    }

    @When("user clicks on Baby wishlist")
    public void userClicksOnBabyWishkist() {
        WebElement acc = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
        Actions actOption = new Actions(driver);

        actOption.clickAndHold(acc).build().perform();
        driver.findElement(By.linkText("Baby Wishlist")).click();
    }

    @Then("Validate the field name")
    public void validateTheFieldName() {
        String actualText = driver.findElement(By.xpath("//h2[text()='Baby Wishlist']")).getText();
        Assert.assertEquals("Baby Wishlist", actualText);

    }
}
