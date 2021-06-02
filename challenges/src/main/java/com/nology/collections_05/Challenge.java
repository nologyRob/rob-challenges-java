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
        String[] items = csv.split(",");
        return List.of(items);
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
        if (start < 0 || start+1 > items.size() || stop < 0 || stop+1 >items.size()) {
            // Check whether the start and stop are within the bounds of the array
            return new ArrayList<String>();
        }
        return items.subList(start, stop+1);
    }

    /**
     * Swaps two items in an array
     * @param items - The list we are swapping elements in. e.g. [
     * @param first - First index
     * @param second
     * @return List with swapped elements
     */
    public List<String> swapElements(List<String> items, int first, int second) {
        Collections.swap(items, first, second);
        return items;
    }

    // -------------- INTERMEDIATE --------------

    /**
     * Removes all odd numbers from a list of integers
     *
     * @param numbers - The list we are filtering
     * @return List of even numbers
     */
    public List<Integer> removeOddNumbers(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<Integer>();
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }

        return evenNumbers;
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
        List<String> distinctItems = new ArrayList<>();
        for (String item : items) {
            if (!distinctItems.contains(item)) {
                System.out.println("Adding: " + item);
                distinctItems.add(item);
            }
        }
        return distinctItems;

        // EXTENSION: return new HashSet(itemsArr);
    }

    /**
     * Using a Hash Map, create a binary translator for the first 5 letters of the alphabet. If the letter doesn't exist, return -1
     *
     * @param letter - Letter we are translating
     * @return The binary code translation
     */
    public int getBinaryTranslation(char letter) {
        Map<Character, Integer> binaryMap = new HashMap<Character, Integer>();

        char lowerCaseLetter = Character.toLowerCase(letter);

        // Create a Hash Map
        binaryMap.put('a', 01100001);
        binaryMap.put('b', 01100010);
        binaryMap.put('c', 01100011);
        binaryMap.put('d', 01100100);
        binaryMap.put('e', 01100101);

        Integer binary = binaryMap.get(lowerCaseLetter);

        return binary != null ? binary : -1;
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
        int startIndex = 0;
        int lastIndex = sortedArr.size() - 1;
        int iterations = 0;

        while(startIndex <= lastIndex) {
            iterations++;
            int middleIndex = (startIndex + lastIndex) / 2;

            if (sortedArr.get(middleIndex) == searchItem) {
                // Yay! We finally found the item by splitting the array in half.
                return iterations;
            }
            else if (sortedArr.get(middleIndex) < searchItem) {
                startIndex = middleIndex + 1;
            } else if (sortedArr.get(middleIndex) > searchItem) {
                lastIndex = middleIndex - 1;
            }
        }
        // Uh oh! We couldn't find the item in this array
        return -1;
    }
}
