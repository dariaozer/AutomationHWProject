package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com/",
                "https://walmart.com", "https://www.westelm.com/");

       WebDriver driver = BrowserFactory.getDriver("chrome");


        for(String eachUrl : urls){
            driver.get(eachUrl);
            String currentUrl = driver.getCurrentUrl();
            String currentTittle = driver.getTitle();
            if(currentUrl.contains(currentTittle.replace(" ","").toLowerCase())){
                System.out.println("test passed for "+ currentUrl);

            }else{
                System.out.println("test failed for "+ currentUrl);

            }

        }

       StringUtility.wait(3);
        driver.quit();
    }


}
