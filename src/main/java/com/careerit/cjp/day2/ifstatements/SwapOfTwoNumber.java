package com.careerit.cjp.day2.ifstatements;

public class SwapOfTwoNumber {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        System.out.println("Before swap num1 :" + num1 + " num2 :" + num2);
        /*int temp = num1;
        num1 = num2;
        num2 = temp;*/
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swap num1  :" + num1 + " num2 :" + num2);

    }
}
