package com.careerit.cjp.day2.arrays;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {

    public static void main(String[] args) {

        Account acc1 = new Account(1001, "Krish", 5000);
        Account acc2 = new Account(1005, "Manoj", 7000);
        Account acc3 = new Account(1003, "Charan", 3000);
        Account acc4 = new Account(1004, "Rajesh", 6000);

        List<Account> list = new ArrayList<>();
        list.add(acc1);
        list.add(acc2);
        list.add(acc3);
        list.add(acc4);

        for(Account acc:list) {
            acc.showInfo();
            System.out.println("--------------------------------");
        }
    }
}
