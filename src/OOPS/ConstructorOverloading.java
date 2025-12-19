package OOPS;

public class ConstructorOverloading {
    int a;
    int b;

    {
        System.out.println("Static instance");

    }
    static {
        System.out.println("static block");
    }
    ConstructorOverloading(int a , int b) {
        this.a = a;
        this.b=b;
    }
    ConstructorOverloading(int a) {
        this(a,20);
    }

    void display() {
        System.out.println("a + b : " + (a+b));
    }
    public static void main(String[] args) {
        ConstructorOverloading c = new ConstructorOverloading(10);
        c.display();

    }
}
