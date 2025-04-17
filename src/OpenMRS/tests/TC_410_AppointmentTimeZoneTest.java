package OpenMRS.tests;

import OpenMRS.base.BaseDriverParameter;
import OpenMRS.methods.TC_402_Methods;
import OpenMRS.methods.TC_410_Methods;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_410_AppointmentTimeZoneTest extends BaseDriverParameter {

    @Test
    @Parameters({"BrowserType"})
    public void verifyTimeZoneWarning() {
        TC_402_Methods loginMethods = new TC_402_Methods(driver, action, wait);
        TC_410_Methods methods = new TC_410_Methods(driver, action, wait);

        loginMethods.login();
        methods.AppointmentTimeZone();
    }
}
