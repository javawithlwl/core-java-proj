package com.careerit.cjp.day2.strcls;

public class StringExample2 {

    public static void main(String[] args) {

        String s1 = "Core";
        String s2 = "Core Java";
        s1 = s1.concat(" Java");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }
}
