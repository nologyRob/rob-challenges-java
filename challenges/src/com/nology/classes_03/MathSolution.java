package com.nology.classes_03;

public class MathSolution {

    public double PI;

    public MathSolution(double PI) {
        this.PI = PI;
    }

    public double pow(double number, double power) {
        double result = 1;
        // running loop while the power > 0
        while (power != 0) {
            result = result * number;
            // power will get reduced after each multiplication
            power--;
        }
        return result;
    }

    public double min(double num1, double num2) {
        if (num1 == num2) {
            return 0;
        }
        else if (num1 < num2) {
            return num1;
        }
        else {
            return num2;
        }
    }

    public double max(double num1, double num2) {
        if (num1 == num2) {
            return 0;
        }
        else if (num1 > num2) {
            return num1;
        }
        else {
            return num2;
        }
    }

    public int round(double number) {
        return (int) (number + 0.5);
    }
}
