package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;

public class AddUserSteps {
    DialogContent dc=new DialogContent();
    @And("Add User Text should be displayed")
    public void addUserTextShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.addUserText, "Add");
    }

}
