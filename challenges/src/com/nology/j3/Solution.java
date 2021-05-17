package com.nology.j3;

public class Solution {

    // -------------- FOUNDATION --------------

    /***
     * Get the first and last items in an array
     * @param namesArr e.g. ["Ollie", "Sam", "Bex"]
     * @return a new array containing the first and last items in the given array e.g. ["Ollie", "Bex"]
     */
    public String[] getFirstAndLast(String[] namesArr) {
        if (namesArr.length == 0) return new String[0];
        return new String[] {namesArr[0], namesArr[namesArr.length-1]};
    }

    /***
     * Find the SUM/Total of an array of peoples ages
     * @param agesArr e.g. [18, 25, 21, 40]
     * @return an amount e.g. 104
     */
    public int totalAges(int[] agesArr) {
        int total = 0;
        for (int i = 0; i< agesArr.length; i++) {
            total += agesArr[i];
        }
        return total;
    }

    /***
     * Find all odd numbers from a given array of numbers
     * @param numbers e.g. [5, 3, 8, 10, 1]
     * @return a new array containing only odd numbers e.g. [5, 3, 1]
     */
    public int[] getOddNumbers(int[] numbers) {
        return new int[0];
    }

    // -------------- INTERMEDIATE --------------

    /***
     * Find all numbers between a min and a max value
     * @param min - The starting range value e.g. 3
     * @param max - The ending/finishing range value e.g. 6
     * @return a new array of all numbers between two numbers e.g. [3, 4, 5, 6]
     */
    public int[] getRange(int min, int max) {
        return new int[0];
    }

    /**
     * Swap the first and last names in a string
     * @param fullName e.g. "Andy Evans"
     * @return a string with the last name, followed by the first name e.g. "Evans Andy"
     */
    public String swapNames(String fullName) {
        return "";
    }

    /***
     * Determine whether a score is the highest score
     * @param scoresArr e.g. [3, 10, 2, 8]
     * @param newScore e.g. 11
     * @return true or false depending on whether the newScore is the highest value in the array
     */
    public boolean isHighestScore(int[] scoresArr, int newScore) {
        return false;
    }

    // -------------- ADVANCED --------------

    /***
     * Determine the largest range between the elements in an array
     * @param numbers - array of numbers e.g. [30, 5, 15, 1]
     * @return The largest range/difference/gap between two numbers in an array e.g. 15 (the difference between 15 and 30 is 15)
     */
    public int largestRange(int[] numbers) {
        return -1;
    }
}
