package BuildAPaymentProcessSystem;

public class PaymentFactory {
    public static Payment getPayment(String type) {

        if (type.equalsIgnoreCase("upi")) {
            return new UPIPay();
        } else if (type.equalsIgnoreCase("cardPay")) {
            return new CardPay();
        } else if (type.equalsIgnoreCase("walletpay")) {
            return new WalletPay();
        } else if (type.equalsIgnoreCase("netbanking")) {
            return new NetBanking();
        }
        throw new IllegalArgumentException("Invalid Payment type!");

    }
}
