package CollectionFramework.ListInterFace;

import DSA.Hashing.Map.LinkedhashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K , V> {

    private int capacity;
    public LRUCache(int capacity) {
        super(capacity, 0.75f , true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {

        LRUCache<String,Integer> studentMap = new LRUCache<>(3);
        studentMap.put("Bob",99);
        studentMap.put("Alice",65);
        studentMap.put("shama",100);
        studentMap.get("Bob");
        studentMap.put("rohit",100);

        System.out.println("right now the capacity is : 3 but all get printed :\n" + studentMap);

        System.out.println("LRU will work now which means \n Least recently used: " +  studentMap);
    }
}

//jaise hi lru work krega , purane mein bhi work krega
