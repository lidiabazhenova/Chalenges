package com.lidiabazhenova;


import java.util.Random;
import java.util.Scanner;

public class NDigitNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int N;

        System.out.println("Enter int N - digit of number");
        N = sc.nextInt();

        int digit = (int) Math.pow(10, N);
        int number = random.nextInt(digit);

        System.out.println(digit);
        System.out.println(number);

    }
}
