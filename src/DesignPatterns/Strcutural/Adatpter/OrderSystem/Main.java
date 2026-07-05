package DesignPatterns.Strcutural.Adatpter.OrderSystem;

public class Main {
    static void main() {

        // third party , we just use no modification
        FastShip fastShip = new FastShip();

        // adapter liya or usko new party di, adapter ne interface ko use kiya and ship ko body di and fastship ka implemetnation de diya
        ShippingService service = new FastShipAdapter(fastShip);

        // isko toh sirf service se mtlb ab wo kesi bhi ho
        OrderProcessor processor = new OrderProcessor(service);
        Order order = new Order("od-101", "noor", "grilled-chicken", "Indore");
        processor.process(order);
    }
}
