package Pages;

import Utilities.GWD_old;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangePom extends Parent {

    public OrangePom() {
        PageFactory.initElements(GWD_old.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(css = "button[type='submit']")
    public WebElement loginButton;

    @FindBy(linkText = "Admin")
    public WebElement adminButton;

    @FindBy(css = "[class='oxd-icon bi-plus oxd-button-icon']")
    public WebElement addButton;

    @FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[2]")
    public WebElement username2;

    @FindBy(xpath = "//*[text()='Already exists']")
    public WebElement alreadyExists;

    @FindBy(xpath = "//*[text()='Should be at least 5 characters']")
    public WebElement fiveCharacters;


}