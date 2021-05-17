package com.nology.j2;

public class Solution {

    public Solution() {
    }

    public String calculateReturn(int initialInvestment, int years, double rateOfInterest) {
        double total = (initialInvestment * (1 + rateOfInterest)) ** years;
        return "You now have " + Math.round(total);
    }
}
