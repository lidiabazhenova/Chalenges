package com.lidiabazhenova;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    private String myCustomerName;
    private ArrayList<Double> myCustomerTransaction;
    private Scanner scanner = new Scanner(System.in);

    public Customer(String customerName, ArrayList<Double> myCustomerTransaction) {
        this.myCustomerName = customerName;
        this.myCustomerTransaction = new ArrayList<Double>();
    }

    public String getName() {
        return myCustomerName;
    }

    public static Customer createCustomer(String customerName, ArrayList<Double> myCustomerTransaction) {
        return new Customer(customerName, myCustomerTransaction);

    }

    public void printCustomers() {
        System.out.println("Contact List");
        for (int i = 0; i < this.myCustomerTransaction.size(); i++) {
            System.out.println((i + 1) + "." +
                    myCustomerName + myCustomerTransaction);
        }


    }
}