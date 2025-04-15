package OpenMRS.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_401_402_403_Elements {

    public TC_401_402_403_Elements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='zak-button']")
    public WebElement demoButton;

    @FindBy(xpath = "(//span[@class='elementor-button-content-wrapper'])[2]")
    public WebElement exploreOpenMRSButton;

    @FindBy(xpath = "(//span[@class='elementor-button-content-wrapper'])[4]")
    public WebElement enterDemoButton;

    @FindBy(xpath = "//i[@class='icon-lock small']")
    public WebElement loginPageIcon;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement usernameField;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordField;

    @FindBy(xpath = "//li[@id='Inpatient Ward']")
    public WebElement inpatientWard;

    @FindBy(xpath = "//input[@id='loginButton']")
    public WebElement loginButton;

    @FindBy(xpath = "//i[@class='icon-search']")
    public WebElement findPatientIcon;

    @FindBy(xpath = "//i[@class='icon-signout small']")
    public WebElement logoutButton;

    @FindBy(xpath = "//span[@id='sessionLocationError']")
    public WebElement locationErrorMessage;

    @FindBy(xpath = "//div[@id='error-message']")
    public WebElement invalidLoginErrorMessage;
}
