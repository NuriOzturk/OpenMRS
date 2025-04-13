package OpenMRS.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TC_404_Elements {
    public TC_404_Elements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
