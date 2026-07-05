package DoubtSession;

public class Main {
    void show() {

    }

    {
        System.out.println("normal block...");
    }

    static {
        System.out.println("static block...");
    }

    {
        System.out.println("normal block...");
    }

//    public static void main(String[] args) {
////        new Main();
//
//    }
}

class child extends Main {

    void show() {
        super.show();
        System.out.println("child class show method is called..");
    }

    public static void main(String[] args) {
        child c = new child();
        c.show();
    }
}
