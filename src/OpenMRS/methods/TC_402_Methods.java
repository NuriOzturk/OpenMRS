package OpenMRS.methods;

import OpenMRS.elements.TC_402_Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_402_Methods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    TC_402_Elements elements;

    public TC_402_Methods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
    }

    public void login() {
        elements = new TC_402_Elements(driver);
        String username = "Admin";
        String password = "Admin123";

        wait.until(ExpectedConditions.visibilityOf(elements.demoButton)).click();
        Assert.assertTrue(elements.demoButton.isDisplayed(), "Demo button is not displayed");

        action.scrollByAmount(0, 1000).perform();
        wait.until(ExpectedConditions.visibilityOf(elements.enterDemoButton));
        elements.enterDemoButton.click();

        wait.until(ExpectedConditions.visibilityOf(elements.loginPageIcon));
        Assert.assertTrue(elements.loginPageIcon.isDisplayed(), "Login page icon is not displayed");

        elements.usernameField.sendKeys(username);
        elements.passwordField.sendKeys(password);
        elements.inpatientWard.click();
        elements.loginButton.click();

        wait.until(ExpectedConditions.visibilityOf(elements.findPatientIcon));
        Assert.assertTrue(elements.findPatientIcon.isDisplayed(), "Find patient icon is not displayed");
    }
}
