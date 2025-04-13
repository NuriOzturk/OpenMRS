package OpenMRS.tests;

import OpenMRS.base.BaseDriverParameter;
import OpenMRS.methods.TC_401_Methods;
import org.testng.annotations.*;

public class TC_401_LoginTestWithInvalidData extends BaseDriverParameter {
    TC_401_Methods methods;

    @BeforeClass
    @Parameters("BrowserType")
    public void setupBrowser(String browserType) {
        methods = new TC_401_Methods(driver, action, wait);
        methods.goToLoginPage();
    }

    @Test(dataProvider = "getData")
    public void loginWithInvalidData(String username, String password, Boolean locationCheck) {
        methods.loginWithInvalidData(username, password, locationCheck);
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] loginData = {{"zafer", "zafer123", true}, {"nuri", "nuri123", true}, {"yigit", "yigit123", true}, {"rifat", "rifat123", true}, {"azim", "azim123", true}, {"tugba", "tugba123", false}};
        return loginData;
    }
}
