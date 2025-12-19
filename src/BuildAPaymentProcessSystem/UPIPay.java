package BuildAPaymentProcessSystem;

public class UPIPay implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment of " + amount);
    }
}
