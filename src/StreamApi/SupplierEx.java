package StreamApi;

import javax.naming.InsufficientResourcesException;
import java.util.function.*;

public class SupplierEx {
    public static void main(String[] args) {
        //Supplier

        Supplier<String> giveHelloWorld = () -> "Hello World!";
        System.out.println(giveHelloWorld.get());

        //combined example
        Predicate <Integer> predicate = x -> x%2 == 0;
        Function <Integer,Integer> function = x-> x*x;
        Consumer <Integer> consumer = x-> System.out.println(x);
        Supplier <Integer> supplier = ()-> 100;

        if (predicate.test(supplier.get())) {
            consumer.accept(function.apply(supplier.get()));
        }

        //biPredicatw , BiConsumer , BiFunction

        BiPredicate <Integer ,Integer> isSumEven = (x,y) -> (x+y) % 2 == 0;
        System.out.println(isSumEven.test(10,20));
        BiConsumer<Integer,String> biConsumer = (x,y) -> {
            System.out.println(y);
            System.out.println(x);
        };
        BiFunction<String,String,Integer> biFunction = (x,y) -> (x+y).length();
        System.out.println(biFunction.apply("a","bc"));

//        UnaryOperator=Funct , BinaryOperator=BiFun
        UnaryOperator<Integer> a = x -> 2*x;
        BinaryOperator<Integer> b = (x,y) -> x+y;

    }
}
