package DSA.Hashing;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) throws InterruptedException {
        Hashtable<Integer, String > hashtable = new Hashtable<>();
        //hashtable is synchronized
        // no null key or value
        // legacy class , concurrentHAshMap
        // slower than HashMap
        // implements map
        // only linkedlist , in case of collision
        // all methods are synchronized
        // hastable is synchronized but not hashmap

        hashtable.put(1,"noor");
        hashtable.put(2,"shama");
        System.out.println(hashtable);
//        hashtable.put(null,"noor");

        Hashtable<Integer, String> map = new Hashtable<>();
        Thread thread1 = new Thread( ()-> {
            for (int i=0; i<1000; i++) {
                map.put(i , "Thread1");
            }
        });


        Thread thread2 = new Thread( () -> {
            for (int i=0; i< 1000; i++) {
                map.put(i , "Thread2");
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(map.size());
        System.out.println(map.size());
        System.out.println(map.size());


    }
}
