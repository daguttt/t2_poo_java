package exercise14_payments;

public class CardPayment extends Payment{
    @Override
    public void pay(double amount) {
        System.out.printf("Paying $%,.2f with CARD%n", amount);
    }
}
