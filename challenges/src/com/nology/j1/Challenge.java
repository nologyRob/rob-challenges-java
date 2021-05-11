package com.nology.j1;

public class Challenge {

    public Challenge() {
    }

    // BEGINNER

    // write the code to programmatically return the largest number from the 2 parameters (num1, num2) passed to the method
    public int findLargestNumber(int num1, int num2) {
        return Math.max(num1, num2);
    }


    // write the code to programmatically return the longest string from the 2 parameters (string1, string2) passed to the method
    // it should return "These two are the same length!" if the strings are not different lengths
    public String findLongestString(String string1, String string2) {
        if (string1.length() > string2.length()) {
            return string1;
        } else if (string1.length() < string2.length()) {
            return  string2;
        } else return "These two are the same length!";
    }


    // INTERMEDIATE

    // write the code that programmatically reads in two floating-point numbers and tests whether they are the same up to three decimal places.
    public String compareTwoNumbers(double num1, double num2) {
        if (Math.round(num1 * 1000) == Math.round(num2 * 1000)){
            return "These numbers are really equal to 3 decimal places!";
        } else {
            return "These numbers are not equal to 3 decimal places";
        }
    }

    // write the code that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
    // e.g. 1 would return "Monday"
    // if a number outside the range is entered the method should return "Not a valid day range! The number needs to be from 1-7"
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

    // ADVANCED

    // write a program that takes a year from user and print whether that year is a leap year or not
    public boolean leapYearChecker(int year) {
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        return x && (y || z);
    }

}
