package ExceptionHandling;

import java.util.ArrayList;

public class UnCheckedException {
    int b;

    public static void arithmeticException(int b) {
        try {
            int a = 10 / b;
            System.out.println(a);
        } catch (ArithmeticException a) {
            System.out.println("Cannot divide by zero... " + a.getMessage());
        }
    }

    public static void indexOutOfBoundException(int index) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        try {
            System.out.println(arr[10]);
        } catch (IndexOutOfBoundsException i) {
            System.out.println("index is out of range... " + i.getMessage());
        }
    }

    public static void nullPointerException() {
        ArrayList<Integer> arr = null;
        try {
            System.out.println(arr);
        } catch (NullPointerException n) {
            System.out.println("arr is empty... " + n.getMessage());
        }
    }


    public static void main(String[] args) {
        arithmeticException(0);
        indexOutOfBoundException(10);
        nullPointerException();

        try {

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
