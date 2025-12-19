package DSA.Set.HashSet.LinkedHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Operation {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Hyderabad");
        cities.add("Indore");
        cities.add("Banglore");
        cities.add("Pune");
        cities.add("Chennai");
        System.out.println("Order will not be maintained");
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Hyderabad");
        lhs.add("Indore");
        lhs.add("Banglore");
        lhs.add("Pune");
        lhs.add("Chennai");

        System.out.println("Order will be maintained");
        Iterator i = lhs.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
