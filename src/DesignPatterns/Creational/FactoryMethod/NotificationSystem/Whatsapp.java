package DesignPatterns.Creational.FactoryMethod.NotificationSystem;

public class Whatsapp implements Notification {

    @Override
    public void createNotification() {
        System.out.println("I text you on whatsapp...");

    }
}
