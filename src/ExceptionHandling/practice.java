// package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value");
            int x = sc.nextInt();
            System.out.println("You Entered : "+ x);

            int a = 10/x;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        int i= sc.nextInt();
        int j=0;
        try {
            j=10/i;
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Something went wrong");
        } finally {
            System.out.println("bye");
        }

        int num = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        } finally {

        }
    }
}
