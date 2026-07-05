package Multithreading.Multithreading;

class Count {

    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

public class RaceConditionDemo {

    public static void main(String[] args)
            throws InterruptedException {

        Count counter = new Count();

        Thread t1 = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }

        });

        Thread t2 = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }

        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.out.println(
                "Final Count : " + counter.count);
    }
}

//Because count = 0
//Thread-1 ---> Read 0
//Thread-2 ---> Read 0
//
//Thread-1 ---> +1
//Thread-2 ---> +1
//
//Both write 1
//Final Result = 1
//Expected = 2
