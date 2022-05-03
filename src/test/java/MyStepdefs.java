import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    @Given("^I have a configured CucumberJVM project$")
    public void configuredCucumberJVM() {
        System.out.println("Configured a  CucumberJVM project");
    }

   @When("I run it within my IDE")
    public void iRunItWithinMyIDE() {
       System.out.println("I run it within my IDE");

    }

    @Then("I will be able to run connected step definitions")
    public void iWillBeAbleToRunConnectedStepDefinitions() {
        System.out.println("I will be able to run connected step definitions");
    }
}
