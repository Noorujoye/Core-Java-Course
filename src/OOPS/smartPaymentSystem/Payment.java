package OOPS.smartPaymentSystem;

abstract class Payment implements SecurePay{

    String transactionId;
    double amount;

    Payment(double amount) {
        this.amount=amount;
        this.transactionId = "transaction" + System.currentTimeMillis();
    }
    void showTransaction() { //concrete method
        //System.out.println("App: " + APP_NAME);
        System.out.println("TransactionID: " + transactionId);
        System.out.println("Amount: " + amount);
    }
    abstract void makePayment();
}

// u can't create object of abstract class but constructor can be invoked by subclass