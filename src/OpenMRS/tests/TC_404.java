package OpenMRS.tests;

import OpenMRS.base.BaseDriverParameter;
import OpenMRS.methods.TC_404_Methods;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_404 extends BaseDriverParameter {
    @Test
    @Parameters("BrowserType")
    public void patientRegistrationTest() {
        TC_404_Methods methods = new TC_404_Methods(driver, action, wait);
        methods.patientRegistrations();
    }
}
