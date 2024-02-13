package com.careerit.cjp.day2.strcls;

import java.util.Arrays;

public class StringExample4 {


    public static void main(String[] args) {
        System.out.println(isAnagram("ACT", "CAT"));
        System.out.println(isAnagram("ACT", "CATS"));
        System.out.println(isAnagram("ACT", "TAC"));
        System.out.println(isPalindrome("MADAM"));
        System.out.println(isPalindrome("MADAMS"));

    }

    // ACT, CAT => true
    // ACT, CATS => false
    // ACT, TAC => true
    // ACT, TBC => false
    public static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
