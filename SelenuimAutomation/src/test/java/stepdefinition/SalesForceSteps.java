package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceSteps {
    @Given("user navigate to salesforce login Page")
    public void salesForceLoginPage(){
        WebDriver driver = new ChromeDriver();

        
    }

    @When("user enter the username {string} and password {string}")
    public void userEnterTheUsernameAndPassword(String arg0, String arg1) {
    }

    @And("user click the login button")
    public void userClickTheLoginButton() {
        
        
    }

    @Then("verify whether the user navigate to the HomePage")
    public void verifyWhetherTheUserNavigateToTheHomePage() {
    }

    @And("verify title of the page")
    public void verifyTitleOfThePage() {
    }
}
