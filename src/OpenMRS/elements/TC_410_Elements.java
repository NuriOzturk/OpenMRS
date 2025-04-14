package OpenMRS.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_410_Elements {

    public TC_410_Elements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(@href,'appointmentscheduling')]")
    public WebElement appointmentScheduling;

    @FindBy(xpath = "(//div[@class='col-6 col-sm-2 col-md-3 col-lg-2 homeList schedulingList ml-3'])[3]")
    public WebElement manageAppointments;

    @FindBy(xpath = "//input[@id='patient-search']")
    public WebElement patientSearchInput;

    @FindBy(xpath = "//tr[@class='odd']")
    public WebElement patientSearchResult;

    @FindBy(xpath = "(//i[@class='icon-remove medium'])[2]")
    public WebElement timezoneWarning;
}
