package ExceptionHandling;
import java.io.*;

public class PracticeCheck {
    public static int testMethod() {
        try {
            int x = 10/0;
            return 10;
        } catch (Exception e) {
            return 20;
        } finally {
            return 30; // this will override exception
            //System.out.println("Cleaning up");
            //it will finally as side effects  then return 10

        }

    }
    public static void main(String[] args) {
        //Multiple Exceptions (Tricky Flow)
        /*try {
            int[] arr = {1,2,3};
            System.out.println(arr[5]);
            int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array issue");
        } catch (Exception e) {
            System.out.println("General Exception");
        }
         */


        /*
        //Try without Catch

        try {
            System.out.println("Inside try");
        } finally {
            System.out.println("Inside Finally");
        }
        //The code enters the try block → prints Inside try.
        //
        //Since there is no exception,
        // it still executes the finally block → prints Inside finally.

        //finally always runs whether an exception
        // occurs or not, even if there is a return statement in try/catch.

        //Only exception: if JVM shuts down forcefully (System.exit(0)
        // or power failure), finally may not execute.


         */

        //Finally with Return
        System.out.println(testMethod());

    }
}
