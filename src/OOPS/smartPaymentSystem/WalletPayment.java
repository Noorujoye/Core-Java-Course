package OOPS.smartPaymentSystem;

class WalletPayment extends Payment implements SecurePay{
    String walletName;

    WalletPayment(double amount, String walletName) {
        super(amount);
        this.walletName=walletName;
    }

    @Override
    public void authenticator() {
        System.out.println("UPI Pin verified");
    }

    @Override
    public void encryptData() {
        System.out.println("Data is encrypted");
    }

    @Override
    void makePayment() {
        System.out.println("Processing card payment : " + walletName);
    }
}
