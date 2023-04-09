package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import Utilities.GWD_old;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class Login2 {

    Parent pt = new Parent();

    DialogContent dc = new DialogContent();

    LeftNav ln = new LeftNav();

    @Given("Navigate to OpenSource")
    public void navigateToOpenSource() {

        GWD_old.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        GWD_old.getDriver().manage().window().maximize();

    }

    @Given("User must click on Admin Feature")
    public void userMustBeClickOnAdminFeature() {

        ln.clickFunction(ln.adminButton);

    }

    @Then("fill up the form by entering the required info to the all input boxes")
    public void fillUpTheFormByEnteringTheRequiredInfoToTheAllInputBoxes() {


        dc.clickFunction(dc.userRole1);
        dc.clickFunction(dc.listBox);
        dc.clickFunction(dc.status1);
        dc.clickFunction(dc.listBox);


        dc.sendKeysFunction(dc.employeeName, "Odis");


        pt.wait.until(ExpectedConditions.textToBePresentInElement(dc.employee1, "Odis"));
        dc.clickFunction(dc.listBox);
        dc.sendKeysFunction(dc.usernameDisplayed, "osman12345");
        dc.sendKeysFunction(dc.password2, "Deneme123.");
        dc.sendKeysFunction(dc.confirm2, "Deneme123.");


    }

    @Then("Verify that ESS – user name is added on the list")
    public void verifyThatESSUserNameIsAddedOnTheList() {


        pt.wait.until(ExpectedConditions.elementToBeClickable(dc.saveButton));
        dc.sendKeysFunction(dc.usernameSearch, "osman12345");
        dc.clickFunction(dc.saveButton);
        pt.waitUntilVisible(dc.editBut);
        Assert.assertTrue(dc.editBut.isDisplayed());

    }
}


