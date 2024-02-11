package com.careerit.cjp.day1;

import java.util.Scanner;

public class MathClassUtil {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n :");
        int n = sc.nextInt();
        System.out.println("Enter the m :");
        int m = sc.nextInt();

        // Biggest of two numbers and n power m value

        int big = Math.max(n, m);
        double pow = Math.pow(n, m);
        System.out.println("Biggest of "+n+" and "+m+" is :"+big);
        System.out.println(n+" power "+m+" is :"+pow);

    }
}
