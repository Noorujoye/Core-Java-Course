package Projects.InMemoryUserManagementSystem.SmartTaskScheduler;

import Projects.InMemoryUserManagementSystem.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//this class will manage the tasks
public class SchedulerService {
    private Map<Integer, Task> taskMap = new HashMap<>();
    private PriorityQueue<Task> priorityQueue = new PriorityQueue<>(
            (a,b) -> {
                if (a.getPriority() != b.getPriority()) {
                    return a.getPriority() - b.getPriority();
                }
                return Long.compare(a.getDueTime() , b.getDueTime());

            }
    );

    //add new task
    public void addTask(Task task) {
        if (taskMap.containsKey(task.getId())) {
            throw new IllegalArgumentException("Task ID already exist");
        }
        taskMap.put(task.getId() , task);
        priorityQueue.offer(task);
    }

    //get next task to execute
    public Task getNextTask() {
        return priorityQueue.peek();
    }

    //complete task
    public void completeTask(int id) {
        Task task = taskMap.remove(id);
        if (task != null) {
            priorityQueue.remove(task);
        }
    }


}
