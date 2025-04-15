package OpenMRS.methods;

import OpenMRS.elements.TC_409_Elements;
import Utility.MyFunc;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

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
        List< String > patient = new ArrayList<>();

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
            gender.selectByIndex(1);

            wait.until(ExpectedConditions.elementToBeClickable(elements.nextBtn));
            action.moveToElement(elements.nextBtn).click().perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.birthdayDay));
            elements.birthdayDay.click();
            action.sendKeys("1").build().perform();

            Select month = new Select(elements.birthdayMonth);
            month.selectByValue("1");

            wait.until(ExpectedConditions.visibilityOf(elements.birthdayYear));
            action.moveToElement(elements.birthdayYear).click().sendKeys("1990").build().perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.nextBtn));
            action.moveToElement(elements.nextBtn).click().perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.address));
            action.moveToElement(elements.address).click().sendKeys("test address").build().perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.nextBtn));
            action.moveToElement(elements.nextBtn).click().perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.phoneNumber));
            action.moveToElement(elements.phoneNumber).sendKeys("111111111111").perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.nextBtn));
            action.moveToElement(elements.nextBtn).click().perform();

            Select relationshipType = new Select(elements.relationshipType);
            relationshipType.selectByIndex(3);

            wait.until(ExpectedConditions.visibilityOf(elements.personName));
            action.scrollToElement(elements.personName).sendKeys("Test").perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.nextBtn));
            action.moveToElement(elements.nextBtn).click().perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.confirmBtn));
            action.moveToElement(elements.confirmBtn).click().perform();

            MyFunc.Sleep(3);

            wait.until(ExpectedConditions.visibilityOf(elements.homeBtn));
            action.moveToElement(elements.homeBtn).click().perform();
        }
        wait.until(ExpectedConditions.elementToBeClickable(elements.dataManagementBtn));
        action.moveToElement(elements.dataManagementBtn).click().perform();

        wait.until(ExpectedConditions.elementToBeClickable(elements.mergePatientBtn));
        action.moveToElement(elements.mergePatientBtn).click().perform();

        wait.until(ExpectedConditions.visibilityOf(elements.searchByName));
        action.scrollToElement(elements.searchByName).perform();
        elements.searchByName.sendKeys("Test User");

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
