package DesignPatterns.Strcutural.Adatpter.OrderSystem;

public class OrderProcessor {

    private final ShippingService shippingService;

    public OrderProcessor(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public void process(Order order) {
        TrackInfo info = shippingService.ship(order);
        System.out.println("Tracking Id : " + info);
    }
}
