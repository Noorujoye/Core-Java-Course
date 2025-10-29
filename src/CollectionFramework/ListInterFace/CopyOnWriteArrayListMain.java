package CollectionFramework.ListInterFace;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*
//thread that reads the list
class ReaderThread extends Thread{

    private List<String>list;
    public ReaderThread(List<String>list) {
        this.list=list;
    }
    public void run() {
        try {
            while (true) {
                System.out.println("Reading List: " + list);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Reader thread interrupted..");
        }
    }
}

class WriteThread extends Thread {
    private List<String>list;
    public WriteThread(List<String>list) {
        this.list = list;
    }

    public void run() {
        try {
            int count = 0;
            while (count < 5) {
                Thread.sleep(2000);
                String newItem = "item" + (count + 4);
                list.add(newItem);
                System.out.println("Added: " + newItem);
                count++;
            }
        } catch (InterruptedException e) {
            System.out.println("Writer thread interrupted..");
        }
    }
}
 */

/*
   class Reader implements Runnable {
    private List<String> list;
    public Reader(List<String> list) { this.list = list; }
    public void run() { try {
            while (true) {
                System.out.println("Reading List: " + list);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Reader thread interrupted..");
        }
    } }
        }
class Writer implements Runnable {
    private List<String> list;
    public Writer(List<String> list) { this.list = list; }
    public void run() {       try {
            int count = 0;
            while (count < 5) {
                Thread.sleep(2000);
                String newItem = "item" + (count + 4);
                list.add(newItem);
                System.out.println("Added: " + newItem);
                count++;
            }
        } catch (InterruptedException e) {
            System.out.println("Writer thread interrupted..");
        }
    } }
}
*/

public class CopyOnWriteArrayListMain {

    public static void main(String[] args) {

//        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();


        //List<String> shoppingList = new CopyOnWriteArrayList<>(); // this will give error because arraylist cant be modified at the time of iteration
        List<String> shoppingList = new CopyOnWriteArrayList<>();

        shoppingList.add("milk");
        shoppingList.add("bread");
        shoppingList.add("butter");

        System.out.println("initial shopping list : " + shoppingList);

        for (String item : shoppingList) {
            System.out.println(item);

            if (item.equals("butter")) {
                shoppingList.add("Cheese");
                System.out.println("Added butter while reading...");
            }
        }
        System.out.println("updated shoppingList : " + shoppingList);

        List<String> sharedList = new CopyOnWriteArrayList<>();

        sharedList.add("item1");
        sharedList.add("item2");
        sharedList.add("item3");


        /*
        System.out.println("Initial list: " + sharedList);
        // create reader and write threads
        ReaderThread reader = new ReaderThread(sharedList);
        WriteThread writer = new WriteThread(sharedList);
        //start the thread
        reader.start();
        writer.start();
         */

        /*
        Thread reader = new Thread(new Reader(sharedList));
        Thread writer = new Thread(new Writer(sharedList));
         */

        System.out.println("Initial list: " + sharedList);

        //Reader thread using anonymous class

        Thread reader = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        for (String item : sharedList) {
                            System.out.println("Reading item: " + item);
                            Thread.sleep(1000); // small delay to simulate work
                        }
                    }
                } catch (InterruptedException e) {
                    System.out.println("Reader interrupted");
                }
            }
        });

        Thread writer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int count = 0;
                    while (count<5) {
                        Thread.sleep(2000);
                        String newItem = "item" + (count+4);
                        sharedList.add(newItem);
                        System.out.println("Added: " + newItem);
                        count++;
                    }
                } catch (InterruptedException e) {
                    System.out.println("writer interrupted");
                    e.printStackTrace();
                }
            }
        });
        reader.start();
        writer.start();


    }
}
