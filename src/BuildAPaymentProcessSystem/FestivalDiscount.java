package BuildAPaymentProcessSystem;

public class FestivalDiscount  implements DiscountStrategy{
    @Override
    public double applyDiscount(double amount) {
        return amount * .5; // 50% discount
    }
}
