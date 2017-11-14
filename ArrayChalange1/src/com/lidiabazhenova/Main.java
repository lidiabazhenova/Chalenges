package com.lidiabazhenova;


import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getArray(4);
        printArray(myArray);

    }

    public static int[] getArray(int number) {
        System.out.println("Enter " + number + "values");
        int[] values = new int[number];
        for (int i = 0; i < number; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("value " + i + " is " + array[i] );
        } }
    }



