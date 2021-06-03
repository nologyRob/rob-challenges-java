package com.nology.unittesting_06;

import java.util.*;

public class Challenge {

    // -------------- Foundation  --------------

    /**
     * Inside ChallengeTest.java, write "positive" tests for the following function
     *
     * @param sentence - Sentence we are counting words in
     * @return The amount of words in a sentence
     */
    public int getWordCount(String sentence) {
        return sentence.split(" ").length;
    }

    /**
     * Inside ChallengeTest.java, write "positive" tests for the following function
     *
     * @param word
     * @return
     */
    public boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        return word.toLowerCase().equals(sb.reverse().toString().toLowerCase());

    }

    // -------------- Intermediate  --------------

    /**
     * Inside ChallengeTest.java, write "positive" & "negative" tests for the following function
     *
     * @param firstName -
     * @param lastName -
     * @return
     */
    public String getFullName(String firstName, String lastName) {
        // ... This needs changing to work with null values
        return firstName + " " + lastName;
    }

    /**
     * ... Extra challenge inside UserRepository
     * */

    // -------------- Advanced  --------------

    /**
     * ... Extra challenge inside UserController
     */


}
