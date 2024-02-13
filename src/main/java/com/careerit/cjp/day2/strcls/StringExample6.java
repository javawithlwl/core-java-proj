package com.careerit.cjp.day2.strcls;

import java.util.Arrays;

public class StringExample6 {

    public static void main(String[] args) {

        String str="Krish, Manoj , Rajesh, John, Charan";
        String[] arr = str.split(",");
        for(String name:arr){
            System.out.println(name.trim().substring(0,3).toUpperCase());
        }

        String empData = "1001-Krish-50000,1002-Manoj-60000,1003-Rajesh-70000";

        // Empno : 1001
        // Name  : Krish
        // Salary: 50000

        String[] empArr = empData.split(",");
        for(String ele:empArr){
            String[] emp = ele.split("-");
            int empno = Integer.parseInt(emp[0]);  // "1001" -> 1001
            String name = emp[1];
            double salary = Double.parseDouble(emp[2]); // "50000" -> 50000.0
            System.out.println("Empno : "+empno);
            System.out.println("Name  : "+name);
            System.out.println("Salary: "+salary);
            System.out.println("-".repeat(20));
        }
        String[] names = {"Krish","Manoj","Charan","Rajesh"};
        String nameStr = String.join("-", names);
        System.out.println(nameStr);
    }
}
