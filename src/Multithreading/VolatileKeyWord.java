package Multithreading;


// java ka JIT compiler loop ko tabhi cache mein lock krta
// hai jab bhot baar chala ho , if duration is small we
// see problem of visibility.
// so increase time duration so that loop chale thodi der ke liye and cache mein jaye

// method calls bhi jyada use nhi krna chaiye ,
// threads stack frame baar baar change krega ,
// which is time taken for cpu

public class VolatileKeyWord {

    volatile int new_value = 0;

    void setValue() {
        new_value += 1;
    }

    int getValue() {
        return new_value;
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileKeyWord v = new VolatileKeyWord();

        // Reader
        Runnable r1 = () -> {
            while (v.new_value == 0) {
                // this will go infinite and never get the updated value because it is reading from cache
            }
            System.out.println(v.getValue() + " : " + Thread.currentThread().getName());
        };

        // Writer
        Runnable r2 = () -> {
            try {
                Thread.sleep(2000); // 0.2 sec delay , so that reader can get into reading mode...
                v.setValue();
                System.out.println(v.getValue() + " : " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread reader = new Thread(r1);
        Thread writer = new Thread(r2);
        reader.setName("reader");
        writer.setName("writer");

        writer.start();
        reader.start();

        reader.join();
        writer.join();

        System.out.println("execution completed...");
    }
}
