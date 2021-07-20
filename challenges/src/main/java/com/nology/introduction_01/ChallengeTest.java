package com.nology.introduction_01;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ChallengeTest {
    private Solution challenge;

    @BeforeEach
    void setUp() {
        challenge = new Solution();
    }

    @AfterEach
    void tearDown() {
    }

    // --------------  FOUNDATION --------------

    // 01 tests for findLargestNumber challenge
    @Test
    void findLargestNumber_ValidIntegers_ReturnsLargest() {
        int result = challenge.findLargestNumber(22, 25);
        assertEquals(25, result);
    }

    @Test
    void findLargestNumber_EqualIntegers_ReturnsEqual() {
        int result = challenge.findLargestNumber(22, 22);
        assertEquals(22, result);
    }

    @Test
    void findLargestNumber_NegativeIntegers_ReturnsLargest() {
        int result = challenge.findLargestNumber(-22, -100);
        assertEquals(-22, result);
    }

    // 02 tests for findLongestString challenge
    @Test
    void findLargestString_ValidStrings_ReturnsLongest() {
        String result = challenge.findLongestString("Sam", "Andy");
        assertEquals("Andy", result);
    }

    @Test
    void findLargestString_EqualStrings_ReturnsEqualMessage() {
        String result = challenge.findLongestString("Cattywampus", "Cattywampus");
        assertEquals("These two are the same length!", result);
    }

    // 03 tests for getDiscount challenge
    @Test
    void getDiscount_ValidInputs_ReturnCorrectDiscount() {
        double result = challenge.getDiscount(100, 10);
        assertEquals(90, result);
    }

    @Test
    void getDiscount_ValidInputs_ReturnCorrectDiscountAsDouble() {
        double result = challenge.getDiscount(27, 5);
        assertEquals(25.65, result);
    }

    // -------------- INTERMEDIATE --------------

    // 04 tests for compareTwoNumbers
    @Test
    void compareTwoNumbers_ValidInputsNotEqual_ReturnFalse() {
        Boolean result = challenge.compareTwoNumbers(12.3333, 12.3343);
        assertEquals(false, result);
    }

    @Test
    void compareTwoNumbers_ValidInputsEqual_ReturnTrue()  {
        Boolean result = challenge.compareTwoNumbers(1.3333, 1.3333);
        assertEquals(true, result);
    }

    // 05 tests for getDayName

    @Test
    void getDayName_ValidInput0_ReturnSunday() {
        String result = challenge.getDayName(0);
        assertEquals("Sunday", result);
    }

    @Test
    void getDayName_ValidInput1_ReturnMonday() {
        String result = challenge.getDayName(1);
        assertEquals("Monday", result);
    }

    @Test
    void getDayName_ValidInput2_ReturnTuesday() {
        String result = challenge.getDayName(2);
        assertEquals("Tuesday", result);
    }

    @Test
    void getDayName_ValidInput3_ReturnWednesday() {
        String result = challenge.getDayName(3);
        assertEquals("Wednesday", result);
    }

    @Test
    void getDayName_ValidInput4_ReturnThursday() {
        String result = challenge.getDayName(4);
        assertEquals("Thursday", result);
    }

    @Test
    void getDayName_ValidInput5_ReturnFriday() {
        String result = challenge.getDayName(5);
        assertEquals("Friday", result);
    }

    @Test
    void getDayName_ValidInput6_ReturnSaturday() {
        String result = challenge.getDayName(6);
        assertEquals("Saturday", result);
    }

    @Test
    void getDayName_InvalidInput_ReturnsOutOfRange() {
        String result = challenge.getDayName(9);
        assertEquals("Not a valid day range! The number needs to be from 0-6", result);
    }

    // 06 tests for isEvenWord

    @Test
    void isEvenWord_ValidInputEven_ReturnsTrue() {
        boolean result = challenge.isEvenWord("dice");
        assertEquals(true, result);
    }

    @Test
    void isEvenWord_ValidInputOdd_ReturnsFalse() {
        boolean result = challenge.isEvenWord("mouse");
        assertEquals(false, result);
    }

    @Test
    void isEvenWord_InvalidInputEmpty_ReturnsFalse() {
        boolean result = challenge.isEvenWord("");
        assertEquals(false, result);
    }

    // 07 tests for leapYearChecker

    @Test
    void leapYearChecker_ValidInput_ReturnsTrueDivisibleBy4() {
        boolean result = challenge.leapYearChecker(2016);
        assertEquals(true, result);
    }

    @Test
    void leapYearChecker_InvalidInput_ReturnsFalseNotDivisibleBy4() {
        boolean result = challenge.leapYearChecker(2017);
        assertEquals(false, result);
    }

    @Test
    void leapYearChecker_ValidInput_ReturnsTrueDivisibleBy4And400() {
        boolean result = challenge.leapYearChecker(2000);
        assertEquals(true, result);
    }

    @Test
    void leapYearChecker_InvalidInput_ReturnsFalseDivisibleBy4And100() {
        boolean result = challenge.leapYearChecker(2100);
        assertEquals(false, result);
    }

}