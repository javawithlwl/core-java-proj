package com.careerit.cjp.day2.arrays;

import java.util.Arrays;

public class AnagramArrays {

    public static void main(String[] args) {
        String str1 = "ACT";
        String str2 = "CAT";
        System.out.println(isAnagram(str1, str2));
    }
    public static boolean isAnagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
