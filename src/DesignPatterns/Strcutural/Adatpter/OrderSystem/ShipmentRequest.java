package DesignPatterns.Strcutural.Adatpter.OrderSystem;

public class ShipmentRequest {
    private String id;
    private String name;
    private String dish;
    private String location;

    public ShipmentRequest(String id, String name, String dish, String location) {
        this.id = id;
        this.name = name;
        this.dish = dish;
        this.location = location;
    }

    public String getId() {
        return id;
    }

}
