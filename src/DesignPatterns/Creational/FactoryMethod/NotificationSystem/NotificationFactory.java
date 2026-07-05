package DesignPatterns.Creational.FactoryMethod.NotificationSystem;

public final class NotificationFactory {

    public static Notification createNotification(NotificationType type) {
        switch (type) {
            case EMAIL -> new Email();
            case SMS -> new SMS();
            case WHATSAPP -> new Whatsapp();
        }
        throw new IllegalArgumentException("Invalid Notification Type");
    }
}