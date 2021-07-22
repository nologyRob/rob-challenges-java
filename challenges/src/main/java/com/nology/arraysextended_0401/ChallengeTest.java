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

    

    @Test
    void hasPlayerWonHorizontal_ValidWin_ReturnsTrue() {
        int[][] game = {{0, 1, 0},
                {0, 0, 0},
                {1, 1, 1}};

        boolean result = challenge.hasPlayerWonHorizontal(game, 0);
        assertTrue(result);
    }

    @Test
    void hasPlayerWonHorizontal_InvalidWin_ReturnsFalse() {
        int[][] game = {{0, 0, 1},
                {0, 1, 0},
                {0, 1, 0}};

        boolean result = challenge.hasPlayerWonHorizontal(game, 0);
        assertFalse(result);
    }

    @Test
    void hasPlayerWonVertical_ValidWin_ReturnsTrue() {
        int[][] game = {{0, 1, 0},
                {1, 1, 0},
                {0, 1, 0}};

        boolean result = challenge.hasPlayerWonVertical(game, 1);
        assertTrue(result);
    }

    @Test
    void hasPlayerWonVertical_InvalidWin_ReturnsFalse() {
        int[][] game = {{0, 0, 1},
                {0, 1, 0},
                {1, 1, 0}};

        boolean result = challenge.hasPlayerWonVertical(game, 1);
        assertFalse(result);
    }
}
