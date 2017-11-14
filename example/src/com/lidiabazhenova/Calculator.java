package com.lidiabazhenova;

public class Calculator {
    public double add(double arg1, double arg2) {
        return arg1 + arg2;
    }

    public double sub(double arg1, double arg2) {
        return arg1 - arg2;
    }

    public double mul(double arg1, double arg2) {
        return arg1 * arg2;
    }

    public double div(double arg1, double arg2) throws Exception{
        if (arg2 == 0) {

            throw new IllegalArgumentException("division by 0");
            } else {
            double result = arg1 * arg2;

            return result;
        }
    }
}


