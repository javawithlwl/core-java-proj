package com.careerit.cjp.day2.ifstatements;

import java.util.Scanner;

public class BiggestOfTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2 :");
        int num2 = sc.nextInt();
        int big = (num1 > num2) ? num1 : num2;
        System.out.println("The biggest of "+num1+" and "+num2+" is "+big);
    }

    public static int biggest(int a,int b, int c){
        return (a > b && a > c) ? a : (b > c) ? b : c;
    }
}
