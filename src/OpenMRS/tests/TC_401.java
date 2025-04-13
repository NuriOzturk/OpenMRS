package OpenMRS.tests;

import org.testng.annotations.*;

public class TC_401 {

    @Test(dataProvider = "getData")
    @Parameters({"BrowserType", "username", "password"})
    public void loginTest(String username, String password) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] loginData = {{"zafer", "pass1"}, {"nuri", "pass2"}, {"yigit", "pass3"}, {"rifat", "pass4"}, {"azim", "pass5"}, {"tugba", "pass6"}};
        return loginData;
    }
}
