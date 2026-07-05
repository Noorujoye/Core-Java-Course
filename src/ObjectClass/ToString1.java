package ObjectClass;

import java.util.ArrayList;
import java.util.List;

public class ToString1 {
    String name = "10";

    public ToString1() {

    }

    public ToString1(String name) {
        this.name = name;
    }

//    public String toString() {
//        return name;
//    }


//    public void printAge() {
//        System.out.println(age);
//    }

    public static void main(String[] args) {
        ToString1 t = new ToString1();
        System.out.println(t);
        System.out.println(new ToString1());
        System.out.println(t.hashCode());
        System.out.println(new ToString1().hashCode());
        System.out.println(new ToString1().getClass()); // class + className
        System.out.println(new ToString1().getClass().getName()); // just name


        List<ToString1> list = new ArrayList<>();
        list.add(new ToString1("Noor"));

        System.out.println(list);

    }
}
