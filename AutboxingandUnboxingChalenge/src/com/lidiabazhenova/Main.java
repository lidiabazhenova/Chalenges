package com.lidiabazhenova;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
// You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branch
        // Each Branch should have an arraylist of Customer
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions


        Branch branch=new Branch("one", new ArrayList<Customer>());
        branch.addNewCustomer(new Customer("Nick", new ArrayList<Double>()));


        //branch.addNewCustomer(new Customer("Nick", new ArrayList<Double>()));

       // branch.initialTransactions();

        ArrayList<Double> myCustomerTransaction = new ArrayList<Double>();

 //System.out.println(branch.getNameOfBranch());
//        //System.out.println(branch.;
//
//




    }
}
