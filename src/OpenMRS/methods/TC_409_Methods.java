package OpenMRS.methods;

import OpenMRS.elements.TC_409_Elements;
import Utility.MyFunc;
import org.openqa.selenium.Keys;
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
        elements = new TC_409_Elements(driver);

        for (int i = 0; i < 2; i++) {
            wait.until(ExpectedConditions.elementToBeClickable(elements.registerBtn));
            action.moveToElement(elements.registerBtn).click().perform();

            wait.until(ExpectedConditions.visibilityOf(elements.givenName));
            action.moveToElement(elements.givenName).sendKeys("Test").perform();

            wait.until(ExpectedConditions.visibilityOf(elements.familyName));
            action.moveToElement(elements.familyName).click().sendKeys("User").perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.nextBtn));
            action.moveToElement(elements.nextBtn).click().perform();

            Select gender = new Select(elements.gender);
            gender.selectByValue("M");

            wait.until(ExpectedConditions.elementToBeClickable(elements.nextBtn1));
            action.moveToElement(elements.nextBtn1).click().perform();

            MyFunc.Sleep(2);

            wait.until(ExpectedConditions.visibilityOf(elements.birthdayDay));
            action.moveToElement(elements.birthdayDay).click().sendKeys("1").perform();

            Select month = new Select(elements.birthdayMonth);
            month.selectByValue("1");

            wait.until(ExpectedConditions.visibilityOf(elements.birthdayYear));
            action.moveToElement(elements.birthdayYear).click().sendKeys("1990").perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.nextBtn1));
            action.moveToElement(elements.nextBtn1).click().perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.address));
            action.moveToElement(elements.address).click().sendKeys("test address").perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.nextBtn1));
            action.moveToElement(elements.nextBtn1).click().perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.phoneNumber));
            action.moveToElement(elements.phoneNumber).sendKeys("111111111111").perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.nextBtn1));
            action.moveToElement(elements.nextBtn1).click().perform();

            Select relationshipType = new Select(elements.relationshipType);
            relationshipType.selectByIndex(3);

            wait.until(ExpectedConditions.visibilityOf(elements.personName));
            action.scrollToElement(elements.personName).sendKeys("Test").perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.nextBtn1));
            action.moveToElement(elements.nextBtn1).click().perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.confirmBtn));
            action.moveToElement(elements.confirmBtn).click().perform();

            MyFunc.Sleep(3);

            action.moveToElement(elements.homeBtn).click().perform();
        }
        wait.until(ExpectedConditions.elementToBeClickable(elements.dataManagementBtn));
        action.moveToElement(elements.dataManagementBtn).click().perform();

        wait.until(ExpectedConditions.elementToBeClickable(elements.mergePatientBtn));
        action.moveToElement(elements.mergePatientBtn).click().perform();

        wait.until(ExpectedConditions.visibilityOf(elements.searchByName));
        action.scrollToElement(elements.searchByName).perform();
        elements.searchByName.sendKeys("Test User" + Keys.ENTER);

        MyFunc.Sleep(2);

        action.moveToElement(elements.firstPatient).click().perform();

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
