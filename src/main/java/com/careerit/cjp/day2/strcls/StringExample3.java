package com.careerit.cjp.day2.strcls;

public class StringExample3 {

    public static void main(String[] args) {

            String s1 = "ACT";
            char[] arr = s1.toCharArray();
            for(char ch:arr) {
                System.out.println(ch);
            }
            System.out.println(s1.length());

            for(int i=0;i<s1.length();i++) {
                System.out.println(s1.charAt(i));
            }
            System.out.println("-------------------");

            for(int i=s1.length()-1;i>=0;i--) {
                System.out.println(s1.charAt(i));
            }

    }
}
