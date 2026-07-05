public class IIB {

    int age;
    String name;
    String state;
    String country;

    {
        System.out.println("Instance block 2");
    }
//    public IIB(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }

    public IIB(int age, String name, String state, String country) {
        this.age = age;
        this.name = name;
        this.state = state;
        this.country = country;
    }

    {
        System.out.println("initialize block...");
        this.country = "India";
        System.out.println(country);
    }


    public String toString() {
        return "{ age: " + age + ", name: " + name +
                ", state: " + state + ", country: " + country + " }";
    }

    public static void main(String[] args) {
        System.out.println(new IIB(10, "noorain", "mp", "australia"));
//        List<IIB> list = new ArrayList<>();
//        list.add(new IIB(99, "Virat"));
//        list.add(new IIB(100, "Noorain", "Telangana"));
//        list.add(new IIB(68, "Rohit", "MH"));
//        list.add(new IIB(87, "David", "TN"));

//        for (IIB b : list) {
//            System.out.println(b);
//        }
    }
}
/*
IIB (Instance Initialization Block):

1. It runs every time an object is created.
2. It executes after super() and after instance variable initialization, but before constructor body.
3. It is used to write common initialization logic shared across multiple constructors.
4. It helps avoid code duplication in constructors.
5. It should NOT depend on constructor parameters.
6. It is mainly used for initializing default values, logging, or system-level setup.

Execution Order:
Memory Allocation → super() → instance variables → IIB → constructor

Key Points:
- IIB runs for every object.
- Constructor can override values set in IIB.
- Multiple IIBs run in top-to-bottom order.
- IIB is rarely used in real projects; constructor chaining is preferred.
 */

/*

use of this
class IIB {
    int age;
    String name;
    String state;
    String country;

    public IIB() {
        this.country = "India";
    }
    public IIB(int age, String name) {
        this(); // calls default constructor
        this.age = age;
        this.name = name;
    }

    public IIB(int age, String name, String state) {
        this(age, name);
        this.state = state;
    }
}
 */

/*

Java uses the IIB as a “common object initialization phase” BEFORE entering the constructor.

Constructor is NOT the first thing executed during object creation.

The constructor body is actually one of the LAST phases.

Before constructor body:

memory allocated
default values assigned
parent constructor called
instance variables initialized
IIB executed
THEN constructor body runs.

That is why IIB executes first.
 */