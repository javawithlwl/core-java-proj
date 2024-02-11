package com.careerit.cjp.day2.ifstatements;

public class AndOrExample {

    public static void main(String[] args) {

        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;

        if (a || b || (c=true) || ( d=true)) {
            System.out.println("All are true");
        } else {
            System.out.println("Atleast one is true");
        }
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
