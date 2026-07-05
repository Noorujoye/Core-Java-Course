package Projects.InMemoryUserManagementSystem.SmartTaskScheduler;

public class Task {
    private int id;
    String title;
    private int priority;  // urgent or normal
    private long dueTime; // till when

    public Task(int id, String title, int priority, long dueTime) {
        this.id = id;
        this.title = title;
        this.priority = priority;
        this.dueTime = dueTime;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPriority() {
        return priority;
    }

    public long getDueTime() {
        return dueTime;
    }
}
