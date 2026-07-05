package DesignPatterns.Strcutural.Adatpter.Charger;

public class Laptop {

    private TypeC charger;

    public Laptop(TypeC charger) {
        this.charger = charger;
    }

    public void chargeLaptop() {
        charger.typeC();
    }
}



