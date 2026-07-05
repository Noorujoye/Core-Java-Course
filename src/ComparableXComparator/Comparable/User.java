package ComparableXComparator.Comparable;

import java.util.Arrays;

public class User implements Comparable<User> {

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

    @Override
    public int compareTo(User user) {
//        return Long.compare(this.id, user.id); // for ascending
        return Long.compare(user.id, this.id); // for descending
    }

    static void main(String[] args) {

        int arr[] = {2, 1, 4};
        Arrays.sort(arr);
        // this will print in default order
        for (int i : arr) {
            System.out.println(i);
        }

        User[] users = {
                new User(103, "Nooru", "IT"),
                new User(101, "shadab", "AI"),
                new User(104, "tashviq", "ML")
        };
        // this will give classCastException, if compareTo is not overridden
        Arrays.sort(users);

        for (User user : users) {
            System.out.println(user.id + " : " + user.username + " : " + user.dept);
        }

    }
}
