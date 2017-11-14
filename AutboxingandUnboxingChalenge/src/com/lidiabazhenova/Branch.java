package com.lidiabazhenova;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Scanner;

public class Branch {
    private String nameOfBranch;
    private ArrayList<Customer> myCustomer;
    private Scanner scanner = new Scanner(System.in);


    public Branch(String nameOfBranch, ArrayList<Customer> myCustomers) {
        this.nameOfBranch = nameOfBranch;
        this.myCustomer = new ArrayList<Customer>();
    }

    public String getNameOfBranch() {
        return nameOfBranch;
    }


//    public String getNameOfCustomer(Customer customer) {
//        return customer.getName();
//
//    }
public boolean addNewCustomer(Customer customer) {
    if(findCustomer(customer.getName()) >=0) {
        System.out.println("Contact is already on file");
        return false;
    }
    myCustomer.add(customer);
    return true;

}

    private int findCustomer(String customerName) {
        for(int i=0; i<this.myCustomer.size(); i++) {
            Customer customer = this.myCustomer.get(i);
            if(customer.getName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }


//    private void addNewContact() {
//        System.out.println("Enter new customer name: ");
//        String name = scanner.nextLine();
//        System.out.println("Enter phone number: ");
//        String  = scanner.nextLine();
//        Customer newCustomer = Customer.createCustomer(name, myCustomerTr );
//        if(newCustomer.addNewContact(newCustomer)) {
//            System.out.println("New contact added: name = "", phone = "+ phone);
//        } else {
//            System.out.println("Cannot add, " + name + " already on file");
//        }
//    }

    public void initialTransactions() {
//    public ArrayList<Double> initialTransactionAmount() {
//        ArrayList<Double> myTransactions = new ArrayList<Double>();
//
//        return    this.myCustomer.get(i).getMyCustomerTransaction());
//
//    }


    }
}
