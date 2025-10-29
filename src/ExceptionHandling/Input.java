package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int n=0;

        System.out.println("Enter a number");

         // Method 1: Using System.in.read()
        try {

        int num = System.in.read(); // this will return ASCII value
        System.out.println(num-48);
        }catch (IOException e) {
            System.out.println("Error while reading from System.in: " + e.getMessage());
        }

        // Method 2: Using BufferReader
        try (BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in))) {
           // InputStreamReader in = new InputStreamReader(System.in);
            //BufferedReader bReader = new BufferedReader(in);

            System.out.println("Enter a number (BufferReader): ");
            n = Integer.parseInt(bReader.readLine()); //String input int
            System.out.println("You entered : " + n);

           // bReader.close(); // imp9 to close resources
        } catch (IOException e) {
            System.out.println("IO exception occurred:" + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("please enter a valid integer only");
        }

        // Method 3: Using Scanner (Latest + Recommended)

        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value");
            int x = sc.nextInt();
            System.out.println("You Entered : "+ x);
            sc.close();
        } catch (Exception e) {
            System.out.println("Scanner error : " );
        }
    }
}
