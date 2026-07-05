package ExceptionHandling;

public class Case1 {
    public static void case1() {
        try {
            System.out.println(10);
            System.out.println(10 / 0);
        } catch (ArithmeticException a) {
            System.out.println("cannot divide by zero...");
        } finally {
            System.out.println("finally");
        }
    }

    public static int returnCase() {
        // finally runs even if return is in try catch
        try {
            return 10;
        } finally {
            System.out.println("finally");
            return 30;
        }
    }

    public static void exceptionNotHandled() {
        try {
//            int x = 10 / 0;
        } catch (NullPointerException n) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }

    public static int tryFinally() {
        try {
            return 10;
        } finally {
            System.out.println("finally");
            return 30; // if finally has return then it will override
        }
    }

    public static int returnInCatch() {
        try {
            return 10 / 0;
        } catch (Exception e) {
            System.out.println("handled...");
            return 5;
        } finally {
            System.out.println("finally");
            return 30;
        }
    }

    public static void exceptionInFinally() {
        try {
            int x = 10 / 0;
        } finally {
//            System.out.println(new RuntimeException("new exception..."));
            throw new RuntimeException("New Exception");
        }
    }

    public static int ret() {
//        try {
//            return 1;
//        } finally {
//            System.out.println("Finally");
//        }

        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Catch");
        } finally {
            System.out.println("Finally");
        }
        return 0;
    }

    public static void main(String[] args) {
        case1();
        System.out.println("finally will override the try block return " + returnCase());
        exceptionNotHandled();
        System.out.println(tryFinally());
        System.out.println(returnInCatch());
//        exceptionInFinally();

        for (int i = 0; i < 1; i++) {
            try {
                continue;
            } finally {
                System.out.println("Finally");
            }
        }
        /*
        //crash after finally
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("Finally");
        }

         */


        /*
        try {

        } System.out.println();
        compile time
        catch (Exception e) {

        }
         */

        /*
        try {
            int x = 10/0;
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
      //  output is 3
         */

        /*
        try {
            int x = 10 / 0;
        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            System.out.println("Finally");
        }
         */
    }
}
