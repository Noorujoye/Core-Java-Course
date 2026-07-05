package ComparableXComparator.Comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<User> {

    @Override
    public int compare(User u1, User u2) {
        return Long.compare(u2.id, u1.id);
    }
}
