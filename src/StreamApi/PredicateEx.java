package StreamApi;

import java.sql.Struct;
import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {

        //Predicate  --> Functional interface
        //storing a condition in variable
        Predicate <Integer> isEven = x-> x % 2 == 0;
        System.out.println(isEven.test(4));

        Predicate<String> isWordStartsWithN = x -> x.startsWith("N");
        System.out.println(isWordStartsWithN.test("Noorain"));

        Predicate<String> isWordEndWithN = x -> x.toLowerCase().endsWith("n");
        Predicate<String> and = isWordStartsWithN.and(isWordEndWithN);
        System.out.println(and.test("Noorain"));

        Predicate<String> or = y -> y.toUpperCase().startsWith("N");
        System.out.println(or.test("Noorain"));

        Predicate<String> string = a -> a.startsWith(isWordEndWithN.or(isWordStartsWithN).toString());
        System.out.println(string.test("Noorain"));


    }
}
