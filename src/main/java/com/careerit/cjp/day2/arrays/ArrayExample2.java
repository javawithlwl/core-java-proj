package com.careerit.cjp.day2.arrays;

import java.util.Arrays;

public class ArrayExample2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        System.out.println("Is palindrome : " + isPalindrome(arr));
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Is palindrome : " + isPalindrome(arr1));
        int[] arr2 = new int[]{4, 2, 1, 3, 6, 5, 7, 9, 8, 10};
        System.out.println("The length of array is " + arr2.length);
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.equals(arr2, arr3));
    }

    public static boolean isPalindrome(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
}
