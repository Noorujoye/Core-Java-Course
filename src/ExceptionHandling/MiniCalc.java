package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MiniCalc {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            boolean running = true; // loop control flag

            while (running) {
                // show menu of Calc
                System.out.println("-----Friendly Calc" +
                        "1. Addition \n" +
                        "2. Subtraction \n" +
                        "3. Multiplication \n" +
                        "4. Division \n" +
                        "5. Exit");

                try {
                    System.out.print("Enter operation :");
                    int option = Integer.parseInt(br.readLine());

                    if (option == 5) {
                        System.out.println("Exiting Calc... See you soon");
                        running = false;
                        continue; // exit loop
                    }
                    System.out.println("Enter first value : ");
                    int a = Integer.parseInt(br.readLine());
                    System.out.println("Enter Second value : ");
                    int b = Integer.parseInt(br.readLine());

                    switch (option) {
                        case 1 -> System.out.println("Addition of " + a + " and " + b + "is: " + (a + b));
                        case 2 -> System.out.println("Subtraction of " + a + " and " + b + "is: " + (a - b));
                        case 3 -> System.out.println("Multiplication of " + a + " and " + b + "is: " + (a * b));
                        case 4 -> {
                            try {
                                System.out.println("Division of " + a + " and " + b + "is: " + (a / b));
                            } catch (ArithmeticException e) {
                                System.out.println("Error: Cannot divide by zero!");
                            }
                        }
                        default -> System.out.println("Invalid option...");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter numbers only");
                }
            }
        } catch (IOException e) {
                    System.out.println("Input error " + e.getMessage());
                }
    }
}
