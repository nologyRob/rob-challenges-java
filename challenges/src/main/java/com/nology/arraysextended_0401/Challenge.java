package com.nology.arraysextended_0401;

/**
 *   All challenges in this repository are separated into three levels: Foundation, Intermediate, and Advanced.
 *   The expectation is to complete all Foundation level challenges, with Intermediate and upwards pushing your knowledge
 *   and may require you to google things in order to solve them. If you find an answer online somewhere, be kind and
 *   share it with the group!
 */
public class Challenge {

    /**
     *  All of the challenges in the this folder are focused on working with a multidimensional array / nested array.
     *  This is to mimic the grid of a noughts and crosses game. That is why we are using this data structure.
     *
     * KEY
     * - -1 = (No Move)
     * - 0 = (Naught)
     * - 1 = (Cross)
     *
     * EXAMPLE
     *  int[][] game = {{1, 1, 0},
     *                  {1, 0, 1},
     *                  {-1, 0, -1}}
     *
     * HINT: You may have to use a nested for loop to loop through the nested array.
     * https://www.programiz.com/java-programming/nested-loop
     */
    public Challenge() {}

    // -------------- FOUNDATION --------------

    /**
     * Calculate how many crosses are in the given game
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @return count of all the Crosses (1's) in the given game
     */
    public int calculateCrosses(int[][] game) {
        return -1;
    }

    /**
     * Calculate how many moves (noughts and crosses) are in the given game.
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @return count of the noughts (0's) and crosses (1's) in the given game
     */
    public int calculateMoves(int[][] game) {
        return -1;
    }

    /**
     * Calculate percentage of used squares in the given game.
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @return float the percentage of used squares
     */
    public float calculateMovesPercentage(int[][] game) {
        return -1;
    }

    // -------------- INTERMEDIATE --------------


    /**
     * Checks if the given player has won "horizontally" in the given game.
     *
     * Don't check for vertical or diagonal wins just yet
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @param player - 0 (Naught) or 1 (cross)
     * @return If the given player has won or not
     */
    public boolean hasPlayerWonHorizontal(int[][] game, int player) {
        return false;
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
        return false;
    }

    /**
     * Checks if the given player has won "diagonally" in the given game.
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @param player - 0 (Naught) or 1 (cross)
     * @return If the player has won or not
     */
    public boolean hasPlayerWonDiagonally(int[][] game, int player) {
        return false;
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
