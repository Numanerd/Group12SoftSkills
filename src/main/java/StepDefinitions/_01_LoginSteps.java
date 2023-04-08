package StepDefinitions;

import Pages.DialogContent;
import Utility.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {

    DialogContent dc = new DialogContent();

    @Given("Navigate to OpenSource")
    public void navigateToOpenSource() {

        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        GWD.getDriver().manage().window().maximize();

    }

    @When("Enter username and password then click")
    public void EnterUserNameAndPasswordThenClick() {

        dc.sendKeysFunction(dc.username,"Admin");
        dc.sendKeysFunction(dc.password,"admin123");
        dc.clickFunction(dc.loginButton);

    }

    @Then("User should login successfully")
    public void UserShouldLoginSuccessfully() {

        dc.verifyContainsTextFunction(dc.txtDashboard,"Dashboard");

    }


}















