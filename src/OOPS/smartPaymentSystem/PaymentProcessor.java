package OOPS.smartPaymentSystem;

public class PaymentProcessor {
    static void pay(Payment payment) {
        System.out.println("UPI Payment initiated...");
        payment.authenticator();
        payment.encryptData();
        payment.makePayment();
        payment.showTransaction();
    }

//    static void pay(CardPayment payment) {
//        System.out.println("Card Payment initiated...");
//        payment.authenticator();
//        payment.encryptData();
//        payment.makePayment();
//        payment.showTransaction();
//    }
//    static void pay(WalletPayment payment) {
//        System.out.println("Wallet payment initiaated...");
//        payment.authenticator();
//        payment.encryptData();
//        payment.makePayment();
//        payment.showTransaction();
//    }
}
