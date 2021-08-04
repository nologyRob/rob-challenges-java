package com.nology.unittesting_06;

import com.nology.unittesting_06.Challenge;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

public class ChallengeTest {

    private Challenge challenge;

    @BeforeEach
    void setUp() {
        this.challenge = new Challenge();
    }

    @AfterEach
    void tearDown() {
    }

    // -------------- Foundation  --------------

    // 1 - Write a positive test below
    public void getWordCount_ValidSentence_ReturnsCorrectCount() {
        // ... Write your code here
    }

    // 2 - Write a positive test below
    public void isPalindrome_ValidPalindrome_ReturnsTrue() {
        // ... Write your code here
    }

    // -------------- Intermediate  --------------

    // 3 - Write a positive test below
    public void getFullName_ValidName_ReturnsCorrectFullName() {
        // ... Write your code here
    }

    // 4 - Write a negative test below
    public void getFullName_NullLastName_ReturnsCorrectFullName() {
        // ... Write your code here
        //     NOTE: You might want to alter getFullName() for this
    }

    // 5 - Write a positive test below
    //     NOTE: "updateScore" method is in UserRepository class
    public void setScore_ValidUser_UpdatesUserScore() {
        // ... Write your code here
    }

    // 6 - Write a negative test below
    //     NOTE: "updateScore" method is in UserRepository class
    public void setScore_BadScore_ThrowsIllegalArgumentException() {
        // ... Write your code here
    }

}
