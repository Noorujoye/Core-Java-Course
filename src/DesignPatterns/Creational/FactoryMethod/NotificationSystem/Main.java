package DesignPatterns.Creational.FactoryMethod.NotificationSystem;

public class Main {
    public static void main(String[] args) {

        Notification email = NotificationFactory.createNotification(NotificationType.EMAIL);
        email.createNotification(); // email

        Notification sms = NotificationFactory.createNotification(NotificationType.SMS);
        sms.createNotification(); // email

        Notification whatsapp = NotificationFactory.createNotification(NotificationType.WHATSAPP);
        whatsapp.createNotification(); // email
    }
}
