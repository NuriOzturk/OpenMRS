package OpenMRS.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_408_Elements {

    public TC_408_Elements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//i[@class='icon-search']")
    public WebElement findPatientRecordButton;

    @FindBy(xpath = "//*[@id='content']/h2")
    public WebElement patientRecordList;
}
