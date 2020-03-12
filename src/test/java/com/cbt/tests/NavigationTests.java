package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException{
       chromeTest();
        firefoxTest();
      // edgeTest();
       // System.out.println(getOperatingSystem());
    }

public static void chromeTest() throws InterruptedException{
    driver= BrowserFactory.getDriver("chrome");
    driver.get("http://google.com");
    Thread.sleep(3);
    String expected = driver.getTitle();
    Thread.sleep(3);
    driver.navigate().to("https://etsy.com");
    String expected2 =driver.getTitle();
    Thread.sleep(3);
    driver.navigate().back();
    String actual = driver.getTitle();
    driver.navigate().forward();
    String actual2 = driver.getTitle();
    StringUtility.verifyEquals(expected,actual);
    StringUtility.verifyEquals(expected2, actual2);
    Thread.sleep(3);
    driver.quit();

}
    public static void firefoxTest() throws InterruptedException{
        driver= BrowserFactory.getDriver("firefox");
        driver.get("http://google.com");
        Thread.sleep(3);
        String expected = driver.getTitle();
        Thread.sleep(3);
        driver.navigate().to("https://etsy.com");
        String expected2 =driver.getTitle();
        Thread.sleep(3);
        driver.navigate().back();
        String actual = driver.getTitle();
        driver.navigate().forward();
        String actual2 = driver.getTitle();
        StringUtility.verifyEquals(expected,actual);
        StringUtility.verifyEquals(expected2, actual2);
        Thread.sleep(3);
        driver.quit();
    }

    public static void edgeTest() throws InterruptedException{
        driver= BrowserFactory.getDriver("edge");
        driver.get("http://google.com");
        Thread.sleep(3);
        String expected = driver.getTitle();
        Thread.sleep(3);
        driver.navigate().to("https://etsy.com");
        String expected2 =driver.getTitle();
        Thread.sleep(3);
        driver.navigate().back();
        String actual = driver.getTitle();
        driver.navigate().forward();
        String actual2 = driver.getTitle();
        StringUtility.verifyEquals(expected,actual);
        StringUtility.verifyEquals(expected2, actual2);
        Thread.sleep(3);
        driver.quit();
    }



    public static String getOperatingSystem() {
        String os = System.getProperty("os.name");
        // System.out.println("Using System Property: " + os);
        return os;
    }
}
