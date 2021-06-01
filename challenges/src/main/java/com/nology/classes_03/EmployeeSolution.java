package com.nology.classes_03;

public class EmployeeSolution {

    public String name;
    public String position;
    public int rating;
    public int[] completedDeals;

    public EmployeeSolution(String name, String position, int rating, int[] completedDeals) {
        this.name = name;
        this.position = position;
        this.rating = rating;
        this.completedDeals = completedDeals;
    }

    public boolean isPromotable() {
        return rating > 7;
    }

    public int calculateCompletedDealsSum() {
        int total = 0;
        for (int i = 0; i < completedDeals.length; i++) {
            total += completedDeals[i];
        }
        return total;
    }

    public String hasBonusQualification() {
        int totalDealsFigure = calculateCompletedDealsSum();
        if (rating >= 9 && totalDealsFigure > 100_000) {
            return "Well done, bonus awarded: " + totalDealsFigure * 0.1;
        } else {
            return "Does no qualify for bonus";
        }
    }
}
