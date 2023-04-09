package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _11_12_PasswordSteps {

    DialogContent dc = new DialogContent();
    @When("Enter short password")
    public void enterShortPassword() {
        dc.sendKeysFunction(dc.addbuttonpassword,"123");
    }

    @When("Enter lowercase password")
    public void enterLowercasePassword() {
        dc.sendKeysFunction(dc.addbuttonpassword,"12345678");
    }

    @Then("At password should message")
    public void atLeastEightCharacters() {
        dc.verifyContainsTextFunction(dc.rqrMessages,"Should have");
    }

    @Then("At password try different message")
    public void atPasswordTrydifferentMessage() {
        dc.verifyContainsTextFunction(dc.rqrMessages,"Your password");
    }
}
