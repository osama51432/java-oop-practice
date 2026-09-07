package com.mycompany.bankingsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class BankingSystem {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();

        addAccounts(accounts);
        printMonthlyProcessing(accounts);
    }

    public static void addAccounts(ArrayList<BankAccount> arr) {
        boolean running = true;

        while (running) {
            System.out.println("\n=================================");
            System.out.println("     BANKING MANAGEMENT SYSTEM   ");
            System.out.println("=================================");
            System.out.println("1. Add Savings Account");
            System.out.println("2. Add Checking Account");
            System.out.println("3. Add Investment Account");
            System.out.println("4. Finish & Print Monthly Processing");
            System.out.print("Choose an option (1-4): ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter 10-digit Account Number: ");
                    String savNum = input.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    String savName = input.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double savBalance = input.nextDouble();
                    input.nextLine();

                    arr.add(new SavingsAccount(savNum, savName, savBalance));
                    System.out.println("Savings Account added successfully!");
                    break;

                case 2:
                    System.out.print("Enter 10-digit Account Number: ");
                    String chkNum = input.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    String chkName = input.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double chkBalance = input.nextDouble();
                    System.out.print("Enter Overdraft Limit: ");
                    double overdraftLimit = input.nextDouble();
                    input.nextLine();

                    arr.add(new CheckingAccount(chkNum, chkName, chkBalance, overdraftLimit));
                    System.out.println("Checking Account added successfully!");
                    break;

                case 3:
                    System.out.print("Enter 10-digit Account Number: ");
                    String invNum = input.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    String invName = input.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double invBalance = input.nextDouble();
                    input.nextLine();

                    arr.add(new InvestmentAccount(invNum, invName, invBalance));
                    System.out.println("Investment Account added successfully!");
                    break;

                case 4:
                    running = false;
                    System.out.println("\nProcessing all accounts...\n");
                    break;

                default:
                    System.out.println("Invalid option! Please enter a number between 1 and 4.");
            }
        }
    }

    public static void printMonthlyProcessing(ArrayList<BankAccount> arr) {
        System.out.println("========================================");
        System.out.println("      MONTHLY PROCESSING REPORT         ");
        System.out.println("========================================");

        for (BankAccount account : arr) {
            account.applyMonthlyProcessing();
            account.displayAccountInfo();

            if (account instanceof CheckingAccount) {
                CheckingAccount chk = (CheckingAccount) account;
                if (chk.getBalance() < 0) {
                    double remainingOverdraft = chk.getOverdraftLimit() + chk.getBalance();
                    System.out.printf("  [WARNING] Account in Overdraft! Remaining Limit: %.2f JOD%n", remainingOverdraft);
                }
            }
            System.out.println("----------------------------------------");
        }
    }
}