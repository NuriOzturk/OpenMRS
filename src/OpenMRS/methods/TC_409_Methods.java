package OpenMRS.methods;

import OpenMRS.elements.TC_409_Elements;
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
        String searchByName = "Test User";
        String givenName = "Test";
        String familyName = "User";
        String birthdayDay = "1";
        String birthdayYear = "1990";
        String address = "Test address";
        String phoneNumber = "1111111111";
        String personName = "Test";

        for (int i = 0; i < 2; i++) {
            wait.until(ExpectedConditions.elementToBeClickable(elements.registerBtn));
            action.moveToElement(elements.registerBtn).click().build().perform();

            wait.until(ExpectedConditions.visibilityOf(elements.givenName));
            action.moveToElement(elements.givenName).sendKeys(givenName).build().perform();

            wait.until(ExpectedConditions.visibilityOf(elements.familyName));
            action.moveToElement(elements.familyName).click().sendKeys(familyName).build().perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.nextBtn));
            action.moveToElement(elements.nextBtn).click().build().perform();

            Select gender = new Select(elements.gender);
            gender.selectByIndex(1);

            wait.until(ExpectedConditions.elementToBeClickable(elements.nextBtn));
            action.moveToElement(elements.nextBtn).click().build().perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.birthdayDay));
            elements.birthdayDay.click();
            action.sendKeys(birthdayDay).build().perform();

            Select month = new Select(elements.birthdayMonth);
            month.selectByValue("1");

            wait.until(ExpectedConditions.visibilityOf(elements.birthdayYear));
            action.moveToElement(elements.birthdayYear).click().sendKeys(birthdayYear).build().perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.nextBtn));
            action.moveToElement(elements.nextBtn).click().build().perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.address));
            action.moveToElement(elements.address).click().sendKeys(address).build().perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.nextBtn));
            action.moveToElement(elements.nextBtn).click().build().perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.phoneNumber));
            action.moveToElement(elements.phoneNumber).sendKeys(phoneNumber).build().perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.nextBtn));
            action.moveToElement(elements.nextBtn).click().build().perform();

            Select relationshipType = new Select(elements.relationshipType);
            relationshipType.selectByIndex(3);

            wait.until(ExpectedConditions.visibilityOf(elements.personName));
            action.scrollToElement(elements.personName).sendKeys(personName).build().perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.nextBtn));
            action.moveToElement(elements.nextBtn).click().build().perform();

            wait.until(ExpectedConditions.elementToBeClickable(elements.confirmBtn));
            action.moveToElement(elements.confirmBtn).click().build().perform();

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
