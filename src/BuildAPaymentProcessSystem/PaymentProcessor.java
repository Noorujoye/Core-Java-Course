package BuildAPaymentProcessSystem;

public class PaymentProcessor {
    private DiscountStrategy discountStrategy;
    public PaymentProcessor (DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
   public void process(String type , double amount) {

       if (amount <= 0) {
           throw new IllegalArgumentException("Amount must be greater than zero");
       }

       double finalAmount = discountStrategy.applyDiscount(amount);

       Payment payment = PaymentFactory.getPayment(type);
       payment.pay(finalAmount);
   }
}
