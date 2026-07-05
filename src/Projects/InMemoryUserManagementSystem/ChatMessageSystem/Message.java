package Projects.InMemoryUserManagementSystem.ChatMessageSystem;

public class Message {
    private final int messageId;
    private final int senderId;
    private final int recieverId;
    private final String content;
    private final long timeStamp;

    public Message(int messageId, int senderId, int recieverId, String content) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.recieverId = recieverId;
        this.content = content;
        this.timeStamp = System.currentTimeMillis();
    }

    public String getContent() {
        return content;
    }

    public int getMessageId() {
        return messageId;
    }

    public int getSenderId() {
        return senderId;
    }

    public int getRecieverId() {
        return recieverId;
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}
