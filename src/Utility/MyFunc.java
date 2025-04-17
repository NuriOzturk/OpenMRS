package Utility;

import OpenMRS.base.BaseDriverParameter;

public class MyFunc {
    public static BaseDriverParameter driver;

    public static void sleep(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}