package com.lidiabazhenova;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Customer {

    private String customerName;
    private ArrayList<Double> myTransactions;
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public Customer(String customerName) {
        this.customerName = customerName;
        this.myTransactions = new ArrayList<Double>();
    }

    public String getCustomerName() {
        return customerName;
    }


    public ArrayList<Double> getMyTransactions() {
        ArrayList<Double> myTransactions = new ArrayList<Double>();
        double summ;
        int number;
        System.out.println("Enter number of transactions");
        number = scanner.nextInt();

        int currentItem = 1;
        while (currentItem <= number) {
            System.out.println("Enter transaction #" + currentItem);

            try {
                summ = scanner.nextDouble();
                myTransactions.add(summ);
                currentItem++;
            } catch(InputMismatchException ex) {
                System.out.println("Wrond double format");
                scanner.next();
            }
        }
        System.out.println("Shutting down...");

        System.out.println(getCustomerName());
        for (int i = 0; i < myTransactions.size(); i++) {
            double value = myTransactions.get(i);
            System.out.println((i + 1) + "-->" + value);
        }
        return myTransactions;
    }


//    public void printCustomer() {
//
//        for(int i=0; i<this.myTransactions.size(); i++) {
//            System.out.println((i+1) + "." +
//                    this.myTransactions.get(i));
//        }

}



