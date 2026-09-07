package com.mycompany.bankingsystem;

public class InvestmentAccount extends BankAccount {
    private static final double MONTHLY_PROFIT_RATE = 0.05;
    private static final double WITHDRAWAL_FEE_RATE = 0.02;

    public InvestmentAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            return false;
        }

        double totalAmount = amount + (amount * WITHDRAWAL_FEE_RATE);
        if (getBalance() >= totalAmount) {
            setBalance(getBalance() - totalAmount);
            return true;
        }
        return false;
    }

    @Override
    public void applyMonthlyProcessing() {
        if (getBalance() <= 0) {
            return;
        }
        double profitAmount = getBalance() * MONTHLY_PROFIT_RATE;
        setBalance(getBalance() + profitAmount);
    }
}