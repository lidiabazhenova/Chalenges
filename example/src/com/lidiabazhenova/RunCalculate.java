package com.lidiabazhenova;

import java.util.Scanner;

public class RunCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first number");
        double first = scanner.nextDouble();
        System.out.println("enter second number");
        double second = scanner.nextDouble();

        Calculator calculator = new Calculator();

        System.out.println("+ :" + calculator.add(first, second));
        System.out.println("- :" + calculator.sub(first,second));
        System.out.println("* :" + calculator.mul(first, second));
        try {
            System.out.println("/ :" + calculator.div(first,second));
        } catch (Exception e) {
                       System.out.println("Incorrect number");
        }
    }
}
