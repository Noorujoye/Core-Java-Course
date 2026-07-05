package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {
    public static void main(String[] args) {

        //Consumer -> it will consume
        //no return type that's why no compose method here
        Consumer<Integer> x = a -> System.out.println(a);
        x.accept(50);

        Consumer<Integer> y = null;
        y = b -> System.out.println(b);
        y.accept(50);

        Consumer <Integer> combined = x.andThen(y);
        combined.accept(10);

        List<Integer> list = Arrays.asList(1,2,30);
        Consumer<List<Integer>> printList = z -> {
            for (int i : z) {
                System.out.println(i);
            }
        };
        printList.accept(list);
    }
}