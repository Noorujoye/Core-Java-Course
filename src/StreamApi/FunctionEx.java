package StreamApi;
import java.util.function.Function;

//Function -> will work for u or do something, will actually do work for u but predicate only checks condition
// it will take something and will give something  to u

// apply is used with variableName.apply() to print
public class FunctionEx {
//    public static int doubleIt(int z) {
//        return z * 2;
//    }
    public static void main(String[] args) {

//        int x = FunctionEx.doubleIt(10);
//        System.out.println(x);


        Function <Integer , Integer> doubleIt = z -> 2 * z;
        System.out.println(doubleIt.apply(10));

        Function<Integer, Integer> tripletIt = z -> 3 * z;
        System.out.println(tripletIt.apply(10));

        //first double it will calculate then triplet will add in it
        System.out.println(doubleIt.andThen(tripletIt).apply(50));

        //first triplet will get calculated the doubleIt will add in it
        System.out.println(doubleIt.compose(tripletIt).apply(10));

        //whatever you pass u will get same
        Function <Integer, Integer> identity = Function.identity();
        Integer res = identity.apply(5);
//        System.out.println(identity.apply(5));
        System.out.println(res);

        Function<Integer, String> convert = n -> "Number: " + n;
        System.out.println(convert.apply(5));





    }
}
