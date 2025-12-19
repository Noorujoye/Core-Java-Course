package BuildAPaymentProcessSystem;

public class CardPay implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing CardPay payment of " + amount);
    }
}
