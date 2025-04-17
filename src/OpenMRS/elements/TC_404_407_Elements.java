package OpenMRS.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_404_407_Elements {
    public TC_404_407_Elements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='content']/div[2]/div/h4")
    public WebElement checkAdmin;

    @FindBy(xpath = "(//*[@type='button'])[5]")
    public WebElement registerButton;

    @FindBy(name = "givenName")
    public WebElement nameField;

    @FindBy(name = "middleName")
    public WebElement middleNameField;

    @FindBy(name = "familyName")
    public WebElement familyNameField;

    @FindBy(id = "next-button")
    public WebElement nextButton;

    @FindBy(id = "gender-field")
    public WebElement gender;

    @FindBy(name = "birthdateDay")
    public WebElement birthdayDay;

    @FindBy(name = "birthdateMonth")
    public WebElement birthdayMonth;

    @FindBy(name = "birthdateYear")
    public WebElement birthdayYear;

    @FindBy(id = "address1")
    public WebElement address1Field;

    @FindBy(id = "cityVillage")
    public WebElement cityField;

    @FindBy(id = "stateProvince")
    public WebElement stateField;

    @FindBy(id = "country")
    public WebElement countryField;

    @FindBy(id = "postalCode")
    public WebElement postalCodeField;

    @FindBy(name = "phoneNumber")
    public WebElement phoneNumberField;

    @FindBy(id = "relationship_type")
    public WebElement relationsField;

    @FindBy(xpath = "//*[@placeholder='Person Name']")
    public WebElement relativesNameield;

    @FindBy(xpath = "(//*[@id='dataCanvas']/div/p)[1]")
    public WebElement nameCheckField;

    @FindBy(xpath = "(//*[@id='dataCanvas']/div/p)[2]")
    public WebElement genderCheckField;

    @FindBy(xpath = "(//*[@id='dataCanvas']/div/p)[3]")
    public WebElement birthdateCheckField;

    @FindBy(xpath = "(//*[@id='dataCanvas']/div/p)[4]")
    public WebElement addressCheckField;

    @FindBy(xpath = "//*[@id='dataCanvas']/div/p[5]")
    public WebElement phoneNumberCheckField;

    @FindBy(xpath = "//*[@id='dataCanvas']/div/p[6]")
    public WebElement relativesCheckField;

    @FindBy(id = "submit")
    public WebElement confirmButton;

    @FindBy(xpath = "//div[@class='float-sm-right']/span")
    public WebElement patientIdField;

    @FindBy(xpath = "//ul[@id='breadcrumbs']//a")
    public WebElement homePageButton;

    @FindBy(xpath = "(//*[@type='button'])[2]")
    public WebElement findPatientButton;

    @FindBy(xpath = "//form[@id='patient-search-form']/input")
    public WebElement patientSearchField;

    @FindBy(xpath = "//ul[@class='float-left']")
    public WebElement generalActionsBox;

    @FindBy(xpath = "//ul[@class='float-left']/li[8]")
    public WebElement deletePatientButton;

    @FindBy(id = "delete-reason")
    public WebElement reasonField;

    @FindBy (xpath = "//div[@id='delete-patient-creation-dialog']//button[1]")
    public WebElement reasonConfirmButton;

    @FindBy(xpath = "//table[@id='patient-search-results-table']//td")
    public WebElement searchResultField;

    @FindBy(xpath = "//td[text()='No matching records found']")
    public WebElement searchResult;

    @FindBy(xpath = " //td[@class]")
    public WebElement delete;
}