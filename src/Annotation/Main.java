package Annotation;

@FunctionalInterface //this annotation say a functional interface as only one abstract method
interface I{
    //as we know that we cannot instantiate it
    //means cant create obj of it
    // so we need to create another class but we have abother option anomalies class
    void show(int x, int y);
}
interface J
{
    int show(int x, int y);
}

@Deprecated // this annotation is like use it dont use it
class A{
    public void show() {
        System.out.println("Class A method");
    }
}
class B extends A{

    @Override
    public void show() {
        System.out.println("Class B method");
    }
}
public class Main {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();

        /*
        I i = new I() {
            @Override
            public void show() {
                System.out.println("Interface I");
            }
        };*/

        // by using Lamba function "->" we can reduce code size
        // if any parameter comes put it in btw circlur ()
        // even u can just write i if single parameter is there
        // so it conclude that Lamb expression is only work
        // when there is functionalInterface (a interface with one method)
        I i = (x,y) -> System.out.println("Interface I" + x +" "+ y);
        i.show(10,20);

        // method with return type
        J j = (x,y) -> (x+y);
        int result = j.show(10,20);
        System.out.println(result);
    }
}
