package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException{
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        List<String> titles = new ArrayList<>();
        List<Boolean> startsW_expected = new ArrayList<>();
        String expectedStr = "http://practice.cybertekschool.com";

        WebDriver driver = BrowserFactory.getDriver("chrome");

        for(String eachUrl : urls){
            driver.get(eachUrl);
            StringUtility.wait(3);
            titles.add(driver.getTitle());
            startsW_expected.add(driver.getCurrentUrl().startsWith(expectedStr));
        }


        //if title 1 is equal to title 2 and also title 3. no need to check title 2 and 3 equality
        //it means title2 and 3 are also equal.
        for(int i = 0; i<titles.size()-1; i++){
            StringUtility.verifyEquals(titles.get(i),titles.get(i+1));
        }
//        //This is another way
//        // this one checks checks each title with each other.
//        for(int i=0; i<2; i++){
//            for(int j = 1; j<titles.size(); j++){
//                StringUtility.verifyEquals(titles.get(i), titles.get(j));
//            }
//
//        }
        for(Boolean eachStart : startsW_expected){
            if(eachStart){
                System.out.println("Test Passed_ Each URL Starts with "+ expectedStr);
            }else{
                System.out.println("Test failed _ Not all url starts with "+ expectedStr);
            }
        }

        StringUtility.wait(3);
        driver.quit();

    }
}
