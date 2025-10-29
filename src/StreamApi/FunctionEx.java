package StreamApi;
import java.util.function.Function;

//Function -> will work for u or do something
// apply is used with variableName.apply() to print
public class FunctionEx {
    public static void main(String[] args) {
        Function <Integer , Integer> doubleIt = z -> 2 * z;
        System.out.println(doubleIt.apply(10));
        Function<Integer, Integer> tripletIt = z -> 3 * z;
        System.out.println(tripletIt.apply(10));

        //first double it will calculate then triplet will add in it
        System.out.println(doubleIt.andThen(tripletIt).apply(10));

        //first triplet will get calculated the doubleIt will add in it
        System.out.println(doubleIt.compose(tripletIt).apply(10));

        //what u will pass will return same
        Function <Integer, Integer> identity = Function.identity();
        Integer res = identity.apply(5);
//        System.out.println(identity.apply(5));
        System.out.println(res);




    }
}
