package DesignPatterns.Strcutural.Adatpter.sendAndPay;

public class PaymentService {

    private PaymentGateway gateway;

    public PaymentService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void transfer() {
        gateway.pay(1000);
    }
}
