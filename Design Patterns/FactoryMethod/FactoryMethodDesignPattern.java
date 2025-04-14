package FactoryMethod;

public class FactoryMethodDesignPattern {
    public static void main(String[] args) {
        NotificationFactory notificationFactory;

        notificationFactory = new SMSNotificationFactory();
        Notification sms = notificationFactory.createNotification();
        sms.notifyUser();

        notificationFactory = new EmailNotificationFactory();
        Notification email = notificationFactory.createNotification();
        email.notifyUser();

        notificationFactory = new PushNotificationFactory();
        Notification push = notificationFactory.createNotification();
        push.notifyUser();
    }
}
interface Notification{
    void notifyUser();
}

class SMSNotification implements Notification{
    @Override
    public void notifyUser(){
        System.out.println("Sending an SMS Notification..");
    }
}

class EmailNotification implements Notification{
    @Override
    public void notifyUser(){
        System.out.println("Sending an Email Notification..");
    }
}

class PushNotification implements Notification{
    @Override
    public void notifyUser(){
        System.out.println("Sending a Push Notification..");
    }
}

abstract class NotificationFactory{
    abstract Notification createNotification();
}

class SMSNotificationFactory extends NotificationFactory{
    @Override
    Notification createNotification() {
        return new SMSNotification();
    }
}

class EmailNotificationFactory extends NotificationFactory{
    @Override
    Notification createNotification() {
        return new EmailNotification();
    }
}

class PushNotificationFactory extends NotificationFactory{
    @Override
    Notification createNotification() {
        return new PushNotification();
    }
}