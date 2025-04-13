package Utility;

import OpenMRS.base.BaseDriverParameter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class MyFunc {
    public static BaseDriverParameter driver;

    public static void Sleep(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static int GetRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public static int GetRandomNumber(int max) {
        return (int) (Math.random() * max);
    }
    public static void scrollElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
}
