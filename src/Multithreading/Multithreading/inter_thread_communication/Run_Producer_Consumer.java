package Multithreading.Multithreading.inter_thread_communication;

public class Run_Producer_Consumer {

    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        ProducerThread producer = new ProducerThread(resource);
        ConsumerThread consumer = new ConsumerThread(resource);

        producer.start();
        consumer.start();
    }
}
