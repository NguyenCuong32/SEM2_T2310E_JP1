package org.fai.example.ocp.violate;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double calculateBalance(String accountType) {
        if (accountType.equals("Cash")) {
            return balance;
        }
        if (accountType.equals("Debit")) {
            return balance + balance+0.3;
        }
        if (accountType.equals("Credit")) {
            return balance + balance+0.2;
        }
        return balance;
    }
}
