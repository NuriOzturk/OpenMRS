package OpenMRS.tests;

import OpenMRS.base.BaseDriverParameter;
import OpenMRS.methods.TC_402_Methods;
import OpenMRS.methods.TC_408_Methods;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_408_ToList extends BaseDriverParameter {

    @Test
    @Parameters({"BrowserType"})
    public void toListTest() {
        TC_402_Methods loginMethods = new TC_402_Methods(driver, action, wait);
        TC_408_Methods methods = new TC_408_Methods(driver, action, wait);

        loginMethods.login();
        methods.toList();
    }
}
