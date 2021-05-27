package com.nology.classes_03;

public class Employee {

    // 1 - class of an Employee that has...
    // four variables called
    // name: string
    // position: string
    // rating: int
    // dealsDone: array

    // three methods called
    // readyForPromotion: checks if rating is over 7, if so return true... else false
    // sumDeals: loops through dealsDone array and totals all the deals done... returns an int which is the total
    // qualifiesForBonus: checks if rating is 9 or greater and if the dealsDone total is over £100,000

    public String name;
    public String position;
    public int rating;
    public int[] dealsDone;

    public Employee(String name, String position, int rating, int[] dealsDone) {
        this.name = name;
        this.position = position;
        this.rating = rating;
        this.dealsDone = dealsDone;
    }

    public boolean readyForPromotion() {
        if (rating > 7) {
            return true;
        } else return false;
    }

    public int sumDeals() {
        int total = 0;
        for (int i = 0; i < dealsDone.length; i++) {
            total += dealsDone[i];
        }
        return total;
    }

    public String qualifiesForBonus() {
        int totalDealsFigure = sumDeals();
        if (rating >= 9 && totalDealsFigure > 100_000) {
            return "Well done, bonus awarded: " + totalDealsFigure * 0.1;
        } else return "Does no qualify for bonus";
    }
}
