package exercise5_bank_account;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase CuentaBancaria con Historial de Transacciones:
 * Implementa una clase CuentaBancaria con atributos numeroCuenta, titular, y
 * saldo. Añade métodos para depositar y retirar dinero. Guarda un historial de
 * transacciones (tipo y monto) y un método para mostrarlo.
 */

public class BankAccount {

    public record Transaction(String type, double amount) {
    }

    private List<Transaction> transactions = new ArrayList<>();
    private String accountNumber;
    private String titular;
    private double balance;

    public BankAccount(String accountNumber, String titular) {
        this(accountNumber, titular, 0.0);
    }

    public BankAccount(String accountNumber, String titular, double balance) {
        this.accountNumber = accountNumber;
        this.titular = titular;
        this.balance = balance;
    }

    // Getters and Setters
    public double getBalance() {
        return balance;
    }

    // Methods
    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Deposit", amount));
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction("Withdrawal", amount));
    }

    public void printTransactions() {
        System.out.printf("Historial de Transacciones de cuenta # %d de titular: %s:", accountNumber, titular);
        for (Transaction transaction : transactions) {
            System.out.println(transaction.type() + ": $" + transaction.amount());
        }
    }

    public void printBalance() {
        System.out.println("Saldo cuenta # " + accountNumber + " actual: $" + balance);
    }
}
