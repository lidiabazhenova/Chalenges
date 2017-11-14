package com.lidiabazhenova;

import java.util.Scanner;

public class SquareOfRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter R");
        double radius = scanner.nextDouble();
        System.out.println("Square = " + Math.pow(radius, 2)*Math.PI);
    }

}
