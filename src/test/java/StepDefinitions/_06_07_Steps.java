package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD_old;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class _06_07_Steps {
    DialogContent dc=new DialogContent();
    LeftNav lf=new LeftNav();

    @Given("Navigate to OrangeHRM")
    public void navigateToOrangeHRM() {
        GWD_old.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {


        dc.sendKeysFunction(dc.username, "Admin");
        dc.sendKeysFunction(dc.password, "admin123");
        dc.clickFunction(dc.loginButton);
    }

    @And("Navigate to Admin panel")
    public void navigateToAdminPanel() {
        dc.clickFunction(lf.adminButton);
    }

    @And("Click to Add Button")
    public void clickToAddButton() {
        dc.clickFunction(dc.addButton);

    }

    @When("Add an admin account which is already taken")
    public void addAnAdminAccountWhichIsAlreadyTaken() {
        dc.sendKeysFunction(dc.username2, "Admin");


    }

    @Then("Already exists message should be displayed")
    public void Already_exists_message_should_be_displayed() {

        dc.verifyContainsTextFunction(dc.alreadyExists, "exists");
    }


    @When("Add a username that has less than five characters")
    public void addAUsernameThatHasLessThanFiveCharacters() {

        dc.sendKeysFunction(dc.username2, "abc");
    }


    @Then("At least five chars message should be displayed")
    public void atLeastFiveCharsMessageShouldBeDisplayed() {

        dc.verifyContainsTextFunction(dc.fiveCharacters, "5");
    }

}