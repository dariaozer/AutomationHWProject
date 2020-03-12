package com.cbt.utilities;

public class StringUtility {
    public static void verifyEquals(String expected, String actual){
        if(actual.equals(expected)){
            System.out.println(expected+" equals to "+ actual);
            System.out.println("PASS");
        }else{
            System.out.println(expected+ " does not equal to "+ actual);
            System.out.println("FAIL");
        }
    }

    public static void wait(int seconds){
        try{
            Thread.sleep(1000 * seconds);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
