package DSA.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BasicOperation {
    public static void main(String[] args) {
        //Create
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert -O(1)

        hm.put("Noorain" , 99);
        hm.put("Shama" , 100);

        //Get -O(1)
        int marks = hm.get("Noorain");
        System.out.println(marks);

        //Null value if not contains
        System.out.println("Pratham");

        //ContainsKey - O(1) true or false
        System.out.println(hm.containsKey("Noorain")); //true
        System.out.println(hm.containsKey("Pratham")); //False

        hm.remove("Noorain");
        System.out.println(hm);

        hm.replace("Shama" , 110);
        System.out.println(hm);

        System.out.println(hm.size());
        System.out.println(hm.isEmpty());

        hm.clear();
        System.out.println(hm);

        //Iteration on HashMap
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("India" , 100);
        hm1.put("US" , 111);
        hm1.put("Brazil" , 1232);
        hm1.put("China" , 80);

        //iterate over the map
        //hm1.entrySet()
        Set<String> set = hm1.keySet();
        System.out.println(set);

        int max = Integer.MIN_VALUE;
        String key = null;
        for (String s : set) {
            int val = hm1.get(s);
            if (val > max) {
                max = val;
                key = s;
            }
            System.out.println("Key = " + key + " , value = " + max);
        }

        System.out.println("" +
                "" +
                "" +
                "");

        //efficient way
        for (Map.Entry<String, Integer> i : hm1.entrySet()) {
                System.out.println(i);
        }

        // function implementation O(1)
        //put , get , containsKey, remove , size




    }
}
