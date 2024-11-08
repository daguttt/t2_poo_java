package exercise14_payments;

public class CashPayment extends Payment {

    @Override
    public void pay(double amount) {
        System.out.printf("Paying $%,.2f with CASH%n", amount);
    }
}
