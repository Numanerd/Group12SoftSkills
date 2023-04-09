package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;

public class Step_9_ElementDisplayed {

    DialogContent dc=new DialogContent();
    @Then("Add User Elements Dispayed")
    public void addUserElementsDispayed() {

        dc.elemnetDisplayed(dc.userRoleDisplayed);
        dc.elemnetDisplayed(dc.employeeNameDisplayed);
        dc.elemnetDisplayed(dc.passwordDisplayed);
        dc.elemnetDisplayed(dc.statusDisplayed);
        dc.elemnetDisplayed(dc.usernameDisplayed);
        dc.elemnetDisplayed(dc.confirmDisplayed);
        dc.elemnetDisplayed(dc.cancelBtnDisplayed);
        dc.elemnetDisplayed(dc.saveBtnDisplayed);



    }
}
