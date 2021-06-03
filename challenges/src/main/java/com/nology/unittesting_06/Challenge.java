package com.nology.unittesting_06;

import java.util.Arrays;
import java.util.Locale;

public class Challenge {

    // -------------- Foundation --------------

    public int getWordCount(String sentence) {
        return sentence.split(" ").length;
    }

    public String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        return word.toLowerCase() == sb.toString();
    }

    public Boolean isEqual(int left, int right) {
        return left == right;
    }

    // -------------- Advanced --------------

}
