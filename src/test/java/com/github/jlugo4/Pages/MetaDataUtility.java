package com.github.jlugo4.Pages;

import org.apache.commons.lang3.RandomStringUtils;

public class MetaDataUtility {

    //Create sign up name
    public static String createTempName() {
        return RandomStringUtils.randomAlphabetic(10, 10).toLowerCase();
    }

    //Create Email
    public static String createEmail(){
        return createTempName() + "@gmail.com";
    }

    //Create password
    public static String createPassword(){
        return createTempName();
    }

    //Create firstName
    public static String createFirstName(){
        return createTempName();
    }

    //Create lastName
    public static String createLastName(){
        return createTempName();
    }

    public static String createAddress(){
        return RandomStringUtils.randomNumeric(6) + " " + createTempName() + " Street";
    }

    public static String createZipcode(){
        return RandomStringUtils.randomNumeric(5);
    }

    public static String createMobileNumber(){
        return RandomStringUtils.randomNumeric(3) + "-" + RandomStringUtils.randomNumeric(3) + "-" + RandomStringUtils.randomNumeric(4);
    }
}
