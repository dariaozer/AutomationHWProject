package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String browserName) {
        if (browserName.equalsIgnoreCase("safari")) {
            return null;
        } else if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().version("79").setup();
            return new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
           // System.setProperty("webdriver.edge.driver", "C:\\Users\\QCSS\\Downloads\\MicrosoftWebDriver.exe");
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        } else if (browserName.replace(" ", "").equalsIgnoreCase("internetExplorer")) {
            WebDriverManager.iedriver().setup();
            return new InternetExplorerDriver();
        }else if(browserName.equalsIgnoreCase("opera")){
            WebDriverManager.operadriver().setup();
            return new OperaDriver();
        }else{
         throw new WebDriverException("UnKnown WebDriver");
         //return null;

        }

    }
}

