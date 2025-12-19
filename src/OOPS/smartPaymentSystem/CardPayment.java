package OOPS.smartPaymentSystem;

class CardPayment extends Payment implements SecurePay {
    String cardNumber;
    CardPayment(double amount , String cardNumber) {
        super(amount);
        this.cardNumber=cardNumber;
    }

    @Override
    public void authenticator() {
        System.out.println("OTP verified for card.");
    }

    @Override
    public void encryptData() {
        System.out.println("Card data encrypted.");
    }
    @Override
    void makePayment() {
        System.out.println("Processing Card Payment for: " + cardNumber);
    }
}
