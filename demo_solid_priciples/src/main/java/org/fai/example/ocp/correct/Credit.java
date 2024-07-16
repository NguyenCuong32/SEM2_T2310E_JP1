package org.fai.example.ocp.correct;

public class Credit implements IBankAccount {
    @Override
    public double calculateBalance(Account account) {
        return account.getBalance() + account.getBalance()+0.2;
    }
}
