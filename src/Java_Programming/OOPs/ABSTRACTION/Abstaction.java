package OOPs.ABSTRACTION;

public class Abstaction { // abstract classes are those classes whose object we can't make or create
    public static void main(String[] args) {
//        Horse h = new Horse();
//        h.walk();
//        h.eat();
//        Chiken c = new Chiken();
//        c.walk();
//        c.eat();
//        System.out.println(h.color);
//        System.out.println(c.color);
        Mustang myHorse = new Mustang();
        // animal -> horse -> Mustang

//        Animal a = new Animal(); cannot create object of abstract class
    }
}

abstract class Animal {

    Animal() {
        System.out.println("Animal constuctor called");
    }

    void eat() { // non-abstract method
        System.out.println("animal eats");
    }

    abstract void walk(); // abstract methods - no implementation

    String color;

//    Animal() {
//        color = "brown";
//    }
}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse constructor called");
    }

    void changeColor() {
        color = "darkbrown";
    }

    void walk() {
        System.out.println("walks on four legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Constructor called");
    }
}

class Chiken extends Animal {

    void changeColor() {
        color = "black";
    }

    void walk() {
        System.out.println("walks on two legs");
    }
}
