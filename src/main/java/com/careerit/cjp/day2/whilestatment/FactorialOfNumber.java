package com.careerit.cjp.day2.whilestatment;

import java.util.Scanner;

public class FactorialOfNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int res = 1;
        int i = 2;
        while (i <= num) {
            res *= i;
            i++;
        }
        System.out.println("Factorial of " + num + " is " + res);
    }

}
