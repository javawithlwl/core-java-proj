package com.careerit.cjp.day2.ifstatements;

import java.util.Scanner;

public class EvenOrOddNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println(num + " is even number");
        }else{
            System.out.println(num + " is odd number");
        }
    }
}
