package OpenMRS.methods;

import OpenMRS.elements.TC_401_402_403_Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_401_Methods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    TC_401_402_403_Elements elements;

    public TC_401_Methods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
    }

    public void goToLoginPage() {
        elements = new TC_401_402_403_Elements(driver);
        wait.until(ExpectedConditions.visibilityOf(elements.demoButton)).click();
        Assert.assertTrue(elements.demoButton.isDisplayed(), "Demo button is not displayed");

        action.scrollByAmount(0, 1000).perform();
        wait.until(ExpectedConditions.visibilityOf(elements.enterDemoButton));
        elements.enterDemoButton.click();

        wait.until(ExpectedConditions.visibilityOf(elements.loginPageIcon));
        Assert.assertTrue(elements.loginPageIcon.isDisplayed(), "Login page icon is not displayed");
    }

    public void loginWithInvalidData(String username, String password, Boolean locationCheck) {
        elements = new TC_401_402_403_Elements(driver);
        driver.navigate().refresh();
        wait.until(ExpectedConditions.visibilityOf(elements.usernameField));
        elements.usernameField.clear();
        wait.until(ExpectedConditions.elementToBeClickable(elements.usernameField));
        elements.usernameField.sendKeys(username);
        elements.passwordField.clear();
        wait.until(ExpectedConditions.elementToBeClickable(elements.passwordField));
        elements.passwordField.sendKeys(password);

        if (!locationCheck) {
            wait.until(ExpectedConditions.visibilityOf(elements.loginButton));
            wait.until(ExpectedConditions.elementToBeClickable(elements.loginButton));
            elements.loginButton.click();
            wait.until(ExpectedConditions.visibilityOf(elements.locationErrorMessage));
            Assert.assertTrue(elements.locationErrorMessage.isDisplayed(), "Location error not shown");
        } else {
            wait.until(ExpectedConditions.visibilityOf(elements.inpatientWard));
            wait.until(ExpectedConditions.elementToBeClickable(elements.inpatientWard));
            elements.inpatientWard.click();
            wait.until(ExpectedConditions.visibilityOf(elements.loginButton));
            wait.until(ExpectedConditions.elementToBeClickable(elements.loginButton));
            elements.loginButton.click();
            wait.until(ExpectedConditions.visibilityOf(elements.invalidLoginErrorMessage));
            Assert.assertTrue(elements.invalidLoginErrorMessage.getText().equals("Invalid username/password. Please try again."), "Invalid login error not shown");
        }
    }
}
