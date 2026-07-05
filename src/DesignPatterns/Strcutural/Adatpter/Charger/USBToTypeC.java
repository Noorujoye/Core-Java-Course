package DesignPatterns.Strcutural.Adatpter.Charger;

public class USBToTypeC implements TypeC {

    USBCharger usbCharger;

    public USBToTypeC(USBCharger usbCharger) {
        this.usbCharger = usbCharger;
    }

    @Override
    public void typeC() {
        usbCharger.chargeWithUSB();
    }
}


