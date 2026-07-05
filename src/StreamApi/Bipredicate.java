package StreamApi;

import java.util.function.BiPredicate;

public class Bipredicate {
    public static void main(String[] args) {
        BiPredicate<Integer , Integer> sumIsEqualsToZero = (x, y) -> (x + y == 0);
        System.out.println("is sum zero : " + sumIsEqualsToZero);
    }
}
