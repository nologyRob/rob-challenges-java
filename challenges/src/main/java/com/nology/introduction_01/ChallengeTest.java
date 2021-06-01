package com.nology.introduction_01;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ChallengeTest {
    private Challenge challenge;

    @BeforeEach
    void setUp() {
        challenge = new Challenge();
    }

    @AfterEach
    void tearDown() {
    }

    // tests for first challenge
    @Test
    void findLargestNumberFromTwoIntegers() {
        int result = challenge.findLargestNumber(22, 25);
        assertEquals(25, result);
    }

    @Test
    void findLargestNumberFromTwoEqualNumbers() {
        int result = challenge.findLargestNumber(22, 22);
        assertEquals(22, result);
    }

    @Test
    void findLargestNumberFromTwoNegativeNumbers() {
        int result = challenge.findLargestNumber(-22, -100);
        assertEquals(-22, result);
    }


    // tests for second challenge
    @Test
    void findLargestStringfromTwoDifferentLengthWords() {
        String result = challenge.findLongestString("Sam", "Andy");
        assertEquals("Andy", result);
    }

    @Test
    void findLargestStringfromTwoWordsWithTheSameLength() {
        String result = challenge.findLongestString("Cattywampus", "Cattywampus");
        assertEquals("These two are the same length!", result);
    }

    @Test
    void getDiscount_WithValidInputs_CorrectDiscount() {

        double result = challenge.getDiscount(100, 10);
        assertEquals(90, result);
        double resul2 = challenge.getDiscount(27, 5);
        assertEquals(25.65, resul2);
    }


    // tests for third challenge
    @Test
    void checkThatTwoPositiveNumbersAreNotEqualToFourDecimalPlaces() {
        Boolean result = challenge.compareTwoNumbers(12.333, 12.334);
        assertEquals(false, result);
    }

    @Test
    void checkThatTwoPositiveNumbersAreEqualToFourDecimalPlaces()  {
        Boolean result = challenge.compareTwoNumbers(1.333, 1.333);
        assertEquals(true, result);
    }

    // tests for fourth challenge

    @Test
    void findTheDayOfTheWeekGivenValidInput() {
        String result = challenge.getDayName(2);
        assertEquals("Tuesday", result);
    }

    @Test
    void findTheDayOfTheWeekGivenValidInput2() {
        String result = challenge.getDayName(6);
        assertEquals("Saturday", result);
    }

    @Test
    void findTheDayOfTheWeekGivenInvalidInput() {
        String result = challenge.getDayName(9);
        assertEquals("Not a valid day range! The number needs to be from 1-7", result);
    }
}