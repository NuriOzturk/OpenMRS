package OpenMRS.methods;

import OpenMRS.elements.TC_410_Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_410_Methods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    TC_410_Elements elements;

    public TC_410_Methods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
    }

    public void AppointmentTimeZone() {
        elements = new TC_410_Elements(driver);
        String patientName = "Paul Walker";

        wait.until(ExpectedConditions.visibilityOf(elements.appointmentScheduling));
        elements.appointmentScheduling.click();

        wait.until(ExpectedConditions.visibilityOf(elements.manageAppointments));
        elements.manageAppointments.click();

        wait.until(ExpectedConditions.visibilityOf(elements.patientSearchInput));
        elements.patientSearchInput.sendKeys(patientName);

        wait.until(ExpectedConditions.visibilityOf(elements.patientSearchResult));
        elements.patientSearchResult.click();

        wait.until(ExpectedConditions.visibilityOf(elements.timezoneWarning));
        Assert.assertTrue(elements.timezoneWarning.isDisplayed(), "This message not displayed ");
    }
}