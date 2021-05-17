package com.nology.j2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    // tests for the first challenge
    @Test
    void correctlyAddsFirstAndSecondNameTogether() {
        String result = challenge.makeFullName("Sam", "Joyce");
        assertEquals("Sam Joyce", result);
    }


    // tests for the second challenge
    @Test
    void findMiddleCharacter() {
        String result = challenge.findMiddleCharacter("Sam");
        assertEquals("a", result);
    }

    @Test
    void findMiddleCharacterWhenTwoWordsPassedI() {
        String result = challenge.findMiddleCharacter("Sam Joyce");
        assertEquals("only one word pls.", result);
    }



    // tests for the third challenge
    @Test
    void shouldNotWakeUp() {
        boolean result = challenge.shouldWakeUp(true, 22);
        assertFalse(result);
    }


    @Test
    void shouldWakeUp() {
        boolean result = challenge.shouldWakeUp(true, 7);
        assertTrue(result);
    }


    // tests for the fourth challenge
    @Test
    void printMegaBytesAndKiloBytes() {
        String result = challenge.printMegaBytesAndKiloBytes(2220);
        assertEquals("2220 KB = 2 MB and 172 KB", result);
    }

    @Test
    void printMegaBytesAndKiloBytesIfParamIsLessThanZero() {
        String result = challenge.printMegaBytesAndKiloBytes(-2220);
        assertEquals("Invalid Value", result);
    }


    // tests for the fifth challenge
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