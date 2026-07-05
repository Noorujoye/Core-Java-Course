package Basic;

public class SingletonClass {
    static
    Main m;
//    SingletonClass(Main m) {
//        this.m=m;
//    }
    //it is a design pattern,
    //which ensure a class has only one object and provide global access to that object
    // this pattern is used for a class having single and shared instance through-out the application like
    //configuration , loggers, database connection pools

     /* How I can implement a Singleton class:
   1.) private constructor: if I, declared the constructor private then I'm preventing direct instantiation of the class
   from outside. This means no other part of whole application can create new instance using new SingletonClass();

   2.) private static Instance: A private static field  of the same class type is declared within the class,
    so this field will hold the single instance of this class

   3.) Public Static Method (Factory Method): A public static method, often named getInstance(),
    is provided to serve as the global access point to the single instance.
    This method checks if an instance already exists; if not, it creates one and returns it.
    If an instance already exists,
    it simply returns the existing instance.

     */

    //private static instance of the class
    private static SingletonClass instance;

    // preventing the outer class to create object of this class
    private SingletonClass() {
        System.out.println("Private constructor called");
    }

    //public static method to get the single instance
    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    public void sameInstance() {
        System.out.println("this is a singleton class , only one instance will get use across the application of this class");
    }

    public static void main(String[] args) {
        SingletonClass s = new SingletonClass();
        SingletonClass s1 = s;
        System.out.println(s);
        System.out.println(s1);

        int x = 2;
        int y = 5;
        System.out.println(x << 2); // *2
        System.out.println(y >> 2); // /2

        System.out.println(x >>> 2);
        System.out.println("Concatenation (x+y)= " + x + y);
        System.out.println(" " + x + y);
//         System.out.println(Main.counter);
    }
}
