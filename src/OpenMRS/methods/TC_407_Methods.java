package OpenMRS.methods;

import OpenMRS.elements.TC_404_407_Elements;
import Utility.MyFunc;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_407_Methods {
    WebDriver driver;
    Actions actions;
    WebDriverWait wait;
    TC_404_407_Elements elements;

    public TC_407_Methods(WebDriver driver, Actions actions, WebDriverWait wait) {
        this.driver = driver;
        this.actions = actions;
        this.wait = wait;
    }

    public void patientDeletion() {
        elements = new TC_404_407_Elements(driver);

        String reason = "The patient's treatment is complete.";
        String patientId = "100";
        elements.homePageButton.click();

        wait.until(ExpectedConditions.visibilityOf(elements.findPatientButton));
        elements.findPatientButton.click();

        wait.until(ExpectedConditions.visibilityOf(elements.patientSearchField));
        elements.patientSearchField.sendKeys(patientId + Keys.ENTER);
        MyFunc.sleep(2); //I had to use ImplicitlyWait and ExplicitWait because it could not be solved.
        wait.until(ExpectedConditions.visibilityOf(elements.searchResultField));
        String deleteId = elements.delete.getText();

        wait.until(ExpectedConditions.visibilityOf(elements.patientSearchField));
        elements.patientSearchField.clear();
        elements.patientSearchField.sendKeys(deleteId + Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOf(elements.patientIdField));
        Assert.assertEquals(elements.patientIdField.getText(), deleteId);
        Assert.assertTrue(elements.generalActionsBox.isDisplayed());
        Assert.assertTrue(elements.deletePatientButton.isDisplayed());
        elements.deletePatientButton.click();

        wait.until(ExpectedConditions.visibilityOf(elements.reasonField));
        elements.reasonField.sendKeys(reason);
        elements.reasonConfirmButton.click();

        wait.until(ExpectedConditions.visibilityOf(elements.patientSearchField));
        elements.patientSearchField.sendKeys(deleteId + Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(elements.searchResultField));

        Assert.assertEquals(elements.searchResult.getText(), "No matching records found");
    }
}