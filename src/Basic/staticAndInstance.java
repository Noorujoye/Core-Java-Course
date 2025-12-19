package Basic;


class A {
    int a = 10;
    static int b = 10;
    void a () {
        a++;
        b++;
    }
    int setData() {
        return b;
    }
    static int getData() {
        return b; // u cant return non-static field in static method
    }
}
public class staticAndInstance {
    int value = 0;
    static int counter = 0;
    staticAndInstance() {
        value++;
        counter++;
    }
    public static void main(String[] args) {
        staticAndInstance s1 = new staticAndInstance();
        System.out.println("counter value when 1st object created " + counter);
        System.out.println( "instance variable value with object1 : " +s1.value);
        staticAndInstance s2 = new staticAndInstance();
        staticAndInstance s3 = new staticAndInstance();
        staticAndInstance s4 = new staticAndInstance();
        staticAndInstance s5 = new staticAndInstance();
        System.out.println(s1.counter);
        System.out.println(s5.counter);
        System.out.println("counter value when 2nd object created " + s2.counter);
        System.out.println( "instance variable value with object1 : " +s2.value);



        System.out.println("<------------------------------------------->");

        A a1 = new A();
        A a2 = new A();

        a1.a();
        System.out.println(a1.a + " " + a2.a);
        System.out.println(a1.b + " " + a2.b);

        a2.a();
        System.out.println(a1.a + " " + a2.a);
        System.out.println(a1.b + " " + a2.b);







    }
}
