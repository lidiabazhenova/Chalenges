package com.lidiabazhenova;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getArray();
        printArray(myArray);
        System.out.println("Sort items");
        int[] sorted = sortArray(myArray);
        printArray(sorted);

    }

    public static int[] getArray() {
        int number;
        System.out.println("Enter number of items");
        number = scanner.nextInt();
        System.out.println("Enter " + number + " items");
        int[] values = new int[number];
        for (int i = 0; i < number; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("value " + i + " is " + array[i]);
        }
    }

//first method
//    public static void sortArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            int max = array[i];
//            int imax = i;
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[j] > max) {
//                    max = array[j];
//                    imax = j;
//                }
//            }
//            if (i != imax) {
//                int temp = array[i];
//                array[i] = array[imax];
//                array[imax] = temp;
//            }
//
//        }}

    public static int[] sortArray(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[]sortedArray= Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }

        }
        return sortedArray;
    }
}








