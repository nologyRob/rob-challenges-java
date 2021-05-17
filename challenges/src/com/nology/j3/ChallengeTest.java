package com.nology.j3;

import com.nology.j3.Challenge;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChallengeTest {
    private com.nology.j3.Challenge challenge;

    @BeforeEach
    void setUp() {
        challenge = new Challenge();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getFirstAndLast_ValidNames_OnlyFirstAndLastNames() {
        String[] result = challenge.getFirstAndLast(new String[]{"Ollie", "Sam", "Bex"});
        assertEquals(new String[]{"Ollie", "Bex"}, result);

        String[] result2 = challenge.getFirstAndLast(new String[]{"one", "two", "three", "four", "five", "six", "seven"});
        assertEquals(new String[]{"one", "seven"}, result2);
    }

    @Test
    void totalAges_ValidAges_AmountOfAges() {
        int result = challenge.totalAges(new int[] {18, 25, 21, 40});
        assertEquals(104, result);

        int result2 = challenge.totalAges(new int[] {5, 2});
        assertEquals(7, result2);
    }

    @Test
    void getOddNumbers_ValidNumbers_OnlyOddNumbers() {
        int[] result = challenge.getOddNumbers(new int[] {5, 3, 8, 10, 1});
        assertEquals(result, new int[] {1, 3, 5});
    }
}
