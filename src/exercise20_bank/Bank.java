package exercise20_bank;

import java.util.ArrayList;
import java.util.Optional;

public class Bank {
    private ArrayList<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public Optional<BankAccount> findAccount(String accountNumber) {
        return accounts.stream()
                .filter(account -> account.getAccountNumber().equals(accountNumber))
                .findFirst();
    }

    public void transfer(String fromAccountNumber, String toAccountNumber, double amount) {

        Optional<BankAccount> fromAccountOpt = findAccount(fromAccountNumber);
        Optional<BankAccount> toAccountOpt = findAccount(toAccountNumber);

        if (fromAccountOpt.isEmpty()) {
            System.out.println("From account not found: " + fromAccountNumber);
            return;
        }
        if (toAccountOpt.isEmpty()) {
            System.out.println("To account not found: " + toAccountNumber);
            return;
        }

        BankAccount fromAccount = fromAccountOpt.get();
        BankAccount toAccount = toAccountOpt.get();

        if (fromAccount.getBalance() < amount) {
            System.out.println("Transfer failed due to insufficient funds.");
            return;
        }

        try {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            String transaction = "Transferred: $" + amount + " from " + fromAccountNumber + " to " + toAccountNumber;
            fromAccount.addTransaction(transaction);
            toAccount.addTransaction(transaction);
            System.out.println(transaction);
        } catch (IllegalArgumentException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        }
    }
}
