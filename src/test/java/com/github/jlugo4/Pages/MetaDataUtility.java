package com.github.jlugo4.Pages;

import org.apache.commons.lang3.RandomStringUtils;

public class MetaDataUtility {

    public static String createTempName() {
        return RandomStringUtils.randomAlphabetic(10, 10).toLowerCase();
    }

    public static String createEmail(){
        return createTempName() + "@gmail.com";
    }

    public static String createPassword(){
        return createTempName();
    }
}
