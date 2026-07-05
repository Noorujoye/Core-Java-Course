package Projects.InMemoryUserManagementSystem.ChatMessageSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ChatServer {

    private final BlockingQueue<Message> queue = new LinkedBlockingQueue<>();
    private final Map<Integer , User> userMap = new HashMap<>();

    private final MessageProducer producer;
    private final Thread consumerThread;

    public ChatServer() {
       this.producer = new MessageProducer(queue);

       MessageConsumer consumer = new MessageConsumer(queue , userMap);
       this.consumerThread = new Thread(consumer);
       consumerThread.start();
    }

    public void registerUser(int userId) {
        userMap.put(userId , new User(userId));
    }

    public void sendMessage(int messsageId, int senderId, int recieverId, String content) {
        Message message = new Message(messsageId,senderId,recieverId,content);
        producer.produce(message);
    }
}
