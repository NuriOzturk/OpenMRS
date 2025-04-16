package OpenMRS.tests;

import OpenMRS.base.BaseDriverParameter;
import OpenMRS.methods.TC_402_Methods;
import OpenMRS.methods.TC_405_Methods;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_405_AccessingMyAccountSettings extends BaseDriverParameter {

    @Test
    @Parameters({"BrowserType"})
    public void accessingMyAccountSettings(){
        TC_402_Methods loginMethods = new TC_402_Methods(driver, action, wait);
        TC_405_Methods methods = new TC_405_Methods(driver, action, wait);

        loginMethods.login();
        methods.myAccountSettings();

    }

}
