package MethodHiding;

public class Child extends Parent {
    public static void showName() {
        System.out.println("child class...");
    }

    public static void main(String[] args) {
        Parent c = new Child();
        c.showName();
    }
}
