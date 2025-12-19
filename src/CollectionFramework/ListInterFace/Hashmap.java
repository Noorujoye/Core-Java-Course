package CollectionFramework.ListInterFace;

// Importing required classes
import java.util.*;
import java.util.stream.Collectors;

public class Hashmap {
    public static void main(String[] args) {

        // there are four main components of HashMap
        // Key , Value , Bucket , HashFunction
        // Creating a HashMap where keys are Integers and values are Strings
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put(1, "Noorain");   // key=1, value="Noorain"
        map.put(2, "Shama");     // key=2, value="Shama"
        map.put(3, "Firoj");     // key=3, value="Firoj"
        map.put(4, "Mahin");     // key=4, value="Mahin"

        // Printing the entire HashMap (unordered collection of entries)
        System.out.println(map);

        // Accessing the value associated with key '4'
        System.out.println(map.get(4));

        // Checking if key '3' exists in the HashMap
        System.out.println(map.containsKey(3));

        // Checking if value "Noorain" exists in the HashMap
        System.out.println("Is map contains value Noorain : " + map.containsValue("Noorain"));

        // Checking if the map is empty or not
        System.out.println("Is map is empty ? " + map.isEmpty());

        // Removing the entry with key '1', returns the removed value
        System.out.println(map.remove(1));

        // Trying to remove key '1' with value 'Mahin', returns false if key-value pair doesn't match
        System.out.println(map.remove(1, "Mahin"));

        // Iterating over keys using keySet and printing each value
        for (int i : map.keySet()) {
            System.out.println(map.get(i));
        }

        // Getting all key-value pairs as a set of entries
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        // Iterating over each entry and printing key and value in uppercase
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue().toUpperCase());
        }

        // Modifying each value to uppercase directly in the map
        for (Map.Entry<Integer, String> entry : entries) {
            entry.setValue(entry.getValue().toUpperCase());
        }

        // Printing the final state of the map after modification
        System.out.println(map);

        //HashMap - unordered
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(2,"Two");
        hashMap.put(1,"one");
        hashMap.put(3,"Three");
        System.out.println("HashMap: " + hashMap);

        //TreeMap - sorted by key
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(2,"Two");
        treeMap.put(1,"one");
        treeMap.put(3,"Three");
        System.out.println("TreeSet (Sorted): " + treeMap);

        //LinkedHashMap - insertion Order
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap .put(2,"Two");
        linkedHashMap .put(1,"one");
        linkedHashMap .put(3,"Three");
        System.out.println("LinkedHashMap (Insertion Order): " + linkedHashMap);

        //ConcurrentHashMap - thread safe
        Map<Integer,String> concurrentMap = new java.util.concurrent.ConcurrentHashMap<>();
        concurrentMap.put(2,"Two");
        concurrentMap.put(1,"one");
        concurrentMap.put(3,"Three");
        System.out.println("concurrentMap : " + concurrentMap);

        // class Generics
        //Map with Integer keys and string value
        HashMap<Integer,String> mapp = new HashMap<>();
        mapp.put(1,"Apple");
        mapp.put(2,"Banana");

        // The compiler ensures only Integer keys and String values are allowed
        //map.put("WrongKey", 123); // This will cause a compile-time error
        System.out.println(mapp);

        //Sorting Maps

        /*Map are not inherently sorted (except TreeMap).
        Use Comparator or Stream to sort by key or value.*/

        //sorted by keys
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey()+" -> " + entry.getValue()));

        //Sorted by values
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
                 //Sorting helps when generating reports, ranking, or displaying structured information.

        //Stream with Maps
        //Streams allow filtering, mapping, and collecting results from maps easily.

        Map<Integer,String> result = map.entrySet().stream()
                .filter(entry -> entry.getValue().startsWith("A"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(result);

        // Frequency Counter

        String text = "apple banana apple orange banana apple";
        String[] words = text.split(" ");

        HashMap<String,Integer> freqMap = new HashMap<>();

        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word,0) + 1);
        }
        System.out.println("Word Frequencies : " + freqMap);
    }
}
