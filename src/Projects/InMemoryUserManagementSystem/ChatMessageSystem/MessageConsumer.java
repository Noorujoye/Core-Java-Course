package Projects.InMemoryUserManagementSystem.ChatMessageSystem;

import java.util.Map;
import java.util.concurrent.BlockingQueue;

public class MessageConsumer implements Runnable{


    private final BlockingQueue<Message> queue;
    private final Map<Integer , User> userMap;

    public MessageConsumer(BlockingQueue<Message> queue, Map<Integer, User> userMap) {
        this.queue = queue;
        this.userMap = userMap;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Message message = queue.take(); //waits if empty
                deliver(message);
            } catch (InterruptedException e) {
              break;
            }
        }
    }
    private void deliver(Message message) {
        User reciever = userMap.get(message.getRecieverId());

        if (reciever != null && reciever.isOnline()) {
            System.out.println("Delivered to the user " + reciever.getUserId()
            + ": " + message.getContent());
        } else {
            System.out.println("User offline, message stored: " + message.getContent());
        }
    }
}
