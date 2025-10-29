package OOPS;
/*
class A{
    public A(){
        System.out.println("A");
    }
    public A(int a){
        System.out.println("int A");
    }

}
class B extends A{
    public B(){
        System.out.println("B");
    }

    public B(int a){
        super(a);
        System.out.println("int B");
    }
}*/

class A {
    public A() {

    }

    public int add(int a , int b) {
        return a+b;
    }
}
class B extends A{
    public int add (int a , int b) {
        return a+b+20;
    }
}
public class superthis {
    public static void main(String[] args) {
       // A obj = new B(10);
        B obj1 = new B();
        int r1 = obj1.add(10,20);
        System.out.println(r1);
    }
}
