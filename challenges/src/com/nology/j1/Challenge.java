package com.nology.j1;

public class Challenge {

    public Challenge() {
    }

    // -------------- FOUNDATION --------------

    /***
     * A method to find the largest number
     * @param num1 a number to be compared with the other parameter
     * @param num2 a number to be compared with the other parameter
     * @return returns the larger of the 2 numbers passed as paramters
     */
    public int findLargestNumber(int num1, int num2) {
        return -1;
    }

    /***
     * A method to find the longest string
     * @param string1 a string to be compared with the other parameter
     * @param string2 a string to be compared with the other parameter
     * @return returns the larger of the 2 strings or "These two are the same length!" if they are of equal length
     */
    public String findLongestString(String string1, String string2) {
        return "";
    }

    // -------------- INTERMEDIATE --------------

    /***
     * A method to check whether 2 numbers are equal to 4dp
     * @param num1 a double to be compared with the other parameter
     * @param num2 a double to be compared with the other parameter
     * @return a string to specify whether the 2 params match to 3dp
     */
    public Boolean compareTwoNumbers(double num1, double num2) {
        return true;
    }

    /***
     * A method to determine which day of the week it is from a numeric input
     * @param day a Integer from 1-7 (that corresponds to the days of the week)
     * @return the day that corresponds to the number that was passed to the method as a parameter or "Not a valid day range! The number needs to be from 1-7" if param passed is outside of the range
     */
    public String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Not a valid day range! The number needs to be from 1-7";
        }

        return dayName;
    }

    // -------------- ADVANCED --------------

    /***
     * A method to determine whether any given year is a leap year
     * @param year the year to be checked
     * @return returns true if it is a leap year, false if not
     */
    public boolean leapYearChecker(int year) {
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        return x && (y || z);
    }
}
