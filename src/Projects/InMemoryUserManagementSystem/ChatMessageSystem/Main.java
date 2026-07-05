package Projects.InMemoryUserManagementSystem.ChatMessageSystem;

public class Main {
    public static void main(String[] args) {
        ChatServer server = new ChatServer();

        int x = 100;
        while (x != 0) {
            server.registerUser(1);
            server.registerUser(2);

            server.sendMessage(101, 1, 2, "Hello!");
            server.sendMessage(102, 2, 1, "hi there!");
            x--;
        }
    }
}
