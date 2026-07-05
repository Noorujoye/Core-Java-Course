package function;

import java.util.Scanner;

public class LASTDIGITSSUM {
    public static void sumofDigits(int n){
        int sum = 0;
        int lastdigit;
        while (n > 0) {
            lastdigit = n % 10;
            sum += lastdigit;
            n/=10;

        }

        System.out.println("sum id "+sum);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int digit = sc.nextInt();

        sumofDigits(digit);
    }
}
