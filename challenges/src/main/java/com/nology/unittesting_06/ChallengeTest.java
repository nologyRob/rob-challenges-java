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
    public void updateScore_ValidUser_UpdatesUserScore() {
        // ... Write your code here
    }

    // 6 - Write a negative test below
    //     NOTE: "updateScore" method is in UserRepository class
    public void updateScore_BadScore_ThrowsIllegalArgumentException() {
        // ... Write your code here
    }

    // -------------- Advanced  --------------

    // 7 - Write a positive test below
    //     NOTE: "updateUser" method is in UserController class.. For this
    //           task you should inject a mocked "UserRepository" called "MockUserRepository".
    //           The benefit of this is that the "actual" users wont be affected
    //           .. #1 You'll need create an IUserRepository interface.
    //           .. #2 MockUserRepository and UserRepository will need to implement this interface
    //           .. The rest is up to you :)
    public void updateUser_ValidUser_ReturnsSuccessMessage() {

    }

}
