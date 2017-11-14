package com.lidiabazhenova;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter int number");
        String myStrNumber = sc.nextLine();


        char[] chars = myStrNumber.toCharArray();
        //System.out.println(chars);

        for (int i =0; i<chars.length-1; i++) {

                System.out.println(chars[i]);
        if ((chars[i]<chars[i+1])) {
            System.out.println("y");
        }if (i==chars.length){System.out.println("yes");}
        }
        }



    }

