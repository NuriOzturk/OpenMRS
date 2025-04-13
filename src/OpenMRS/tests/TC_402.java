package OpenMRS.tests;

import OpenMRS.base.BaseDriverParameter;
import OpenMRS.methods.TC_402_Methods;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_402 extends BaseDriverParameter {
    @Test
    @Parameters({"BrowserType"})
    public void loginTest() {
        TC_402_Methods methods = new TC_402_Methods(driver, action, wait);
        methods.login();
    }
}
