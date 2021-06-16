package com.nology.classes_03;

public class Employee {

    // -------------- Foundation -----------------

    // Create a class of an Employee that has four properties ....
    // name: string
    // position: string
    // rating: int
    // completedDeals: array

    // With three methods ....
    // isPromotable(): checks if rating is over 7, if so return true... else false
    // calculateCompletedDealsSum(): loops through completedDeals array and totals all the deals completed.. returns an int which is the total
    // hasBonusQualification: checks if rating is 9 or greater and if the dealsDone total is over £100,000

    public Employee(String name, String position, int rating, int[] completedDeals) {

    }

    public boolean isPromotable() {
        return false;
    }

    public int calculateCompletedDealsSum() {
        return -1;
    }

    public boolean hasBonusQualification() {
        return false;
    }
}
