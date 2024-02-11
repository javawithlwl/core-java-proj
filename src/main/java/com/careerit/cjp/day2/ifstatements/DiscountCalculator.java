package com.careerit.cjp.day2.ifstatements;

import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount :");
        double billAmount = sc.nextDouble();
        // if the bill amount is greater than or equal to 5000 then discount is 20% else 10%
        double discount = 0;
        if (billAmount >= 5000) {
            discount = billAmount * 20 / 100;
        } else {
            discount = billAmount * 10 / 100;
        }
        double netAmount = billAmount - discount;
        System.out.println("The bill amount is :" + billAmount);
        System.out.println("The discount is    :" + discount);
        System.out.println("The net amount is  :" + netAmount);
    }
}
