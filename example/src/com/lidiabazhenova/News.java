package com.lidiabazhenova;

public class News {
    public static void main(String[] args) {
        int numberOfNews;
        numberOfNews = 44;
        if (numberOfNews % 10 == 0) {
            System.out.println("numberOfNews = " + numberOfNews / 10);

        } else {
            double numberOfPages = numberOfNews / 10 + 1;
            System.out.println(numberOfPages);
        }
    }
}
