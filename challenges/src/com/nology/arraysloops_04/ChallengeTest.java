package com.nology.arraysloops_04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChallengeTest {
    private Challenge challenge;

    @BeforeEach
    void setUp() {
        challenge = new Challenge();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getFirstAndLast_ValidNames_ReturnsOnlyFirstAndLastNames() {
        String[] result = challenge.getFirstAndLast(new String[]{"Ollie", "Sam", "Bex"});
        assertEquals(new String[]{"Ollie", "Bex"}, result);

        String[] result2 = challenge.getFirstAndLast(new String[]{"one", "two", "three", "four", "five", "six", "seven"});
        assertEquals(new String[]{"one", "seven"}, result2);
    }

    @Test
    void totalAges_ValidAges_ReturnsAmountOfAges() {
        int result = challenge.totalAges(new int[] {18, 25, 21, 40});
        assertEquals(104, result);

        int result2 = challenge.totalAges(new int[] {5, 2});
        assertEquals(7, result2);
    }

    @Test
    void getOddNumbers_ValidNumbers_ReturnsOnlyOddNumbers() {
        int result = challenge.getAmountOfOddNumbers(new int[] {5, 3, 8, 10, 1});
        assertEquals(3, result);
        int result2 = challenge.getAmountOfOddNumbers(new int[] {1, 1, 3, 57, 59, 2, 2});
        assertEquals(5, result2);
    }

    @Test
    void getRange_ValidInput_ReturnsValidRange() {
        int[] result = challenge.getRange(3, 6);
        int[] expectedResult = {3, 4, 5, 6};
        assertArrayEquals(expectedResult, result);

        int[] result2 = challenge.getRange(0, 4);
        int[] expectedResult2 = {0, 1, 2, 3, 4};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void getRange_InvalidInput_ReturnsEmptyArray() {
        int[] result = challenge.getRange(10, 1);
        int[] expectedResult = {};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void swapNames_ValidName_ReturnsSwappedNames() {
        String result = challenge.swapNames("Andy Evans");
        assertEquals("Evans Andy", result);
        String result2 = challenge.swapNames("Jane Doe Smith");
        assertEquals("Smith Doe Jane", result2);
    }

    @Test
    void swapNames_SingleName_ReturnsSingleName() {
        String result = challenge.swapNames("Andy");
        assertEquals("Andy", "Andy");
    }

    @Test
    void isHighestScore_ValidHighScore_ReturnsCorrectValue() {
        boolean result = challenge.isHighestScore(new int[] {3, 10, 2, 8}, 12);
        assertEquals(true, result);
        boolean result2 = challenge.isHighestScore(new int[] {3, 10, 2, 8}, 2);
        assertEquals(false, result2);
    }

    @Test
    void sort_UnsortedNumbers_ReturnSortedArray() {
        int[] result = challenge.sort(new int[] {5, 1, 4, 2, 8});
        assertArrayEquals(new int[] {1, 2, 4, 5, 8}, result);

        int[] result2 = challenge.sort(new int[] {10, 9, 8});
        assertArrayEquals(new int[] {8, 9, 10}, result2);
    }
}
