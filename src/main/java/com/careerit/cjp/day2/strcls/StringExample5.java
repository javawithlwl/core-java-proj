package com.careerit.cjp.day2.strcls;

public class StringExample5 {

    public static void main(String[] args) {

        String s1 = "Learning Core Java is fun!";
        System.out.println(s1.toUpperCase());

        String str = s1.substring(8,14).trim();
        System.out.println(str);
        System.out.println(str.length());

        String str1 = "Core Java";
        System.out.println(str1.substring(5));
    }
}
