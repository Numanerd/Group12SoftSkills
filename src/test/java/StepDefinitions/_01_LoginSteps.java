package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD_old;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {
    DialogContent dc=new DialogContent();
    @Then("User should login successfully")
    public void UserShouldLoginSuccessfully() {

        dc.verifyContainsTextFunction(dc.txtDashboard,"Dashboard");

    }


}