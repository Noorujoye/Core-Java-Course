package DSA.Hashing;

import java.util.HashMap;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<String,Integer> lhm = new TreeMap<>();
        lhm.put("India",100);
        lhm.put("China",100);
        lhm.put("America",100);
        lhm.put("Bhutan",100);

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("Australia",100);
        hm.put("England",100);
        hm.put("Shri lanka",100);
        for (String s : lhm.keySet()) System.out.println(s);
        System.out.println(hm);
    }
}
