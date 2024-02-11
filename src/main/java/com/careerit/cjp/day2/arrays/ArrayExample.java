package com.careerit.cjp.day2.arrays;

public class ArrayExample {

    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("The length of array is : " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("-----------------");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println("------- Using For each loop ------------");

        for (int ele : arr) {
            System.out.println(ele);
        }

    }
}
