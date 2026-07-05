package DesignPatterns.Creational.FactoryMethod.NotificationSystem;

public class Email implements Notification {
    @Override
    public void createNotification() {
        System.out.println("Email successful...");
    }
}
