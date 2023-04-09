package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD_old;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {

    DialogContent dc = new DialogContent();

    LeftNav lf = new LeftNav();

    @Given("Navigate to OrangeHRm")
    public void NavigateToOrangeHRm() {

        GWD_old.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        GWD_old.getDriver().manage().window().maximize();

    }

    @When("Enter username and passworD")
    public void enterUsernameAndPassworD() {

        dc.sendKeysFunction(dc.username,"Admin");
        dc.sendKeysFunction(dc.password,"admin123");

    }

    @Then("click login buttonn")
    public void clickLoginButtonn() {

        dc.clickFunction(dc.loginButton);
    }

    @Given("Navigate to Admin page")
    public void navigateToAdminPage() {

        lf.clickFunction(lf.adminButton);

    }

    @When("click on Add button")
    public void clickOnAddButton() {

        dc.clickFunction(dc.addButton);

    }

    @Then("enter an invalid name")
    public void enterAnInvalidName() {

        dc.sendKeysFunction(dc.employeeName,"asdasdafas");
        dc.clickFunction(dc.usernameDisplayed);

    }

    @And("verify that notification messages")
    public void verifyThatNotificationMessages() {

        dc.verifyContainsTextFunction(dc.invalid,"Invalid");
    }
}

