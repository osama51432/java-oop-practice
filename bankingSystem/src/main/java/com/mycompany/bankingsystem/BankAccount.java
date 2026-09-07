package com.mycompany.bankingsystem;

public abstract class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        setAccountNumber(accountNumber);
        setAccountHolder(accountHolder);
        setBalance(balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && accountNumber.matches("\\d{10}")) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Error: Account number must be exactly 10 digits.");
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && accountHolder.trim().length() >= 3) {
            this.accountHolder = accountHolder;
        } else {
            System.out.println("Error: Account holder name must be at least 3 characters.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(balance + amount);
        } else {
            System.out.println("Error: Deposit amount must be greater than 0.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + getAccountHolder() +
                           "\nAccount Number: " + getAccountNumber() +
                           "\nBalance: " + getBalance() + " JOD");
    }

    public abstract boolean withdraw(double amount);
    public abstract void applyMonthlyProcessing();
}