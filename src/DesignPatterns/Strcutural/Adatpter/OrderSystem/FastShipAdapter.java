package DesignPatterns.Strcutural.Adatpter.OrderSystem;

public class FastShipAdapter implements ShippingService {

    private FastShip fastShip;

    public FastShipAdapter(FastShip fastShip) {
        this.fastShip = fastShip;
    }

    @Override
    public TrackInfo ship(Order order) {

        ShipmentRequest request = new ShipmentRequest(order.getId(), order.getCustomerName(), order.getDish(), order.getAddress());
        ShipmentResponse response = fastShip.createShipment(request);
        return new TrackInfo(response.getShipmentCode(), response.isSuccess() ? "Shipped" : "failed");
    }
}
