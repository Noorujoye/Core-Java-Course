package OOPs.Inheritance;

public class Inherit {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}
class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathes");
    }
}

// derived class / sub class
class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("swims in water");
    }
}
