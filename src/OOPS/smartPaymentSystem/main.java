package OOPS.smartPaymentSystem;

public class main {
    public static void main(String[] args) {
      //  UPIPayment upi = new UPIPayment(500 , "noorain");
        //CardPayment card = new CardPayment(1000 , "123-254-8547");
        //WalletPayment wallet = new WalletPayment(548 , "PhonePe Wallet");
        //PaymentProcessor.pay(wallet);

      //  PaymentProcessor.pay(upi);
        //System.out.println("-----");
        //PaymentProcessor.pay(card);

        System.out.println("Factory method logic...");

        Payment p = PaymentFactory.getPayment("UPI", 200, "Noorain");
        PaymentProcessor.pay(p);


    }
}
