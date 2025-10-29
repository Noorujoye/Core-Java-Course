package CollectionFramework.ListInterFace;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
public class StackClass {


    // stack extends vector (synchronized)
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop();
        System.out.println(stack);

        int peek = stack.peek();
        System.out.println(peek);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        int search = stack.search(4); // stack hai bhai : ulta hota hai indexing
        System.out.println(search);

//        implementing stack as linked list class
        LinkedList<Integer> linkStack = new LinkedList<>();
        linkStack.addLast(10);
        linkStack.addLast(20);
        linkStack.getLast();
        linkStack.removeLast();

//        u can also implement stack by arraylist but stack is best or linkedlist

    }
}
