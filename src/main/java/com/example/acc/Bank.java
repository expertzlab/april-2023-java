package com.example.acc;

public class Bank {
    public static void main(String[] args) {
        Account ac = new Account();
        Credit cr = ac;
        cr.deposit(1000, "222333");

        Debit dr = ac;
        dr.withDraw(100, "22323232323");
    }
}
