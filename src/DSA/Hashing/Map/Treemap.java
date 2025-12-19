package DSA.Hashing.Map;

import java.util.*;

public class Treemap {
    public static void main(String[] args) {

        //no null values, unordered
        Map<String,Integer> lhm = new TreeMap<>();
        lhm.put("India",100);
        lhm.put("China",100);
        lhm.put("America",100);
        lhm.put("Bhutan",100);
        System.out.println(lhm);

        LinkedHashMap<String,Integer> hm = new LinkedHashMap<>();
        hm.put("India",100);
        hm.put("Australia",100);
        hm.put("England",100);
        hm.put("Shri lanka",100);
        for (String s : lhm.keySet()) System.out.println(s);
        System.out.println(hm);

        System.out.println(lhm.equals(hm));
        System.out.println(lhm.entrySet());
        System.out.println(lhm.getOrDefault("India",100));
        System.out.println(lhm.equals(hm));

    }
}
