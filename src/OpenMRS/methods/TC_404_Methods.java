package OpenMRS.methods;

import OpenMRS.elements.TC_404_407_Elements;
import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_404_Methods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    TC_404_407_Elements elements;

    public TC_404_Methods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
    }

    public void patientRegistrations() {
        elements = new TC_404_407_Elements(driver);

        String firstName = "Benjamin";
        String middleName = "Thomas";
        String familyName = "Miller";
        String gender = "Male";
        String birthdate = "2, July, 1987";
        String address = "202 Desert Ave";
        String ciyt = "Phoenix";
        String state = "Arizona";
        String country = "USA";
        String postalCode = "85323";
        String phoneNumber = "(555) 567-8901";
        String relativesName = "Samantha Black";
        String relativesType = "Aunt/Uncle";

        wait.until(ExpectedConditions.visibilityOf(elements.checkAdmin));
        Assert.assertTrue(elements.checkAdmin.getText().contains("(admin) at Inpatient Ward."));

        wait.until(ExpectedConditions.elementToBeClickable(elements.registerButton));
        action.moveToElement(elements.registerButton).click().perform();

        wait.until(ExpectedConditions.visibilityOf(elements.nameField));
        elements.nameField.sendKeys(firstName);
        elements.middleNameField.sendKeys(middleName);
        elements.familyNameField.sendKeys(familyName);
        elements.nextButton.click();

        Select gndr = new Select(elements.gender);
        gndr.selectByValue("M");

        wait.until(ExpectedConditions.elementToBeClickable(elements.nextButton));
        elements.nextButton.click();

        wait.until(ExpectedConditions.visibilityOf(elements.birthdayDay));
        elements.birthdayDay.sendKeys(birthdate.substring(0, 1));
        Select month = new Select(elements.birthdayMonth);
        month.selectByVisibleText(birthdate.substring(3, 7));
        elements.birthdayYear.sendKeys(birthdate.substring(9));
        elements.nextButton.click();

        wait.until(ExpectedConditions.visibilityOf(elements.address1Field));
        elements.address1Field.sendKeys(address);
        elements.cityField.sendKeys(ciyt);
        elements.stateField.sendKeys(state);
        elements.countryField.sendKeys(country);
        elements.postalCodeField.sendKeys(postalCode);
        elements.nextButton.click();

        wait.until(ExpectedConditions.visibilityOf(elements.phoneNumberField));
        elements.phoneNumberField.sendKeys(phoneNumber);
        elements.nextButton.click();

        wait.until(ExpectedConditions.visibilityOf(elements.relationsField));
        Select relation = new Select(elements.relationsField);
        relation.selectByIndex(4);
        elements.relativesNameield.sendKeys(relativesName);
        elements.nextButton.click();


        Assert.assertTrue(elements.nameCheckField.getText().contains(firstName + ", " + middleName + ", " + familyName));
        Assert.assertTrue(elements.genderCheckField.getText().contains(gender));
        Assert.assertTrue(elements.birthdateCheckField.getText().contains(birthdate));
        Assert.assertTrue(elements.addressCheckField.getText().contains(address + ", " + ciyt + ", " + state + ", " + country + ", " + postalCode));
        Assert.assertTrue(elements.phoneNumberCheckField.getText().contains(phoneNumber));
        Assert.assertTrue(elements.relativesCheckField.getText().contains(relativesName+" - "+relativesType));
        elements.confirmButton.click();


        MyFunc.Sleep(30);


    }
}
