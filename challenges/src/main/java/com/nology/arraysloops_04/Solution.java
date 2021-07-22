package com.nology.arraysloops_04;

import java.util.ArrayList;
import java.util.List;

/**
 *   All challenges in this repository are separated into three levels: Foundation, Intermediate, and Advanced.
 *   The expectation is to complete all Foundation level challenges, with Intermediate and upwards pushing your knowledge
 *   and may require you to google things in order to solve them. If you find an answer online somewhere, be kind and
 *   share it with the group!
 */
public class Solution {

    // -------------- FOUNDATION --------------

    /***
     * Get the first and last items in an array
     *
     * @param namesArr e.g. ["Ollie", "Sam", "Bex"]
     * @return a new array containing the first and last items in the given array e.g. ["Ollie", "Bex"]
     */
    public String[] getFirstAndLast(String[] namesArr) {
        if (namesArr.length == 0) return new String[0];
        return new String[] {namesArr[0], namesArr[namesArr.length-1]};
    }

    /***
     * Find the SUM/Total of an array of peoples ages
     *
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
     * Find the amount of odd numbers from a given array of numbers
     *
     * @param numbersArr e.g. [5, 3, 8, 10, 1]
     * @return Amount of odd numbers e.g. 3
     */
    public int getAmountOfOddNumbers(int[] numbersArr) {
        int total = 0;
        for (int i = 0; i< numbersArr.length; i++) {
            if(numbersArr[i] % 2 != 0){
                total++;
            }
        }
        return total;
    }

    // -------------- INTERMEDIATE --------------

    /***
     * Find all numbers between a min and a max value and return them in an array.
     * The min at the start and the max at the end of the returned array.
     *
     * If the min is greater than the max return a empty integer array.
     *
     * @param min - The starting range value e.g. 3
     * @param max - The ending/finishing range value e.g. 6
     * @return a new array of all numbers between and including the min and max number. e.g. [3, 4, 5, 6]
     */
    public int[] getRange(int min, int max) {
        if (min > max) return new int[] {};

        int arrayLength = max-min+1;
        int[] rangeArr = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            rangeArr[i] = i + min;
        }

        return rangeArr;
    }

    /**
     * Swap the first and last names in a string
     *
     * @param fullName e.g. "Andy Evans"
     * @return a string with the last name, followed by the first name e.g. "Evans Andy"
     */
    public String swapNames(String fullName) {
        String[] names = fullName.split(" ");
        String swappedName = "";
        for (int i = names.length-1; i >=0; i--) {
            swappedName += " " + names[i];
        }
        return swappedName.trim();
    }

    /***
     * Determine whether a given score is the highest score out of a array of scores.
     *
     * Can you use a for-each loop?
     * https://www.w3schools.com/java/java_for_loop.asp
     *
     * @param scoresArr e.g. [3, 10, 2, 8]
     * @param newScore e.g. 11
     * @return true or false depending on whether the newScore is the highest value in the array
     */
    public boolean isHighestScore(int[] scoresArr, int newScore) {
        boolean isHighest = true;

        for (int score : scoresArr) {
            if (score > newScore) {
                isHighest = false;
                break;
            }
        }

        return isHighest;
    }

    // -------------- ADVANCED --------------

    /***
     * Given an array of numbers, sort these numbers by comparing adjacent numbers. K
     *
     * NOTE: Your code should work by repeatedly swapping the adjacent elements if they are in wrong order.
     * Example:
     * First Pass:
     * ( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
     * ( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4
     * ( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2
     * ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them
     *
     * @param numbersArr - array of numbers e.g. [5, 1, 4, 2, 8]
     * @return The sorted array of numbers
     */
    public int[] sort(int[] numbersArr) {
        int arrayLength = numbersArr.length;
        for (int i = 0; i < arrayLength-1; i++) {
            for (int j = 0; j < arrayLength - i - 1; j++) {
                if (numbersArr[j] > numbersArr[j + 1]) {
                    // These two elements are out of order!! Swap them around..
                    int temp = numbersArr[j];
                    numbersArr[j] = numbersArr[j + 1];
                    numbersArr[j + 1] = temp;
                }
            }
        }

        return numbersArr;
    }
}
