package OpenMRS.tests;

import OpenMRS.base.BaseDriverParameter;
import OpenMRS.methods.TC_402_Methods;
import OpenMRS.methods.TC_406_Methods;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_406_PatientSearchTest extends BaseDriverParameter {

    @Test
    @Parameters({"BrowserType"})
    public void patientSearch() {
        TC_402_Methods loginMethods = new TC_402_Methods(driver, action, wait);
        TC_406_Methods methods = new TC_406_Methods(driver, action, wait);

        loginMethods.login();
        methods.searchPatient();
    }
}
