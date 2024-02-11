package com.careerit.cjp.day2.ifstatements;

import java.util.Scanner;

public class TaxCalculator {
    // if salary is less than 5L tax is 0
    // if salary is between 5L and 10L tax is 10%
    // if salary is between 10L and 20L tax is 20%
    // if salary is greater than 20L tax is 30%

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary :");
        double salary = sc.nextDouble();

        double tax = 0;
        if(salary < 500000) {
            tax = 0;
        }else if (salary >= 500000 && salary < 1000000) {
            tax = (salary-500000) * 0.10;
        }else if(salary >= 1000000 && salary < 2000000) {
            tax = (salary - 1000000) * 0.20 + 50000;
        }else if(salary >= 2000000) {
            tax = (salary - 2000000) * 0.30 +  250000;
        }

        // 30
        // 0 - 5 = 0
        // 5 - 10 = 50000
        // 10 - 20 = 200000
        // 10 = 300000

        System.out.println("The salary is :"+salary);
        System.out.println("The tax is    :"+tax);
    }
}
