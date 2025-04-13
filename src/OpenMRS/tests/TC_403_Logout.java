package OpenMRS.tests;

import OpenMRS.base.BaseDriverParameter;
import OpenMRS.methods.TC_402_Methods;
import OpenMRS.methods.TC_403_Methods;
import org.testng.annotations.*;

public class TC_403_Logout extends BaseDriverParameter {

    @Test
    @Parameters({"BrowserType"})
    public void logoutTest() {
        TC_402_Methods loginMethods = new TC_402_Methods(driver, action, wait);
        TC_403_Methods methods = new TC_403_Methods(driver, action, wait);
        loginMethods.login();
        methods.logout();
    }
}
