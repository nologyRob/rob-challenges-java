package com.nology.collections_05;

import java.util.*;

public class Challenge {

    // -------------- FOUNDATION --------------

    /**
     * Converts a comma-separated-list into a List
     *
     * @param csv - The csv string we are converting e.g. Andy,Sam,Bex,Ollie
     * @return Converted List
     */
    public List<String> csvToList(String csv) {
        return new ArrayList<>() { };
    }

    /**
     * Slices a list given a start & stop indexes. Make sure the indexes are within the bounds of the array
     *
     * @param items - list we are slicing
     * @param start - Start Index
     * @param stop - Stop Index
     * @return Sliced list from start to stop indexes
     */
    public List<String> getSlicedArray(List<String> items, int start, int stop) {
        return new ArrayList<>() { };
    }

    /**
     * Swaps two items in an array
     * @param items - The list we are swapping elements in. e.g. [
     * @param first - First index
     * @param second
     * @return List with swapped elements
     */
    public List<String> swapElements(List<String> items, int first, int second) {
        return new ArrayList<>() { };
    }

    // -------------- INTERMEDIATE --------------

    /**
     * Removes all odd numbers from a list of integers
     *
     * @param numbers - The list we are filtering
     * @return List of even numbers
     */
    public List<Integer> removeOddNumbers(List<Integer> numbers) {
        return new ArrayList<>() { };
    }

    /**
     * Filter a list to only return unique/distinct items in an array without using a Set
     *
     * Extension: How would you do this using sets?
     *
     * @param items - The list we are filtering
     * @return The distinct/unique items in the list
     */
    public  List<String> getUniqueItems(List<String> items) {
        return new ArrayList<>() { };
    }

    /**
     * Using a Hash Map, create a binary translator for the first 5 letters of the alphabet. If the letter doesn't exist, return -1
     *
     * @param letter - Letter we are translating
     * @return The binary code translation
     */
    public int getBinaryTranslation(char letter) {
        return -1;
    }

    // -------------- ADVANCED --------------

    /**
     * Without using any helper functions. Implement a binary search algorithm to search for an item in a sorted array.
     * A binary search uses a "Divide and Conquer" approach. It should divide an array in two, check if the middle value is the searchItem,
     * else if the searchItem is greater than the middle, repeat the same process in the top half of the array, and vise versa for
     * the lower half if the searchItem is less than the middle
     *
     * EXTENSION: Once you've completed this without recursion. Consider how this could be done using recursion, you can even alter the method declaration ;)
     *
     * @param sortedArr
     * @param searchItem
     * @return The number of iterations required to find the item
     */
    public int findItem(List<Integer> sortedArr, int searchItem) {
        return -1;
    }
}
