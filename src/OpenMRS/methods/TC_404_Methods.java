package OpenMRS.methods;

import OpenMRS.elements.TC_404_Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_404_Methods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    TC_404_Elements elements;
    TC_402_Methods LoginMethods;

    public TC_404_Methods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
    }

    public void patientRegistrations() {
        elements = new TC_404_Elements(driver);
        LoginMethods = new TC_402_Methods(driver, action, wait);
        LoginMethods.login();
    }
}
