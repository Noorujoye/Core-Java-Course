package DSA.LinkedList;
import java.util.LinkedList;
public class BuiltIn {

    public static void main(String[] args) {

        //Built in Linked list function or objects in java
        LinkedList nums = new LinkedList();
        nums.add(5);
        nums.add(9);

//        nums.addFirst(6); // 6 will go at start

        //nums.peek();this will give u head element of linkedlist
        System.out.println(nums.peek());
        System.out.println(nums.get(2));
        System.out.println(nums);
    }
}
