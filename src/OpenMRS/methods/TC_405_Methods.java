package OpenMRS.methods;

import OpenMRS.elements.TC_405_Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_405_Methods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    TC_405_Elements elements;

    public TC_405_Methods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
    }

    public void myAccountSettings() {
        elements = new TC_405_Elements(driver);
        action.moveToElement(elements.adminIcon).build().perform();
        elements.myAccountButton.click();

        elements.ChangePasswordButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.cancelButton));
        Assert.assertTrue(elements.changePasswordPage.isDisplayed(), "Change Password page is not displayed");

        elements.cancelButton.click();
        elements.myLanguages.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.cancelButton));
        Assert.assertTrue(elements.myLanguagesPage.isDisplayed(), "My Languages page is not displayed");
        elements.cancelButton.click();
    }
}
