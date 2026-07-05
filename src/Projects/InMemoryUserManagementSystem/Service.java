package Projects.InMemoryUserManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class Service {

    // key = username (unique) , value = User object
    private Map<String, User> users = new HashMap<>();

    public boolean register(String username, String password) {
        //prevents duplicate username
        if (users.containsKey(username)) {
            return false;
        }
        users.put(username, new User(username, password));
        return true;
    }

    //login validation
    public boolean login(String username, String password) {
        User user = users.get(username);

        if (user == null) {
            return false;
        }
        return user.getPassword().equals(password);
    }
}
