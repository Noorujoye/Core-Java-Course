package Projects.InMemoryUserManagementSystem.ChatMessageSystem;

public class User {
    private final int userId;
    private boolean online;

    public User(int userId) {
        this.userId = userId;
        this.online = true;
    }

    public int getUserId() {
        return userId;
    }
    public boolean isOnline() {
        return online;
    }
    public void isOffline() {
        online = false;
    }
    public void goOnline() {
        online = true;
    }
}
