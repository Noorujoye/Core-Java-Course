package Multithreading.Multithreading.inter_thread_communication;

class SharedResource {

    private int data;
    private boolean hasData = false;

    // Producer method
    // If not use synchronized here will throw IllegalMonitorStateException
    public synchronized void produce(int value) throws InterruptedException {

        while (hasData) {
            wait();
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify();
    }

    // Consumer method
    public synchronized void consume() throws InterruptedException {

        while (!hasData) {
            wait();
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notify();
    }
}