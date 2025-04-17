package OpenMRS.tests;

import OpenMRS.base.BaseDriverParameter;
import OpenMRS.methods.TC_402_Methods;
import OpenMRS.methods.TC_404_Methods;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_404_PatientRegistrationTest extends BaseDriverParameter {

    @Test
    @Parameters("BrowserType")
    public void patientRegistration() {
        TC_402_Methods loginMethots = new TC_402_Methods(driver, action, wait);
        TC_404_Methods registrationsMethods = new TC_404_Methods(driver, action, wait);
        loginMethots.login();
        registrationsMethods.patientRegistrations();
    }
}
