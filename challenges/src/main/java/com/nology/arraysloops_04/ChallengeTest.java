package com.nology.arraysloops_04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChallengeTest {
    private Solution challenge;

    @BeforeEach
    void setUp() {
        challenge = new Solution();
    }

    @AfterEach
    void tearDown() {
    }

    // Testing getFirstAndLast

    @Test
    void getFirstAndLast_ValidNames_ReturnsOnlyFirstAndLastNames() {
        String[] result = challenge.getFirstAndLast(new String[]{"Ollie", "Sam", "Bex"});
        assertArrayEquals(new String[]{"Ollie", "Bex"}, result);

        String[] result2 = challenge.getFirstAndLast(new String[]{"one", "two", "three", "four", "five", "six", "seven"});
        assertArrayEquals(new String[]{"one", "seven"}, result2);
    }

    @Test
    void getFirstAndLast_InvalidNames_ReturnsEmptyArray() {
        String[] result = challenge.getFirstAndLast(new String[0]);
        assertArrayEquals(new String[0], result);
    }

    // Testing totalAges

    @Test
    void totalAges_ValidAges_ReturnsAmountOfAges() {
        int result = challenge.totalAges(new int[]{18, 25, 21, 40});
        assertEquals(104, result);

        int result2 = challenge.totalAges(new int[]{5, 2});
        assertEquals(7, result2);
    }

    @Test
    void totalAges_InvalidAges_ReturnsZero() {
        int result = challenge.totalAges(new int[0]);
        assertEquals(0, result);
    }

    // Testing getAmountOfOddNumbers

    @Test
    void getAmountOfOddNumbers_ValidNumbers_ReturnsOnlyOddNumbers() {
        int result = challenge.getAmountOfOddNumbers(new int[]{5, 3, 8, 10, 1});
        assertEquals(3, result);

        int result2 = challenge.getAmountOfOddNumbers(new int[]{1, 1, 3, 57, 59, 2, 2});
        assertEquals(5, result2);

        int result3 = challenge.getAmountOfOddNumbers(new int[]{2, 4, 6, 8, 10, 12});
        assertEquals(0, result3);
    }

    @Test
    void getAmountOfOddNumbers_InvalidNumbers_ReturnsZero() {
        int result = challenge.getAmountOfOddNumbers(new int[0]);
        assertEquals(0, result);
    }

    // -------------- INTERMEDIATE --------------

    // Testing getRange

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

    // Testing swapNames

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

    // Testing isHighestScore

    @Test
    void isHighestScore_ValidHighScore_ReturnsCorrectValue() {
        boolean result = challenge.isHighestScore(new int[]{3, 10, 2, 8}, 12);
        assertTrue(result);
        boolean result2 = challenge.isHighestScore(new int[]{3, 10, 2, 8}, 2);
        assertFalse(result2);
    }

    @Test
    void isHighestScore_EmptyScores_ReturnsTrue() {
        boolean result = challenge.isHighestScore(new int[0], 12);
        assertTrue(result);
    }

    // -------------- ADVANCED --------------

    // Testing sort

    @Test
    void sort_UnsortedNumbers_ReturnSortedArray() {
        int[] result = challenge.sort(new int[]{5, 1, 4, 2, 8});
        assertArrayEquals(new int[]{1, 2, 4, 5, 8}, result);

        int[] result2 = challenge.sort(new int[]{10, 9, 8});
        assertArrayEquals(new int[]{8, 9, 10}, result2);
    }

    @Test
    void sort_SortedNumbers_ReturnSortedArray() {
        int[] result = challenge.sort(new int[]{1, 2, 4, 5, 8});
        assertArrayEquals(new int[]{1, 2, 4, 5, 8}, result);

        int[] result2 = challenge.sort(new int[]{8, 9, 10});
        assertArrayEquals(new int[]{8, 9, 10}, result2);
    }

    @Test
    void sort_InvalidInput_ReturnSortedArray() {
        int[] result = challenge.sort(new int[0]);
        assertArrayEquals(new int[0], result);
    }
}
