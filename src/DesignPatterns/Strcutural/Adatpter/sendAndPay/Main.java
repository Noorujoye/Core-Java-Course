package DesignPatterns.Strcutural.Adatpter.sendAndPay;

public class Main {
    public static void main(String[] args) {
        PaymentGateway gateway = new UPI();
        PaymentService service = new PaymentService(gateway);
        service.transfer();

        Paypal paypal = new Paypal();
        PaymentGateway gateway1 = new PaypalAdapter(paypal);
        PaymentService service1 = new PaymentService(gateway1);
        service1.transfer();
    }
}
