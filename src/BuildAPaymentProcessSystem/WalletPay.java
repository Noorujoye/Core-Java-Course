package BuildAPaymentProcessSystem;

public class WalletPay implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Processing wallet payment of " + amount);
    }
}
