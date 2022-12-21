package com.mycompany.lab1;

public class BankAccount {
    public String owner;
    public double balance;
    public int aType;
    
    public BankAccount(){
        owner = "";
        balance = 0;
        aType = 0;
    }
    
    public void info(){
        System.out.println("Owner : " + owner + "\nBalance : " + balance + "\naType : " + aType);
    }
    
    public void addMoney(double a){
        balance += a;
    }
}
