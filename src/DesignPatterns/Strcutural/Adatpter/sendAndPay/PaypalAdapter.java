package DesignPatterns.Strcutural.Adatpter.sendAndPay;

public class PaypalAdapter implements PaymentGateway {

    private Paypal paypal;

    public PaypalAdapter(Paypal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void pay(double amount) {
        paypal.sendMoney(amount);
    }
}
