package org.fai.example.ocp.correct;

public class Debit implements IBankAccount {
    @Override
    public double calculateBalance(Account account) {
        return account.getBalance() + account.getBalance()+0.3;
    }
}
