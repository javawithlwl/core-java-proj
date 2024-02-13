package com.careerit.cjp.day2.arrays;

public class Account {

    private long accno;
    private String name;
    private double balance;

    public Account(long accno, String name, double balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient funds");
        }else{
            balance -= amount;
            System.out.println("Amount "+amount+" is withdrawn successfully");
        }

    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Amount "+amount+" is deposited successfully");
    }
    public void showInfo(){
        System.out.println("Account number : "+accno);
        System.out.println("Name           : "+name);
        System.out.println("Balance        : "+balance);
    }
}
