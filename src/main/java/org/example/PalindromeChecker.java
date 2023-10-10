package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PalindromeChecker {
    private static final Logger logger = LogManager.getLogger(PalindromeChecker.class);
    public static boolean isPalindrome(String wordToCheck) {

        String word = wordToCheck.trim();

        logger.info(String.format("Word to check: %s", word));
        StringBuilder reversedWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        };
        logger.info(String.format("Reversed word: %s", reversedWord));
        return word.equalsIgnoreCase(reversedWord.toString());
    }
}
