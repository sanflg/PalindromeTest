package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PalindromeChecker {
    private static final Logger logger = LogManager.getLogger(PalindromeChecker.class);
    public static boolean isPalindrome(String wordToCheck) {

        String word = wordToCheck.trim();
        String halfWord = word.substring(0, word.length()/2);

        logger.info(String.format("Word to check: %s.", word));
        StringBuilder reversedHalfWord = new StringBuilder();
        for (int i = word.length() -1; i >= word.length()/2 + word.length() % 2; i--) {
            reversedHalfWord.append(word.charAt(i));
        }
        logger.info(String.format("Reversed word: %s.", reversedHalfWord));
        return halfWord.equalsIgnoreCase(reversedHalfWord.toString());
    }
}
