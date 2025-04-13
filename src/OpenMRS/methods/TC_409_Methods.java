package OpenMRS.methods;

import OpenMRS.elements.TC_409_Elements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        elements = new TC_409_Elements(driver);

        wait.until(ExpectedConditions.elementToBeClickable(elements.dataManagementBtn));
        action.moveToElement(elements.dataManagementBtn).click().perform();

        wait.until(ExpectedConditions.elementToBeClickable(elements.mergePatientBtn));
        action.moveToElement(elements.mergePatientBtn).click().perform();

        wait.until(ExpectedConditions.visibilityOf(elements.searchByName));
        action.scrollToElement(elements.searchByName).perform();
        elements.searchByName.sendKeys("an" + Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(elements.firstPatient));
        action.moveToElement(elements.firstPatient).click().perform();

        wait.until(ExpectedConditions.elementToBeClickable(elements.secondPatient));
        action.moveToElement(elements.secondPatient).click().perform();

        wait.until(ExpectedConditions.elementToBeClickable(elements.continueBtn));
        action.moveToElement(elements.continueBtn).click().perform();

        action.scrollToElement(elements.warnMessage).perform();
        wait.until(ExpectedConditions.visibilityOf(elements.warnMessage));

        Assert.assertTrue(elements.warnMessage.isDisplayed(), "Warning message is not displayed");

        wait.until(ExpectedConditions.elementToBeClickable(elements.mergePatient));
        action.moveToElement(elements.mergePatient).click().perform();

        wait.until(ExpectedConditions.elementToBeClickable(elements.yesContinueBtn));
        action.moveToElement(elements.yesContinueBtn).click().perform();

        wait.until(ExpectedConditions.visibilityOf(elements.mergedPatient));

        Assert.assertTrue(elements.mergedPatient.isDisplayed(), "Merged patient is not displayed");
    }
}
