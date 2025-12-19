package DSA.Set.HashSet;

import java.util.HashSet;

import static java.lang.System.out;

public class Iteration {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(4);
        set.add(5);
//        Iterator i = set.iterator();
//        while (i.hasNext()) {
//            out.println(i.next());
//        }

        //enhanced or for each loop
        for (Integer i : set) {
            out.println(i);
        }


    }
}
