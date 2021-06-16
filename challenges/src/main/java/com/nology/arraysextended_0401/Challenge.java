package com.nology.arraysextended_0401;

/**
 *   All challenges in this repository are seperated into three levels: Foundation, Intermediate, and Advanced.
 *   The expectation is to complete all Foundation level challenges, with Intermediate and upwards pushing your knowledge
 *   and may require you to google things in order to solve them. If you find an answer online somewhere, be kind and
 *   share it with the group!
 */
public class Challenge {

    public Challenge() {}

    // -------------- FOUNDATION --------------

    /**
     * Calculate how many crosses are in the game
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @return count of crosses
     */
    public int calculateCrosses(int[][] game) {
        return -1;
    }

    /**
     * Calculate how many moves are in the game
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @return count of crosses
     */
    public int calculateMoves(int[][] game) {
        return -1;
    }

    /**
     * Calculate percentage of used squares
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @return count of crosses
     */
    public float calculateMovesPercentage(int[][] game) {
        return -1;
    }

    // -------------- INTERMEDIATE --------------


    /**
     * Checks if the given player has won "horizontally" - Don't check for vertical or diagonal wins just yet
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @param player - 0 (Naught) or 1 (cross)
     * @return If the player has won or not
     */
    public boolean hasPlayerWonHorizontal(int[][] game, int player) {
        return false;
    }

    /**
     * Checks if the given player has won "vertically" - Don't check for vertical or diagonal wins just yet
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @param player - 0 (Naught) or 1 (cross)
     * @return If the player has won or not
     */
    public boolean hasPlayerWonVertical(int[][] game, int player) {
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
