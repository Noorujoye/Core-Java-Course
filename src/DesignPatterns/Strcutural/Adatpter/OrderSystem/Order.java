package DesignPatterns.Strcutural.Adatpter.OrderSystem;

public class Order {

    private String id;
    private String customerName;
    private String dish;
    private String address;

    public Order(String id, String customerName, String dish, String address) {
        this.id = id;
        this.customerName = customerName;
        this.dish = dish;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDish() {
        return dish;
    }

    public String getAddress() {
        return address;
    }
}
