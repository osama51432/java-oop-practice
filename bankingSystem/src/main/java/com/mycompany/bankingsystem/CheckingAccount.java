package com.mycompany.bankingsystem;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;
    private static final double OVERDRAFT_FEE = 15.0;

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= -overdraftLimit) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }

    @Override
    public void applyMonthlyProcessing() {
        if (getBalance() < 0) {
            setBalance(getBalance() - OVERDRAFT_FEE);
        }
    }
}