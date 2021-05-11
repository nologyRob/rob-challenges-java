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
    void printMegaBytesAndKiloBytes() {
        String result = challenge.printMegaBytesAndKiloBytes(2220);
        assertEquals("2220 KB = 2 MB and 172 KB", result);
    }

    @Test
    void printMegaBytesAndKiloBytesIfParamIsLessThanZero() {
        String result = challenge.printMegaBytesAndKiloBytes(-2220);
        assertEquals("Invalid Value", result);
    }


    // tests for the second challenge
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

}