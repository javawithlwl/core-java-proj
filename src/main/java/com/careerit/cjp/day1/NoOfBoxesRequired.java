package com.careerit.cjp.day1;

import java.util.Scanner;

public class NoOfBoxesRequired {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of toys:");
        int toyCount = sc.nextInt();
        System.out.println("Enter the box capacity:");
        int boxSize = sc.nextInt();
        int noOfBoxes = toyCount / boxSize;
        if (toyCount % boxSize != 0) {
            noOfBoxes += 1;
        }
        System.out.println("The number of boxes required to pack " + toyCount + " toys is " + noOfBoxes);
    }
}
