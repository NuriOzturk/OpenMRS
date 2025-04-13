package OpenMRS.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_409_Elements {
    public TC_409_Elements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='icon-hdd']")
    public WebElement dataManagementBtn;

    @FindBy(xpath = "//*[@class='icon-group']")
    public WebElement mergePatientBtn;

    @FindBy(xpath = "//input[@placeholder='Search by ID or Name']")
    public WebElement searchByName;

    @FindBy(xpath = "(//tr[@class='even'])[1]")
    public WebElement firstPatient;

    @FindBy(xpath = "(//tr[@class='even'])[2]")
    public WebElement secondPatient;

    @FindBy(xpath = "//input[@id='confirm-button']")
    public WebElement continueBtn;

    @FindBy(xpath = "(//div[@class='messages-container'])[2]")
    public WebElement warnMessage;

    @FindBy(xpath = "//div[@id='second-patient']")
    public WebElement mergePatient;

    @FindBy(xpath = "//input[@value='Yes, continue']")
    public WebElement yesContinueBtn;

    @FindBy(xpath = "//div[@class='float-sm-right']")
    public WebElement mergedPatient;
}
