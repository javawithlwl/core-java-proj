package com.careerit.cjp.day2.forstatments;

import java.util.Scanner;

public class FactorsOfGivenNumber {

    // 10 => 1,2,5,10
    // 12 => 1,2,3,4,6,12
    // 15 => 1,3,5,15
    // 17 => 1,17

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal factors of " + num + " is " + count);
        if (count == 2) {
            System.out.println("The given number is prime number");
        } else {
            System.out.println("The given number is not prime number");
        }
    }

    // 100
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num % 2 == 0 && num != 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

}
