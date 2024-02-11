package com.careerit.cjp.day1;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        double p = sc.nextDouble();
        System.out.println("Enter the rate of interest:");
        double r = sc.nextDouble();
        System.out.println("Enter the time in years:");
        double t = sc.nextDouble();

        double si = (p * r * t) / 100;
        System.out.println("The simple interest for principal amount : " + p + " rate of interest : " + r + " and time : " + t + " is : " + si);
        double totalAmount = p + si;
        System.out.println("The total amount is : " + totalAmount);
    }
}
