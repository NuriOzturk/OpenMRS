package OpenMRS.tests;

import OpenMRS.base.BaseDriverParameter;
import OpenMRS.methods.TC_402_Methods;
import OpenMRS.methods.TC_409_Methods;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_409_MergePatientTest extends BaseDriverParameter {

    @Test
    @Parameters({"BrowserType"})
    public void mergePatientTest() {
        TC_402_Methods loginMethods = new TC_402_Methods(driver, action, wait);
        TC_409_Methods methods = new TC_409_Methods(driver, action, wait);

        loginMethods.login();
        methods.mergePatient();
    }
}
