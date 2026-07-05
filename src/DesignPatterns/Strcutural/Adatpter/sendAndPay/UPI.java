package DesignPatterns.Strcutural.Adatpter.sendAndPay;

public class UPI implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("UPI Payment : " + amount);
    }
}
