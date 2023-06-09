package Pages;
import Utilities.GWD_old;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {

     public WebDriverWait wait=new WebDriverWait(GWD_old.getDriver(),
            Duration.ofSeconds(5));

    public void sendKeysFunction(WebElement element, String yazi)
    {
        waitUntilVisible(element); // gözükene kadar bekle
        scrollToElement(element);  // scroll yap
        element.clear();           // temizle
        element.sendKeys(yazi);    // gönder
    }

    public void clickFunction(WebElement element){
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void verifyContainsTextFunction(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()),"No such TEXT");
        new Actions(GWD_old.getDriver()).sendKeys(Keys.ESCAPE).perform();
        // açık dialog kutusu varsa kapansın
    }

    public void elemnetDisplayed(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        Assert.assertTrue(element.isDisplayed());
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) GWD_old.getDriver();
        js.executeScript("arguments[0].scrollIntoView(false);", element);
    }

    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


}
