package BuildAPaymentProcessSystem;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor p = new PaymentProcessor(new FestivalDiscount());
        p.process("NETBANKING",1000);
    }
}
