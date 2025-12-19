package DSA.Hashing.Map;

import java.util.LinkedHashMap;
import java.util.HashMap;

public class LinkedhashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("China",100);
        lhm.put("Bhutan",100);
        lhm.put("America",100);


        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("Australia",100);
        hm.put("England",100);
        hm.put("Shri lanka",100);
        for (String s : lhm.keySet()) System.out.println(s);
        System.out.println(hm);
    }
}
