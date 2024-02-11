package com.careerit.cjp.day2.whilestatment;

public class NumberOperations {

    public static void main(String[] args) {
        int num = 12321;
        System.out.println("The sum of digits of " + num + " is " + sumOfDigits(num));
        System.out.println("The reverse of " + num + " is " + reverse(num));
        System.out.println("Is " + num + " is palindrome : " + isPalindrome(num));
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int r = num % 10;
            sum += r;
            num /= 10;
        }
        return sum;
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int r = num % 10;
            rev = rev * 10 + r;
            num /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int num) {
        return num == reverse(num);
    }
}
