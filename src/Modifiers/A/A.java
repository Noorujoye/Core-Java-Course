package Modifiers.A;

import java.util.ArrayList;
import java.util.List;

public class A {
    private int a = 10;
    protected int prot = 20;

    private A() {

    }

    private int getA() {
        return a;
    }


    public static void main(String[] args) {
        System.out.println(new A().a);
        System.out.println(new A().getA());
        System.out.println(new A());
        System.out.println(new A().toString());
        System.out.println(new A().a);

//        Object
//        int a;
//        long b;
//        char a;


        String s1 = "Noorain";
        String s2 = "Noorain";
        String s3 = new String("Noorain");
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false

//        System.out.println(a.equals(b));  compile time error

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true


        Integer x = 100;
        Integer y = 100;

        Integer a = 128;
        Integer b = 128;

        System.out.println(x == y);
        System.out.println(a == b);
        System.out.println(a.equals(b));

        List<Integer> list = new ArrayList<>(10);
        list.add(1);
        list.add(2);

        List<Integer> list1 = new ArrayList<>(list);


        System.out.println(list.equals(list1));


    }
}

/*
 List<Integer> list = new ArrayList<>(1 , 2, 3);
  why error
and what is th differnce btw this two
List<Integer> list = new ArrayList<>();
List<Integer> list1 = Arrays.asList(1, 2, 3);

second
 */