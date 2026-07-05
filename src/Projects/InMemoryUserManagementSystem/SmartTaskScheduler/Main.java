package Projects.InMemoryUserManagementSystem.SmartTaskScheduler;

public class Main {
    public static void main(String[] args) {
        SchedulerService service = new SchedulerService();
        service.addTask(new Task(1,"Submit assignment" , 1 , 1000));
        service.addTask(new Task(2,"watch movies" , 2 , 2000));

        Task next = service.getNextTask();
        System.out.println("next task is : " + next.getTitle());

        service.completeTask(1);
        System.out.println("next task after completion: " + service.getNextTask().title);
    }
}
