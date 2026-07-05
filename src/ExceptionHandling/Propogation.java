package ExceptionHandling;

//When exception is NOT handled, it moves up the call stack
public class Propogation {
}

class Test {
    static void method3() {
        int x = 10 / 0;
        // System.out.println("method3");
    }

    static void method2() {
        method3();
        // System.out.println("method2");
    }

    static void method1() {
        method2();
        //System.out.println("method1");
    }

    public static void main(String[] args) {
        method1(); // method3 → method2 → method1 → main → JVM crash
        // “I am NOT handling → caller handle it”
    }
}