package org.example;

import org.testng.annotations.DataProvider;

public class DataProviders
{
    @DataProvider(name = "positive")
    public Object[][] positive(){
        return new Object[][] {
                {"abba", "Even chars number"},
                {"abcba", "Odd chars number"},
                {"a2c1c2a", "With numbers"},
                {"abba ", "With space at the end"},
                {" abba ", "With space at the beginning"},
                {"a", "One letter"},};
    };

    @DataProvider(name = "negative")
    public Object[][] negative(){
        return new Object[][] {
                {"abc ba", "Space in the middle"},
                {"a2c211c2a", "Not palindrome"}};
    }

}