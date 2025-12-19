package DSA.Set.HashSet;

import java.util.HashSet;

public class Operation {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("set is : " + set);
        if (set.contains(2)) {
            System.out.println("set contains");
        }
        set.remove(2);
        System.out.println(set.contains(2));

        if (set.contains(4)) {
            System.out.println("not contains");
        }
    }
}
