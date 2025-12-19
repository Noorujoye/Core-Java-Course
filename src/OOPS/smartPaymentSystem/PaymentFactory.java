package OOPS.smartPaymentSystem;

public class PaymentFactory {
    public static Payment getPayment(String type , double amount , String idOrNumber) {

        if (type.equalsIgnoreCase("UPI")) {
            return new UPIPayment(amount,idOrNumber);
        }
        if (type.equalsIgnoreCase("CARD")) {
            return new CardPayment(amount,idOrNumber);
        }
        if (type.equalsIgnoreCase("WALLET")) {
            return new WalletPayment(amount,idOrNumber);
        }
        return null;
    }
}
