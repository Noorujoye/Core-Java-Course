package ComparableXComparator.Comparator;

import java.util.Comparator;

public class NamesComparator implements Comparator<User> {

    @Override
    public int compare(User u1, User u2) {
        return u1.username.compareToIgnoreCase(u2.username);
    }
}
