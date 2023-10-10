package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.PalindromeChecker.isPalindrome;

public class TestPalindrome {
    private static final Logger logger = LogManager.getLogger(PalindromeChecker.class);

    @Test
    public static void positiveScenarios(){
        //Even chars number
        Assert.assertTrue(isPalindrome("abba"));
        //Odd chars number
        Assert.assertTrue(isPalindrome("abcba"));
        //With numbers
        Assert.assertTrue(isPalindrome("a2c1c2a"));
        //With space at the end
        Assert.assertTrue(isPalindrome("abba "));
        //With space at the beginning
        Assert.assertTrue(isPalindrome(" abba "));
        //One letter
        Assert.assertTrue(isPalindrome("a"));
    }

    @Test
    public static void negativeScenarios(){
        //Space in the middle
        Assert.assertFalse(isPalindrome("abc ba"));
        //Not palindrome
        Assert.assertFalse(isPalindrome("a2c211c2a"));
    }
}
