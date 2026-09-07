package com.mycompany.bankingsystem;

public class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04;
    private static final double MINIMUM_BALANCE = 100.0;

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= MINIMUM_BALANCE) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }

    @Override
    public void applyMonthlyProcessing() {
        double monthlyInterest = getBalance() * (INTEREST_RATE / 12);
        setBalance(getBalance() + monthlyInterest);
    }
}