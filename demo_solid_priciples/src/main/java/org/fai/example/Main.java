package org.fai.example;

import org.fai.example.ocp.correct.Account;
import org.fai.example.ocp.correct.Cash;
import org.fai.example.ocp.correct.Debit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cash cash = new Cash();
        Account account = new Account("1235456789",1000);
        cash.calculateBalance(account);
        System.out.println(cash);

        Debit debit = new Debit();
        debit.calculateBalance(account);
        System.out.println(debit);
    }
}