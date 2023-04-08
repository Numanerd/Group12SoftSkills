package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_AdminSteps {
 LeftNav ln= new LeftNav();
 DialogContent dc=new DialogContent();
    @Given("Click on Admin Button")
    public void clickOnAdminButton() {
        ln.clickFunction(ln.adminButton);
    }

    @When("Click on Add Button")
    public void clickOnAddButton() {
        dc.clickFunction(dc.addButton);
    }

    @Then("Click on Save Button")
    public void clickOnSaveButton() {
        dc.clickFunction(dc.saveButton);
    }

    @And("Notification Messages on Red Should Be Displayed")
    public void notificationMessagesOnRedShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.rqrMessages, "Required");
    }


}
