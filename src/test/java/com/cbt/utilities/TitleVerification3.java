package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class TitleVerification3 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com/",
                "https://walmart.com", "https://www.westelm.com/");

        for(String eachUrl : urls){
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get(eachUrl);
            String currentUrl = driver.getCurrentUrl();
            String currentTittle = driver.getTitle();
            if(currentUrl.contains(currentTittle.replace(" ","").toLowerCase())){
                System.out.println("test passed for "+ currentUrl);

            }else{
                System.out.println("test failed for "+ currentUrl);

            }
            StringUtility.wait(3);
            driver.quit();
        }


    }
}


