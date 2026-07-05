package DesignPatterns.Strcutural.Adatpter.OrderSystem;

public class FastShip {

    public ShipmentResponse createShipment(ShipmentRequest request) {
        System.out.println("FastShip shipment created for : " + request.getId());
        return new ShipmentResponse("FS-101", true);
    }
}
