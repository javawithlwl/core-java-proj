package com.careerit.cjp.day2.strcls;

public class StringExample1 {

    public static void main(String[] args) {

        String s1 = "Core Java";
        String s2 = "Core Java";
        String s3 = new String("Core Java");
        String s4 = new String("Core Java");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        s1 = s1.concat(" Programming");
        System.out.println(s1);
        System.out.println(s2);
    }
}
