package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;

public class Step_10_AddUserHeadingDisplayrd {
   DialogContent dc=new DialogContent();

    @Then("Add User Heading is Displayed")
    public void addUserHeadingIsDisplayed() {
   dc.elemnetDisplayed(dc.addUserDisplayed);

    }
}
