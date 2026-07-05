package Projects.InMemoryUserManagementSystem.ChatMessageSystem;


import java.util.concurrent.BlockingQueue;

public class MessageProducer{
    private final BlockingQueue<Message> queue;

    public MessageProducer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    public void produce(Message message) {
        try {
            queue.put(message); // thread safe , blocks if needed
            System.out.println("messaged queue: " + message.getContent());

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
