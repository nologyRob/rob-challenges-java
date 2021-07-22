package com.nology.arraysextended_0401;

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

    // -------------- FOUNDATION --------------

    // Testing calculateCrosses

    @Test
    void calculateCrosses_ValidGame_CalculatesCorrectCrosses() {
        int[][] game = {{0, 1, -1},
                {0, 1, -1},
                {0, -1, -1}};

        int result = challenge.calculateCrosses(game);
        assertEquals(2, result);
    }

    @Test
    void calculateCrosses_EmptyGame_CalculatesCorrectCrosses() {
        int[][] game = {{-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}};

        int result = challenge.calculateCrosses(game);
        assertEquals(0, result);
    }

    // Testing calculateMoves

    @Test
    void calculateMoves_ValidGame_CalculatesCorrectMoveCount() {
        int[][] game = {{0, 1, -1},
                {0, 1, -1},
                {0, -1, -1}};

        int result = challenge.calculateMoves(game);
        assertEquals(5, result);
    }

    @Test
    void calculateMoves_EmptyGame_CalculatesCorrectMoveCount() {
        int[][] game2 = {{-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}};
        int result2 = challenge.calculateMoves(game2);
        assertEquals(0, result2);
    }

    // Testing calculateMovesPercentage

    @Test
    void calculateMovesPercentage_ValidGame_Returns33Percent() {
        int[][] game = {{0, -1, -1},
                {0, -1, -1},
                {1, -1, -1}};

        float result = challenge.calculateMovesPercentage(game);
        assertEquals(33, Math.round(result));
    }

    @Test
    void calculateMovesPercentage_EmptyGame_Returns0Percent() {
        int[][] game = {{-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}};

        float result = challenge.calculateMovesPercentage(game);
        assertEquals(0, Math.round(result));
    }

    @Test
    void calculateMovesPercentage_FullGame_Returns100Percent() {
        int[][] game = {{1, 0, 1},
                {1, 1, 0},
                {0, 1, 0}};

        float result = challenge.calculateMovesPercentage(game);
        assertEquals(100, Math.round(result));
    }

    // -------------- INTERMEDIATE --------------

    // Testing hasPlayerWonHorizontal

    @Test
    void hasPlayerWonHorizontal_ValidWinNought_ReturnsTrue() {
        int[][] game = {{0, 1, 0},
                {0, 0, 0},
                {1, 1, 1}};

        boolean result = challenge.hasPlayerWonHorizontal(game, 0);
        assertTrue(result);
    }

    @Test
    void hasPlayerWonHorizontal_ValidWinCross_ReturnsTrue() {
        int[][] game = {{0, 1, 0},
                {0, 1, 0},
                {1, 1, 1}};

        boolean result = challenge.hasPlayerWonHorizontal(game, 1);
        assertTrue(result);
    }

    @Test
    void hasPlayerWonHorizontal_InvalidWinNoughts_ReturnsFalse() {
        int[][] game = {{0, 0, 1},
                {0, 1, 0},
                {0, 1, 0}};

        boolean result = challenge.hasPlayerWonHorizontal(game, 0);
        assertFalse(result);
    }

    @Test
    void hasPlayerWonHorizontal_InvalidWinCrosses_ReturnsFalse() {
        int[][] game = {{0, 0, 1},
                {0, 1, 0},
                {0, 1, 0}};

        boolean result = challenge.hasPlayerWonHorizontal(game, 1);
        assertFalse(result);
    }

    // Testing hasPlayerWonVertical

    @Test
    void hasPlayerWonVertical_ValidWinNoughts_ReturnsTrue() {
        int[][] game = {{0, 1, 0},
                {0, 0, 1},
                {0, 1, 0}};

        boolean result = challenge.hasPlayerWonVertical(game, 0);
        assertTrue(result);
    }

    @Test
    void hasPlayerWonVertical_ValidWinCrosses_ReturnsTrue() {
        int[][] game = {{0, 1, 0},
                {1, 1, 0},
                {0, 1, 0}};

        boolean result = challenge.hasPlayerWonVertical(game, 1);
        assertTrue(result);
    }

    @Test
    void hasPlayerWonVertical_InvalidWinCrosses_ReturnsFalse() {
        int[][] game = {{0, 0, 1},
                {0, 1, 0},
                {1, 1, 0}};

        boolean result = challenge.hasPlayerWonVertical(game, 1);
        assertFalse(result);
    }

    @Test
    void hasPlayerWonVertical_InvalidWinNoughts_ReturnsFalse() {
        int[][] game = {{0, 0, 1},
                {0, 1, 0},
                {1, 1, 0}};

        boolean result = challenge.hasPlayerWonVertical(game, 0);
        assertFalse(result);
    }

    // Testing hasPlayerWonDiagonally

    @Test
    void hasPlayerWonDiagonally_ValidWinNoughts_ReturnsTrue() {
        int[][] leftDiagonalWin = {{0, 1, 0},
                {0, 0, 1},
                {1, 1, 0}};

        boolean resultOne = challenge.hasPlayerWonDiagonally(leftDiagonalWin, 0);
        assertTrue(resultOne);

        int[][] rightDiagonalWin = {{0, 1, 0},
                {0, 0, 1},
                {0, 1, 1}};

        boolean resultTwo = challenge.hasPlayerWonDiagonally(rightDiagonalWin, 0);
        assertTrue(resultTwo);
    }

    @Test
    void hasPlayerWonDiagonally_ValidWinCrosses_ReturnsTrue() {
        int[][] leftDiagonalWin = {{1, 1, 0},
                {0, 1, 1},
                {0, 0, 1}};

        boolean resultOne = challenge.hasPlayerWonDiagonally(leftDiagonalWin, 1);
        assertTrue(resultOne);

        int[][] rightDiagonalWin = {{1, 1, 0},
                {0, 1, 0},
                {0, 1, 1}};

        boolean resultTwo = challenge.hasPlayerWonDiagonally(rightDiagonalWin, 1);
        assertTrue(resultTwo);
    }

    @Test
    void hasPlayerWonDiagonally_InvalidWinCrosses_ReturnsFalse() {
        int[][] game = {{1, 1, 0},
                {0, 0, 1},
                {1, 0, 1}};

        boolean result = challenge.hasPlayerWonDiagonally(game, 1);
        assertFalse(result);
    }

    @Test
    void hasPlayerWonDiagonally_InvalidWinNoughts_ReturnsFalse() {
        int[][] game = {{0, 1, 0},
                {1, 0, 1},
                {1, 0, 1}};

        boolean result = challenge.hasPlayerWonDiagonally(game, 0);
        assertFalse(result);
    }

}
