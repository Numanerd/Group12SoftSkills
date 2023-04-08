package StepDefinitions;

import Pages.OrangePom;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class _06_07_AdminSteps {

    OrangePom op = new OrangePom();

    @Given("Navigate to OrangeHRM")
    public void navigateToOrangeHRM() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {


        op.sendKeysFunction(op.username, "Admin");
        op.sendKeysFunction(op.password, "admin123");
        op.clickFunction(op.loginButton);
    }

    @And("Navigate to Admin panel")
    public void navigateToAdminPanel() {
        op.clickFunction(op.adminButton);
    }

    @And("Click to Add Button")
    public void clickToAddButton() {
        op.clickFunction(op.addButton);

    }

    @When("Add an admin account which is already taken")
    public void addAnAdminAccountWhichIsAlreadyTaken() {
        op.sendKeysFunction(op.username2, "Admin");


    }

    @Then("Already exists message should be displayed")
    public void Already_exists_message_should_be_displayed() {

        op.verifyContainsTextFunction(op.alreadyExists, "exists");
    }


    @When("Add a username that has less than five characters")
    public void addAUsernameThatHasLessThanFiveCharacters() {

        op.sendKeysFunction(op.username2, "abc");
    }


    @Then("At least five chars message should be displayed")
    public void atLeastFiveCharsMessageShouldBeDisplayed() {

        op.verifyContainsTextFunction(op.fiveCharacters, "5");
    }

}