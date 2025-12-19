package recursion;

import static recursion.factorial.fact;

public class fibbonaci {
    public static int fibo(int n) {
        if ( n == 0 || n == 1) return n;
        int prev1 = 0;
        int prev2 = 1;
        System.out.println(prev1 + " " + prev2);
        return 0;
    }
    public static void main(String[] args) {
        int n = 5;
        int fibo = fibo(n);
        System.out.println(fibo);
    }
}
