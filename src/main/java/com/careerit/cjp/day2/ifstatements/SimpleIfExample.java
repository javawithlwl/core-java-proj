package com.careerit.cjp.day2.ifstatements;

import java.util.Scanner;

public class SimpleIfExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age :");
        int age = sc.nextInt();
        if(age < 0){
            age = -age;
        }
        System.out.println("The age is :"+age);
    }
}
