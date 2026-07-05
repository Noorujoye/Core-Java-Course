package DesignPatterns.Strcutural.Adatpter.OrderSystem;

public class ShipmentResponse {

    private String shipmentCode;
    private boolean success;

    public ShipmentResponse(String shipmentCode, boolean success) {
        this.shipmentCode = shipmentCode;
        this.success = success;
    }

    public String getShipmentCode() {
        return shipmentCode;
    }

    public boolean isSuccess() {
        return success;
    }

}
