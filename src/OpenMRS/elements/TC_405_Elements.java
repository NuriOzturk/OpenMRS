package OpenMRS.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_405_Elements {

    public TC_405_Elements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//i[contains(@class, 'icon-user')])[1]")
    public WebElement adminIcon;

    @FindBy(xpath = "//*[@id='user-account-menu']//a")
    public WebElement myAccountButton;

    @FindBy(xpath = "//i[@class='icon-lock']")
    public WebElement ChangePasswordButton;

    @FindBy(xpath = "//i[@class='icon-cog']")
    public WebElement myLanguages;

    @FindBy(xpath = "//*[@id='cancel-button']")
    public WebElement cancelButton;

    @FindBy(xpath ="//h2[text()='Change Password']")
    public WebElement changePasswordPage;

    @FindBy(xpath = "//h2[text()='My Languages']")
    public WebElement myLanguagesPage;
}
