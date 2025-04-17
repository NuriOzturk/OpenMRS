package OpenMRS.base;

import Utility.MyFunc;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import java.time.Duration;

public class BaseDriverParameter {
    public WebDriver driver;
    public Actions action;
    public WebDriverWait wait;

    @BeforeClass
    @Parameters("BrowserType")
    public void setup(String browserType) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--lang=en");
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--lang=en");

        switch (browserType.toLowerCase()) {
            case "edge":
                driver = new EdgeDriver(edgeOptions);
                break;
            case "chrome":
            default:
                driver = new ChromeDriver(chromeOptions);
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        action = new Actions(driver);
        driver.get("https://openmrs.org/");
    }

    @AfterClass
    public void tearDown() {
        MyFunc.sleep(5);
        if (driver != null) {
            driver.quit();
        }
    }
}
