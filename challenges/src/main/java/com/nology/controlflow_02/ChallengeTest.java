package com.nology.controlflow_02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    // -------------- FOUNDATION --------------

    // 01 tests for getFullName challenge

    @Test
    void getFullName_ValidInput_ReturnsFullNameWithSpace() {
        String result = challenge.getFullName("Sam", "Joyce");
        assertEquals("Sam Joyce", result);
    }

    // 02 tests for isWithinRange challenge

    @Test
    void isWithinRange_ValidInput_ReturnsTrueWithinRange() {
        boolean result = challenge.isWithinRange(20, 50);
        assertTrue(result);
    }

    @Test
    void isWithinRange_ValidInput_ReturnsTrueRangeLimit() {
        boolean result = challenge.isWithinRange(10, 10);
        assertTrue(result);
    }

    @Test
    void isWithinRange_ValidInput_ReturnsTrueRangeStart() {
        boolean result = challenge.isWithinRange(0, 10);
        assertTrue(result);
    }

    @Test
    void isWithinRange_InvalidInput_ReturnsFalseOutOfRange() {
        boolean result = challenge.isWithinRange(600, 20);
        assertFalse(result);
    }

    @Test
    void isWithinRange_InvalidInput_ReturnsFalseBelow0() {
        boolean result = challenge.isWithinRange(-50, 20);
        assertFalse(result);
    }

    // 03 tests for stringCalculator challenge

    @Test
    void stringCalculator_ValidInputs_ReturnsAddition() {
        int result = challenge.stringCalculator(10, 20, "+");
        assertEquals(30, result);
    }

    @Test
    void stringCalculator_ValidInputs_ReturnsMinus() {
        int result = challenge.stringCalculator(500, 20, "-");
        assertEquals(480, result);
    }

    @Test
    void stringCalculator_ValidInputs_ReturnsDivision() {
        int result = challenge.stringCalculator(500, 2, "/");
        assertEquals(250, result);
    }

    @Test
    void stringCalculator_ValidInputs_ReturnsMultiplication() {
        int result = challenge.stringCalculator(5, 20, "*");
        assertEquals(100, result);
    }

    @Test
    void stringCalculator_InvalidInputs_ReturnsMinusOne() {
        int invalidFirstNumber = challenge.stringCalculator(-500, 2, "/");
        assertEquals(-1, invalidFirstNumber);
        int invalidSecondNumber = challenge.stringCalculator(500, -2, "/");
        assertEquals(-1, invalidSecondNumber);
        int invalidOperator = challenge.stringCalculator(500, -2, "");
        assertEquals(-1, invalidOperator);
    }

    // -------------- INTERMEDIATE --------------

    // 04 tests for shouldWakeUp challenge

    @Test
    void shouldWakeUp_ValidInput_ReturnsTrueAfterTenBarking() {
        boolean result = challenge.shouldWakeUp(true, 23);
        assertTrue(result);
    }

    @Test
    void shouldWakeUp_InvalidInput_ReturnsFalseAfterTenNotBarking() {
        boolean result = challenge.shouldWakeUp(false, 23);
        assertFalse(result);
    }

    @Test
    void shouldWakeUp_ValidInput_ReturnsTrueBeforeEightBarking() {
        boolean result = challenge.shouldWakeUp(true, 5);
        assertTrue(result);
    }

    @Test
    void shouldWakeUp_InvalidInput_ReturnsFalseBeforeEightNotBarking() {
        boolean result = challenge.shouldWakeUp(false, 5);
        assertFalse(result);
    }

    @Test
    void shouldWakeUp_ValidInput_ReturnsFalseNotAfterTen() {
        boolean result = challenge.shouldWakeUp(true, 22);
        assertFalse(result);
    }

    @Test
    void shouldWakeUp_ValidInput_ReturnsFalseNotBeforeEight() {
        boolean result = challenge.shouldWakeUp(true, 8);
        assertFalse(result);
    }

    @Test
    void shouldWakeUp_InvalidInput_ReturnsFalseOutOfRange() {
        boolean result = challenge.shouldWakeUp(true, 50);
        assertFalse(result);
    }

    @Test
    void shouldWakeUp_InvalidInput_ReturnsFalseBelowRange() {
        boolean result = challenge.shouldWakeUp(true, -50);
        assertFalse(result);
    }

    // 05 tests for getMiddleCharacter challenge

    @Test
    void getMiddleCharacter_ValidInputOdd_ReturnSingleCharacter() {
        String result = challenge.getMiddleCharacter("Sam");
        assertEquals("a", result);
    }

    @Test
    void getMiddleCharacter_ValidInputEven_ReturnsMultipleCharacters() {
        String result = challenge.getMiddleCharacter("Andy");
        assertEquals("nd", result);
    }

    @Test
    void getMiddleCharacter_InvalidInputMultipleWords_ReturnsInvalidMessage() {
        String result = challenge.getMiddleCharacter("Sam Joyce");
        assertEquals("Invalid Input", result);
    }

    @Test
    void getMiddleCharacter_InvalidInputNoWord_ReturnsInvalidMessage() {
        String result = challenge.getMiddleCharacter("");
        assertEquals("Invalid Input", result);
    }

    // 06 tests for printMegaBytesAndKiloBytes challenge

    @Test
    void printMegaBytesAndKiloBytes_ValidInputs_Returns2MBand172KB() {
        String result = challenge.printMegaBytesAndKiloBytes(2220);
        assertEquals("2220 KB = 2 MB and 172 KB", result);
    }

    @Test
    void printMegaBytesAndKiloBytes_ValidInputs_Returns1MBand0KB() {
        String result = challenge.printMegaBytesAndKiloBytes(1024);
        assertEquals("1024 KB = 1 MB and 0 KB", result);
    }

    @Test
    void printMegaBytesAndKiloBytes_ValidInputs_Returns0MBand500KB() {
        String result = challenge.printMegaBytesAndKiloBytes(500);
        assertEquals("500 KB = 0 MB and 500 KB", result);
    }

    @Test
    void printMegaBytesAndKiloBytes_InvalidInputs_ReturnsInvalidMessage() {
        String result = challenge.printMegaBytesAndKiloBytes(-2220);
        assertEquals("Invalid Value", result);
    }

    @Test
    void calculateInvestmentGrowthOver10Years() {
        String result = challenge.calculateReturn(1000, 10, 0.1);
        assertEquals("You now have " + 2853, result);
    }

    @Test
    void calculateInvestmentGrowthWithInvalidInvestment() {
        String result = challenge.calculateReturn(-1000, 10, 0.1);
        assertEquals("initialInvestment & years must be above 0.", result);
    }

    @Test
    void calculateInvestmentGrowthWithInvalidYears() {
        String result = challenge.calculateReturn(1000, -10, 0.1);
        assertEquals("initialInvestment & years must be above 0.", result);
    }
}