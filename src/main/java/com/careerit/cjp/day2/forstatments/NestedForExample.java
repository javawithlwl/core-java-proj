package com.careerit.cjp.day2.forstatments;

public class NestedForExample {


    public static void main(String[] args) {
        // Print the multiplication table between lb and ub
        int lb = 10;
        int ub = 15;
        for (int i = lb; i <= ub; i++) {
            int num = i;
            for (int j = 1; j <= 10; j++) {
                System.out.println(num + " * " + j + " = " + (num * j));
            }
            System.out.println("-------------------------------");
        }

    }
}
