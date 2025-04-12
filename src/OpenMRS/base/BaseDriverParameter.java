package OpenMRS.base;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseDriverParameter {
    public WebDriver driver;
    public Actions action;
    public WebDriverWait wait;

    @BeforeClass
    @Parameters("BrowserType")
    public void Setup(String browserType) {

        switch (browserType.toLowerCase()) {
            case "edge":
                driver = new EdgeDriver();
                break;
            case "chrome":
            default:
                driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(140)); // The time was kept long in order to pass the captcha verifications manually.
        action = new Actions(driver);
        driver.get("https://openmrs.org/");
    }

    @AfterClass
    public void TearDown() {
        MyFunc.Sleep(5);
        driver.quit();
    }
}
