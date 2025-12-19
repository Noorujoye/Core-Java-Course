package OOPS.smartPaymentSystem;

class UPIPayment extends Payment implements SecurePay{
    String upiId;
    UPIPayment(double amount , String upiId) {
        super(amount); // calling parents constructor
        this.upiId=upiId;
    }

    @Override
    public void authenticator() {
        System.out.println("UPI PIN Verified");
    }

    @Override
    public void encryptData() {
        System.out.println("UPI data encrypted");
    }

    @Override
    void makePayment() {
        System.out.println("Processing UPI Payment for: " + upiId);
    }
}
