package org.fai.example.ocp.correct;

public class Cash implements IBankAccount{
    @Override
    public double calculateBalance(Account account) {
        return account.getBalance();
    }
}
