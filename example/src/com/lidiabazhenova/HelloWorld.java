package com.lidiabazhenova;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");

        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }
}
