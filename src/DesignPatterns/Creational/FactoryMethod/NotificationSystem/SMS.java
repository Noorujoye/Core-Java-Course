package DesignPatterns.Creational.FactoryMethod.NotificationSystem;

public class SMS implements Notification {
    @Override
    public void createNotification() {
        System.out.println("SMS Successfully sent");

    }
}
