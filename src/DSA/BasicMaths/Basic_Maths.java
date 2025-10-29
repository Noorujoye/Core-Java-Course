package DSA.BasicMaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Reverse_palindrome_Armstrong_Divisor {
    //reverse
    public int reverse(int n) {
        int rev= 0;
        while (n>0) {
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        return rev;
    }

    //palindrome
    public Boolean palindrome(int n) {
        int temp = n;
        int rev= 0;
        while (n>0) {
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        return (rev == temp) ? true : false;
    }

    //Armstrong
    public Boolean armstrong(int n) {
        int temp = n;
        int sum = 0;
        while (n>0) {
            int rem = n % 10;
            sum = sum + (rem*rem*rem);
            n = n / 10;
        }
        return (sum == temp) ? true : false;
    }

    //Divisors
    public List<Integer> divisor(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i=1; i<=Math.sqrt(n); i++) {
            if(n%i == 0) {
                list.add(i);
            }
            if (n/i != i) {
                list.add(n/i);
            }
        }
        Collections.sort(list);
        return list;
    }
}
public class Basic_Maths {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = s.nextInt();
        Reverse_palindrome_Armstrong_Divisor r = new Reverse_palindrome_Armstrong_Divisor();
        System.out.println(r.reverse(n));

        Reverse_palindrome_Armstrong_Divisor p = new Reverse_palindrome_Armstrong_Divisor();
        System.out.println(p.palindrome(n));

        Reverse_palindrome_Armstrong_Divisor a = new Reverse_palindrome_Armstrong_Divisor();
        System.out.println(a.armstrong(n));

        Reverse_palindrome_Armstrong_Divisor d = new Reverse_palindrome_Armstrong_Divisor();
        System.out.println(d.divisor(n));
    }
}
