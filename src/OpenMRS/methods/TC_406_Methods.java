package OpenMRS.methods;

import OpenMRS.elements.TC_406_Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_406_Methods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    TC_406_Elements elements;
    String wrongName = "xzy";
    String correctName = "Thomas White";

    public TC_406_Methods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
    }

    public void searchPatient() {
        elements = new TC_406_Elements(driver);
        elements.findPatientRecordButton.click();

        elements.patientSearch.sendKeys(wrongName);
        wait.until(ExpectedConditions.visibilityOf(elements.notFound));

        Assert.assertTrue(elements.notFound.isDisplayed(), "No matching records found not displayed");
        System.out.println(elements.notFound.getText());
        elements.patientSearch.clear();
        elements.patientSearch.sendKeys(correctName);
        elements.registeredpatient.click();

        wait.until(ExpectedConditions.visibilityOf(elements.successPage));
        Assert.assertTrue(elements.successPage.isDisplayed(), "Wrong Page");
    }
}
