
package Pages;
import Utilities.GWD_old;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD_old.getDriver(), this);}


    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(css = "button[type='submit']")
    public WebElement loginButton;

   @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    public WebElement txtDashboard;

  @FindBy(xpath = "//Button[@type='submit']")
    public WebElement saveButton;

  @FindBy(xpath = "//span[@class=\"oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message\"]")
    public WebElement rqrMessages;
    @FindBy(css = "[class='oxd-icon bi-plus oxd-button-icon']")
    public WebElement addButton;
    @FindBy(css = "[class=\"oxd-text oxd-text--h6 orangehrm-main-title\"]")
    public WebElement addUserText;
    @FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[2]")
    public WebElement username2;

    @FindBy(xpath = "//*[text()='Already exists']")
    public WebElement alreadyExists;

    @FindBy(xpath = "//*[text()='Should be at least 5 characters']")
    public WebElement fiveCharacters;
    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement addbuttonpassword;


    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
    public WebElement userRoleDisplayed;

    @FindBy(xpath = "//label[text()='Employee Name']")
    public WebElement employeeNameDisplayed;

    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
    public WebElement statusDisplayed;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active oxd-input--error'])[1]")
    public WebElement usernameDisplayed;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active oxd-input--error'])[2]")
    public WebElement passwordDisplayed;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElement confirmDisplayed;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
    public WebElement cancelBtnDisplayed;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    public WebElement saveBtnDisplayed;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
    public WebElement addUserDisplayed;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    public WebElement invalid;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    public WebElement employeeName;

    @FindBy(xpath = "(//*[@class='oxd-select-text-input'])[1]")
    public WebElement userRole1;

    @FindBy(xpath = "(//*[@class='oxd-select-text-input'])[2]")
    public WebElement status1;

    @FindBy(css = "[role='listbox'] > *")
    public WebElement employee1;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement password2;

    @FindBy(xpath = "(//*[@class='oxd-grid-item oxd-grid-item--gutters'])[5]//input")
    public WebElement confirm2;

    @FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[2]")
    public WebElement usernameSearch;

    @FindBy(css = "[class='orangehrm-header-container']~div span")
    public WebElement editBut;

    @FindBy(css = "[role='listbox']")
    public WebElement listBox;

    @FindBy(css = "[class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    public WebElement beforeSave;




}
