package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.example.PalindromeChecker.isPalindrome;

public class TestPalindrome {
    private static final Logger logger = LogManager.getLogger(PalindromeChecker.class);

    @Test (dataProvider = "positive", dataProviderClass = DataProviders.class)
    public static void positiveScenarios(String word, String message){
        logger.info("Positive scenario.");
        logger.info(String.format("Word to test: %s - Message: %s.", word, message));
        Assert.assertTrue(isPalindrome(word));
    }

    @Test (dataProvider = "negative", dataProviderClass = DataProviders.class)
    public static void negativeScenarios(String word, String message){
        logger.info("Negative scenario.");
        logger.info(String.format("Word to test: %s - Message: %s.", word, message));
        Assert.assertFalse(isPalindrome(word));
    }
}
