package com.nology;

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
}