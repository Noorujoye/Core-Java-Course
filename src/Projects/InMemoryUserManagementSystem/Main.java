package Projects.InMemoryUserManagementSystem;

public class Main {
    public static void main(String[] args) {

        Service userService = new Service();
        System.out.println(userService.register("noorain", "1234"));
        System.out.println(userService.login("noorain", "1234"));
    }
}
