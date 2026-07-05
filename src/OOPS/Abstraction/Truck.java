package OOPS.Abstraction;

public class Truck {
    void start() {
        System.out.println("Truck started...");
    }

    void stop() {
        System.out.println();
    }

    void drive() {
        System.out.println();
    }

    public static void main(String[] args) {
        new Truck().start();
    }
}
