package DSA.BasicMaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Reverse_palindrome_Armstrong_Divisor_Prime {
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


    //Prime no or not
    public Boolean prime(int n) {
        int count = 0;
        for (int i=1; i<=Math.sqrt(n); i++) {
            if (n%i == 0) {
                count++;

                if (i != n / i)
                    count++;
            }
        }
        return (count == 2) ? true : false;
    }

    public int greatestCommonFactor(int a , int b) {
        int gcf = 0;
        while (a>0 && b>0) {
            if (a>b) a = a%b;
            else b = b%a;
            gcf = (a==0)? b : a;
        }
        return gcf;
    }
}
public class Basic_Maths {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = s.nextInt();

        Reverse_palindrome_Armstrong_Divisor_Prime r = new Reverse_palindrome_Armstrong_Divisor_Prime();
        System.out.println(r.reverse(n));

        Reverse_palindrome_Armstrong_Divisor_Prime p = new Reverse_palindrome_Armstrong_Divisor_Prime();
        System.out.println(p.palindrome(n));

        Reverse_palindrome_Armstrong_Divisor_Prime a = new Reverse_palindrome_Armstrong_Divisor_Prime();
        System.out.println(a.armstrong(n));

        Reverse_palindrome_Armstrong_Divisor_Prime d = new Reverse_palindrome_Armstrong_Divisor_Prime();
        System.out.println(d.divisor(n));

        Reverse_palindrome_Armstrong_Divisor_Prime pr = new Reverse_palindrome_Armstrong_Divisor_Prime();
        System.out.println(pr.prime(n));

        Reverse_palindrome_Armstrong_Divisor_Prime gcf = new Reverse_palindrome_Armstrong_Divisor_Prime();
        System.out.print("\nEnter the value of m : ");
        int m = s.nextInt();
        System.out.println(gcf.greatestCommonFactor(n , m));
    }
}
