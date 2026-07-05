package ComparableXComparator.Comparator;

import java.util.Arrays;

public class User {
    long id;
    String username;
    String dept;

    public User() {
    }

    public User(long id, String username, String dept) {
        this.id = id;
        this.username = username;
        this.dept = dept;
    }

    static void main(String[] args) {

        User[] users = {
                new User(103, "Nooru", "IT"),
                new User(101, "shadab", "AI"),
                new User(104, "tashviq", "ML"),
                new User(105, "Nooru", "IT"),
                new User(106, "shadab", "AI"),
                new User(107, "tashviq", "ML"),
                new User(109, "Virat", "IT"),
                new User(102, "Dhoni", "AI"),
                new User(111, "Rohit", "ML")
        };
        System.out.println("User sorted based on User Id\n");
        Arrays.sort(users, new IdComparator());
        for (User user : users) {
            System.out.println(user.id + " : " + user.username + " : " + user.dept);
        }
        System.out.println("\nUser sorted based on Username\n");
        Arrays.sort(users, new NamesComparator());
        for (User user : users) {
            System.out.println(user.id + " : " + user.username + " : " + user.dept);
        }
    }
}
