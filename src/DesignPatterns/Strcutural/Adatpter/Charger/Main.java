package DesignPatterns.Strcutural.Adatpter.Charger;

public class Main {
    static void main() {
        Laptop laptop = new Laptop(
                new USBToTypeC(
                        new USBCharger()));
        laptop.chargeLaptop();
    }

}
