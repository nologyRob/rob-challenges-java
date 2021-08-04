package com.nology.unittesting_06;

import com.nology.unittesting_06.Challenge;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    private Challenge challenge;

    @BeforeEach
    void setUp() {
        this.challenge = new Challenge();
    }

    @AfterEach
    void tearDown() {
    }

    // -------------- Foundation  --------------

    @Test
    public void getWordCount_ValidSentence_ReturnsCorrectCount() {
        int result = this.challenge.getWordCount("Hello world from nology");
        assertEquals(4, result);
        result = this.challenge.getWordCount("Welcome");
        assertEquals(1, result);
    }

    @Test
    public void isPalindrome_ValidPalindrome_ReturnsTrue() {
        boolean result = this.challenge.isPalindrome("Anna");
        assertEquals(true, result);
        result = this.challenge.isPalindrome("amber");
        assertFalse(result);
    }

    // -------------- Intermediate  --------------

    @Test
    public void getFullName_ValidName_ReturnsCorrectFullName() {
        String result = this.challenge.getFullName("John", "Doe");
        assertEquals("John Doe", result);
    }

    @Test
    public void getFullName_NullLastName_ReturnsCorrectFullName() {
        String result = this.challenge.getFullName("John", null);
        // Note: You'll have to fix the code to make this work
        assertEquals("John", result);
    }

    @Test
    public void setScore_ValidUser_UpdatesUserScore() {
        // Arrange
        User updatedUser = new User("johndoe");

        // Act
        updatedUser.setScore(10);

        // Assert
        assertEquals(10, updatedUser.getScore());
    }

    @Test
    public void setScore_BadScore_ThrowsIllegalArgumentException() {
        // Arrange
        UserRepository repo = new UserRepository();
        User updatedUser = new User("johndoe");

        // Act
        updatedUser.setScore(-1);

        // Assert
        assertThrows(IllegalArgumentException.class, () -> repo.updateScore(updatedUser));
    }
}
