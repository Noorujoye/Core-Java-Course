package Annotation;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.binarySearch;
import static java.util.Collections.fill;

public class Reverse {
    private static List<Integer> Integer;

    public static void reverse(String s ) {
        StringBuilder rev= new StringBuilder();
        for (int i=s.length()-1; i>=0; i--) {
            rev.append(s.charAt(i));
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        String s = "hello";
        reverse(s);

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        int i = binarySearch(list,10);
        System.out.println(i);
        fill( list , 10);
        System.out.println(list);



    }
}
