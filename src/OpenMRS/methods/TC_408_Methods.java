package OpenMRS.methods;

import OpenMRS.elements.TC_408_Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class TC_408_Methods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    TC_408_Elements elements;

    public TC_408_Methods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
    }

    public void toList() {
        elements = new TC_408_Elements(driver);

        wait.until(ExpectedConditions.elementToBeClickable(elements.findPatientRecordButton));
        elements.findPatientRecordButton.click();

        wait.until(ExpectedConditions.visibilityOf(elements.patientRecordListText));
        Assert.assertTrue(elements.patientRecordListText.isDisplayed(), "Find Patient Record");

        List<WebElement> patientRecordLists = elements.patientRecordList;
        String numberOfPatient = String.valueOf(patientRecordLists.size() / 5);

        Assert.assertEquals(elements.patientRecordListInfo.getText().replaceAll("[^0-9]", "").substring(1, 3), numberOfPatient, "Number of patients in the list");
    }
}