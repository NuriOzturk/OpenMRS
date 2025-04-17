package OpenMRS.tests;

import OpenMRS.base.BaseDriverParameter;
import OpenMRS.methods.TC_402_Methods;
import OpenMRS.methods.TC_404_Methods;
import OpenMRS.methods.TC_407_Methods;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_407_PatientDeletionTest extends BaseDriverParameter {

    @Test
    @Parameters("BrowserType")
    public void patientDeletion() {
        TC_402_Methods loginMethods = new TC_402_Methods(driver, action, wait);
        TC_404_Methods registrationMethods = new TC_404_Methods(driver, action, wait);
        TC_407_Methods deletionMethods = new TC_407_Methods(driver, action, wait);

        loginMethods.login();
        registrationMethods.patientRegistrations();
        deletionMethods.patientDeletion();
    }
}
