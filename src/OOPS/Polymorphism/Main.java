package OOPS.Polymorphism;


class A{
    public void show() {
        System.out.println("class A");
    }
}
class B extends A{
    public void show(int a) {
        System.out.println("class B "+a);
    }
}
public class Main {
    public static void main(String[] args){
        B obj = new B();
        // so,it means that reference is A class but
        // the method of class B will work because object is of b
        obj.show();
        obj.show(10);

        // so if i have so many classes with many methods i simply
        //use the refernce type to handle all classes to get differnet outputs
    }
}
