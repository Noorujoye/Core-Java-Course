package WrapperClasses;

class Parent {
//    public void show(String str) {
//        System.out.println("String : " + str);
//    }

    public void show(Object obj) {
        System.out.println("Object : " + obj);
    }

    public void show(Integer i) {
        System.out.println("Integer : " + i);
    }
}

public class Child extends Parent {

    static void main() {

        Child p = new Child();
        p.show(null);
    }
}