package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // Add Cucumber JUnit dependency in the POM.xml file

@CucumberOptions( // This will navigate to the "Test Design and Coding" with inbuilt methods called "feature" and "glue"
        features = "src/test/resources/testdesign", // Provide the "Path from Content Root" of the test design
        glue = "stepdefinition", //Add the package name where you have the coding
        tags = "@testing",
        plugin = {"pretty"}

)

public class Runner {

}
