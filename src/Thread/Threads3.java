import java.lang.Runnable;
class Task implements Runnable{
    private String taskName; // class variable

    Task(String taskName) {
        this.taskName = taskName;
    }
    @Override
    public void run() {
        if (taskName.equals("Analyse")) {
            System.out.println("Analyses stage");
        } else if (taskName.equals("upload")) {
            System.out.println("Uploading file...");
        } else if (taskName.equals("process")) {
            System.out.println("Processing data...");
        } else {
            System.out.println("Unknown task...");
        }

    }

}


class PrintNumbers implements Runnable {

    private int num;

    public PrintNumbers(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i=0; i<=num; i++) {
            System.out.println(Thread.currentThread().getName() + "->" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
public class Threads3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task("Analyse"));
        Thread t2 = new Thread(new Task("Design"));
        Thread t3 = new Thread(new Task("Coding"));

        t1.start();
        t2.start();
        t3.start();

        Thread t4 = new Thread(new PrintNumbers(20), "Thread-1");
        Thread t5 = new Thread(new PrintNumbers(3), "Thread-2");

        t4.start();
        t5.start();
    }
}