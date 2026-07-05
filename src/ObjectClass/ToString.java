package ObjectClass;

import java.util.ArrayList;
import java.util.List;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int add() {
        return 10 + 20;
    }

    public String toString() {
        return "student id is : " + id + " and name is : " + name;
    }
}

public class ToString {
    List<Student> list = new ArrayList<>();
    private String name = "Noorain";

    public static void main(String[] args) {
        System.out.println(new ToString());
        System.out.println(new ToString());

        /*
        if we not override toString() method of Object class
        then this will only print clasName package and className with hashCode
        like this ObjectClass.ToString@5f184fc6
         */

        /*
        System.out.println(new OverrideToString());
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Noor"));

        System.out.println(list);

         */ //this will give classname and hashcode because toString is not overriden

        List<Student> list1 = new ArrayList();
        list1.add(new Student(2, "Noorain"));
        System.out.println(list1);


    }
}

class OverrideToString {

    private String over = "overrided";

    public String toString() {
        return "overrided the toString method and now printing the actual object , \n object is : {\n key : " + over + "\n}";
    }
}

//first class is not overriding the toString() method , so output in the form of className + hashcode
// second class is overriding , hence custom output(actual object), which is readable

// why we override toString()?

//default toString() just give us className + hashcode ,
// we override this method to show actual data of Object

// when we call sout(obj); internally it does sout(obj.toString());

