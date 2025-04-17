package OpenMRS.methods;

import OpenMRS.elements.TC_409_Elements;
import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_409_Methods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    TC_409_Elements elements;

    public TC_409_Methods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
    }

    public void mergePatient() {
        TC_404_Methods addPatient = new TC_404_Methods(driver, action, wait);
        elements = new TC_409_Elements(driver);
        String searchByName = "Benjamin Thomas Miller";

        for (int i = 0; i < 2; i++) {
            addPatient.patientRegistrations();
            driver.navigate().refresh();

            wait.until(ExpectedConditions.visibilityOf(elements.homeBtn));
            wait.until(ExpectedConditions.elementToBeClickable(elements.homeBtn)).click();
        }
        wait.until(ExpectedConditions.visibilityOf(elements.dataManagementBtn));
        wait.until(ExpectedConditions.elementToBeClickable(elements.dataManagementBtn)).click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.mergePatientBtn));
        action.moveToElement(elements.mergePatientBtn).click().build().perform();

        wait.until(ExpectedConditions.visibilityOf(elements.searchByName));
        action.scrollToElement(elements.searchByName).build().perform();
        elements.searchByName.sendKeys(searchByName);

        wait.until(ExpectedConditions.visibilityOf(elements.firstPatient));
        wait.until(ExpectedConditions.elementToBeClickable(elements.firstPatient));
        action.moveToElement(elements.firstPatient).click().build().perform();

        wait.until(ExpectedConditions.visibilityOf(elements.secondPatient));
        wait.until(ExpectedConditions.elementToBeClickable(elements.secondPatient));
        action.moveToElement(elements.secondPatient).click().build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(elements.continueBtn));
        action.moveToElement(elements.continueBtn).click().build().perform();

        action.scrollToElement(elements.warnMessage).build().perform();
        wait.until(ExpectedConditions.visibilityOf(elements.warnMessage));

        Assert.assertTrue(elements.warnMessage.isDisplayed(), "Warning message is not displayed");

        wait.until(ExpectedConditions.elementToBeClickable(elements.mergePatient));
        action.moveToElement(elements.mergePatient).click().build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(elements.yesContinueBtn));
        action.moveToElement(elements.yesContinueBtn).click().build().perform();

        wait.until(ExpectedConditions.visibilityOf(elements.mergedPatient));

        Assert.assertTrue(elements.mergedPatient.isDisplayed(), "Merged patient is not displayed");
    }
}
