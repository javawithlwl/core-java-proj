package com.careerit.cjp.day2.arrays;

public class ArrayExample3 {

    public static void main(String[] args) {
        int[] arr = {10, 25, 20, 35, 30, 45, 40};
        System.out.println("The max element in the array is : " + maxElement(arr));
        int ele = 30;
        int index = indexOf(arr, ele);
        if (index != -1) {
            System.out.println("The element " + ele + " is found at index " + index);
        } else {
            System.out.println("The element " + ele + " is not found");
        }
    }

    public static int maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minElement(int[] arr) {
        return 0;
    }

    public static int indexOf(int[] arr, int ele) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                index = i;
                break;
            }
        }
        return index;
    }
}
