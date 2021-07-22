package com.nology.arraysextended_0401;

public class Solution {
    // -------------- FOUNDATION --------------

    /**
     * Calculate how many crosses are in the given game
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @return count of all the Crosses (1's) in the given game
     */
    public int calculateCrosses(int[][] game) {
        int count = 0;

        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                if (game[i][j] == 1) count++;
            }
        }
        return count;
    }

    /**
     * Calculate how many noughts and crosses are in the given game
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @return count of the noughts (0's) and crosses (1's) in the given game
     */
    public int calculateMoves(int[][] game) {
        int count = 0;

        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                if (game[i][j] != -1) count++;
            }
        }
        return count;
    }

    /**
     * Calculate percentage of used squares in the given game.
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @return float the percentage of used squares
     */
    public float calculateMovesPercentage(int[][] game) {
        float amountOfMoves = calculateMoves(game);
        float amountOfSquares = 0;

        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                amountOfSquares++;
            }
        }
        return amountOfMoves / amountOfSquares++ * 100;
    }

    // -------------- INTERMEDIATE --------------


    /**
     * Checks if the given player has won "horizontally" in the given game
     *
     * Don't check for vertical or diagonal wins just yet
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @param player - 0 (Naught) or 1 (cross)
     * @return If the given player has won or not
     */
    public boolean hasPlayerWonHorizontal(int[][] game, int player) {
        boolean hasRowGotWinner = true;

        for (int i = 0; i < game.length; i++) {
            hasRowGotWinner = true;
            int[] row = game[i];

            for (int j = 0; j < row.length; j++) {
                if (row[j] != player) hasRowGotWinner = false;
            }
            if (hasRowGotWinner) break;
        }
        return hasRowGotWinner;
    }

    /**
     * Checks if the given player has won "vertically" in the given game.
     *
     * Don't check for diagonal wins just yet
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @param player - 0 (Naught) or 1 (cross)
     * @return If the player has won or not
     */
    public boolean hasPlayerWonVertical(int[][] game, int player) {
        boolean hasColumnGotWinner = true;

        for (int i = 0; i < game.length; i++) {
            hasColumnGotWinner = true;

            for (int j = 0; j < 3; j++) {
                if (game[j][i] != player) {
                    hasColumnGotWinner = false;
                }
            }

            if (hasColumnGotWinner) break;
        }
        return hasColumnGotWinner;
    }

    /**
     * Checks if the given player has won "diagonally" in the given game.
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @param player - 0 (Naught) or 1 (cross)
     * @return If the player has won or not
     */
    public boolean hasPlayerWonDiagonally(int[][] game, int player) {
        int[][] leftDiagonalCoOrds = {{0,0}, {1,1}, {2, 2}};
        int[][] rightDiagonalCoOrds = {{0,2}, {1,1}, {2, 0}};
        boolean hasDiagonalGotWinner = true;

        for (int[] coOrds : leftDiagonalCoOrds) {
            int x = coOrds[0];
            int y = coOrds[1];

            if (game[x][y] != player) {
                hasDiagonalGotWinner = false;
                break;
            }
        }

        if(hasDiagonalGotWinner) {
            return true;
        }

        hasDiagonalGotWinner = true;

        for (int[] coOrds : rightDiagonalCoOrds) {
            int x = coOrds[0];
            int y = coOrds[1];

            if (game[x][y] != player) {
                hasDiagonalGotWinner = false;
                break;
            }
        }

        return hasDiagonalGotWinner;
    }

    // -------------- ADVANCED --------------

    /**
     * Checks if any player has won the game, and return the player which won
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @return The player who won, or -1 if no player won
     */
    public int getWinningPlayer(int[][] game) {
        // ..... Who can solve this? ;)
        return -1;
    }

}
