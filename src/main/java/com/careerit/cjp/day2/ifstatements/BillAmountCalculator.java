package com.careerit.cjp.day2.ifstatements;


// Accept the bill amount and calculate the discount based on the bill amount;
// If the bill amount is greater than or equal to 5000 then discount is 20%

import java.util.Scanner;

public class BillAmountCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount :");
        double billAmount = sc.nextDouble();
        double discount = 0;
        if(billAmount >= 5000){
            discount = billAmount * 0.20;
        }
        double netAmount = billAmount - discount;
        System.out.println("The bill amount is :"+billAmount);
        System.out.println("The discount is    :"+discount);
        System.out.println("The net amount is  :"+netAmount);
    }
}
