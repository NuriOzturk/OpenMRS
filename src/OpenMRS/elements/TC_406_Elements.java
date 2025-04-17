package OpenMRS.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_406_Elements {

    public TC_406_Elements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//i[@class='icon-search']")
    public WebElement findPatientRecordButton;
    @FindBy(xpath = "//*[@id='patient-search']")
    public WebElement patientSearch;
    @FindBy(xpath = "//td[text()='No matching records found']")
    public WebElement notFound;
    @FindBy(xpath = "//td[text()='Thomas White']")
    public WebElement registeredpatient;
    @FindBy(xpath = "//*[text()='RECENT VISITS']")
    public WebElement successPage;
}
