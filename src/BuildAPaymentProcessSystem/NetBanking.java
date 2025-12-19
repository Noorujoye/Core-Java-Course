package BuildAPaymentProcessSystem;

public class NetBanking implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Processing the payment by netBanking " + amount);
    }
}
