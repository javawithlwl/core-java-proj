package com.careerit.cjp.day1;

import java.util.Scanner;

public class EmiCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        double p = sc.nextDouble();
        System.out.println("Enter the rate of interest:");
        double r = sc.nextDouble();
        System.out.println("Enter the time in months:");
        double t = sc.nextDouble();
        double ri = r / 12 / 100;
        double emi = p * ri * ((Math.pow(1 + ri, t)) / (Math.pow(1 + ri, t) - 1));
        System.out.println("The emi is            :" + Math.round(emi));
        System.out.println("The total interest is : " + Math.round(emi * t - p));
        System.out.println("The total amount is   : " + Math.round(emi * t));

    }
}
