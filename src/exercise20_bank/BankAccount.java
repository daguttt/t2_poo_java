package exercise20_bank;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    private final ArrayList<String> transactionHistory;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with initial balance: $" + initialBalance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Invalid deposit amount.");

        balance += amount;
        transactionHistory.add("Deposited: $" + amount + ", New Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Invalid withdrawal amount.");
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds.");

        balance -= amount;
        transactionHistory.add("Withdrawal: $" + amount + ", New Balance: $" + balance);
    }


    public void addTransaction(String transaction) {
        transactionHistory.add(transaction);
    }

    public List<String> getTransactionHistory() {
        return transactionHistory.stream().toList();
    }

    public void printBalance() {
        System.out.printf("(Account Number: %s) Balance: $%,.2f%n", accountNumber, balance);
    }
}
