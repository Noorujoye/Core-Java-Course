
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is not a Prime Number.");
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1){
            return false; // Numbers <= 1 are not prime
        }
        if (n == 2 || n == 3){
            return true; // 2 and 3 are prime numbers
        }
        if (n % 2 == 0 || n % 3 == 0){
            return false; // Eliminate multiples of 2 and 3
        }

        // Check divisibility from 5 to sqrt(n), skipping even numbers
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true; // If no divisors found, it's prime
    }
}
