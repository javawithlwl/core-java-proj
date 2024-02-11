package com.careerit.cjp.day2.ifstatements;

import java.util.Scanner;

public class GradeExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score :");
        int score = sc.nextInt();
        String grade = "";
        if(score >=1 && score <= 5) {
            grade = "C";
        }else if(score >=6 && score <= 8) {
            grade = "B";
        }else if(score >=9 && score <= 10) {
            grade = "A";
        }else{
            grade = "Invalid score";
        }
        System.out.println("The score is :"+score+" and grade is :"+grade);
    }
}
