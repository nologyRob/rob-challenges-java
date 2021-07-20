package com.nology.introduction_01;

public class Solution {

    public Solution() {}

    // --------------  FOUNDATION --------------

    /***
     * A method to find the largest number of two given integers
     * @param num1 a number to be compared with the other parameter
     * @param num2 a number to be compared with the other parameter
     * @return returns the larger of the 2 numbers passed as parameters
     */
    public int findLargestNumber(int num1, int num2) {
        return Math.max(num1, num2);
    }

    /***
     * A method to find the longest string of two given strings
     * @param string1 a string to be compared with the other parameter
     * @param string2 a string to be compared with the other parameter
     * @return returns the larger of the 2 strings or "These two are the same length!" if they are of equal length
     */
    public String findLongestString(String string1, String string2) {
        if (string1.length() > string2.length()) {
            return string1;
        } else if (string1.length() < string2.length()) {
            return  string2;
        } else return "These two are the same length!";
    }

    /**
     * A method to calculate a price discount. Given the price and the amount to be discounted return the new
     * discounted price.
     * @param price The advertised price of a product
     * @param discount The percentage discount available
     * @return returns the price with the discount applied
     */
    public double getDiscount(int price, int discount) {
        return price - price * discount/100.00;
    }

    // -------------- INTERMEDIATE --------------

    /***
     * A method to check whether 2 numbers are equal to 4 decimal places.
     * HINT: What happens if you do 0.1234 * 10000?
     * @param num1 a double to be compared with the other parameter
     * @param num2 a double to be compared with the other parameter
     * @return a boolean to specify whether the 2 params match to 4 decimal places.
     */
    public boolean compareTwoNumbers(double num1, double num2) {
        if (Math.round(num1 * 10000) == Math.round(num2 * 10000)){
            return true;
        } else {
            return false;
        }
    }

    /***
     * A method to determine which day of the week it is from a numeric input.
     * e.g 0 = "Sunday", 1 = "Monday" etc.
     * If the input is out of range return "Not a valid day range! The number needs to be from 0-6"
     * EXTENSION Use a switch?
     * https://www.w3schools.com/java/java_switch.asp
     * @param day a Integer from 1-7 (that corresponds to the days of the week)
     * @return the day that corresponds to the number that was passed to the method as a parameter or "Not a valid
     * day range! The number needs to be from 0-6" if param passed is outside of the range
     */
    public String getDayName(int day) {
        String dayName = "";

        switch (day) {
            case 0: dayName = "Sunday"; break;
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday";break;
            default: dayName = "Not a valid day range! The number needs to be from 0-6";
        }

        return dayName;
    }

    /***
     * A method to check whether a word has an even length or not.
     * If a empty string is given it should return false.
     * @param word a String to be checked whether the string has an even length or not.
     * @return a boolean the result of the length check.
     */
    public boolean isEvenWord(String word) {
        return !word.equals("") && word.length() % 2 == 0;
    }

    // --------------  ADVANCED --------------

    /***
     * A method to determine whether any given year is a leap year
     * A leap year occurs on:
     * - any year that is evenly divisible by 4
     * - except any year that is evenly divisible by 100 as well
     * - unless the same year is also evenly divisible by 400
     */
    public boolean leapYearChecker(int year) {
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        return x && (y || z);
    }
}
