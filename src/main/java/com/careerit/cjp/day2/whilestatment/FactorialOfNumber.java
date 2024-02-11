package com.careerit.cjp.day2.whilestatment;

public class FactorialOfNumber {

      public static void main(String[] args){
            int num = 6;
            int res = 1;
            int i = 2;
            while(i <= num){
                res = * i;
                i++;
            }
            System.out.println("Factorial of "+num+" is "+res);
      }
              
}
