package OpenMRS.methods;

import OpenMRS.elements.TC_401_402_403_Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_403_Methods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    TC_401_402_403_Elements elements;

    public TC_403_Methods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
    }

    public void logout() {
        elements = new TC_401_402_403_Elements(driver);
        elements.logoutButton.click();
        wait.until(ExpectedConditions.visibilityOf(elements.loginPageIcon));
        Assert.assertTrue(elements.loginPageIcon.isDisplayed(), "Login page icon is not displayed after logout");
    }
}
