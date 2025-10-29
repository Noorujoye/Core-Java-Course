package ExceptionHandling;

class NegativeException extends Exception {
    NegativeException(String msg) {
        super(msg);
    }

    public static void checkNumber(int num) throws NegativeException {
        if (num < 0) {
            throw new NegativeException("Number is negative: " + num);
        } else {
            System.out.println("Valid number; " + num);
        }
    }

    public class CustomException {
        public static void main(String[] args) {
            try {
                checkNumber(-5);
            } catch (NegativeException e) {
                System.out.println("Caught:  " + e.getMessage());
            }

        }
    }
}
