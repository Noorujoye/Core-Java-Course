package ExceptionHandling;
import java.io.*;

public class CheckedExceptionPropagation {
    static void m1() throws IOException {
        throw new IOException("Problem in file");
    }
    static void m2() throws IOException {
        m1();
    }
    public static void main(String[] args) {
        try {
            m2();
        } catch (Exception e) {
            System.out.println("Caught: " + e);
        }
    }
}
