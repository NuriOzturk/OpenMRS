package OpenMRS.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    @FindBy(xpath = "(//tr[@class='odd'])[1]")
    public WebElement firstPatient;

    @FindBy(xpath = "(//tr[@class='even'])[1]")
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

    @FindBy(xpath = "(//*[@type='button'])[7]")
    public WebElement registerBtn;

    @FindBy(xpath = "//input[@name='givenName']")
    public WebElement givenName;

    @FindBy(xpath = "//input[@name='familyName']")
    public WebElement familyName;

    @FindBy(xpath = "//*[@id='gender-field']")
    public WebElement gender;

    @FindBy(xpath = "//button[@id='next-button']")
    public WebElement nextBtn;

    @FindBy(xpath = "//input[@name='birthdateDay']")
    public WebElement birthdayDay;

    @FindBy(xpath = "//*[@name='birthdateMonth']")
    public WebElement birthdayMonth;

    @FindBy(xpath = "//*[@name='birthdateYear']")
    public WebElement birthdayYear;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement address;

    @FindBy(xpath = "//input[@name='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@name='relationship_type']")
    public WebElement relationshipType;

    @FindBy(xpath = "//*[@placeholder='Person Name']")
    public WebElement personName;

    @FindBy(xpath = "//input[@value='Confirm']")
    public WebElement confirmBtn;

    @FindBy(xpath = "//a[@href='/openmrs/referenceapplication/home.page']")
    public WebElement homeBtn;
}
