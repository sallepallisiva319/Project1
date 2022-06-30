package com.Java9Features;

public class StaticAndPrivateMethodsInInterFaceEx implements I{
    public static void main(String[] args) {
        I i=new StaticAndPrivateMethodsInInterFaceEx();
        i.sendNotification();
        I.sendNotifications();
        I1 hi = () -> 1;
        System.out.println(hi.m1());
    }
}
interface I{
    static void sendNotifications(){
        establishConnection();
        System.out.println("Notifications sent");
    }
    default void sendNotification(){
        establishConnection();
        System.out.println("Notification sent");
    }
    private static void establishConnection(){
        System.out.println("Connection Establised");
    }
}
@FunctionalInterface
interface I1{
    public int m1();
}