package function;

import java.util.Scanner;

public class binomial_coeficient {
    public static int factorial(int n){
        //base case
        if(n==0)
            return 1;
        return n * factorial(n-1);
    }
    public static int bino_coef(int n, int r){
        int factn = factorial(n);
        int factr = factorial(r);
        int nmr = factorial(n-r);
        int binocoeff = factn / (factr * nmr);
        return binocoeff;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int value = sc.nextInt();
//        int fact = factorial(value);
////      System.out.println(factorial(value));
//        System.out.println(fact);

        System.out.println(bino_coef(5,2));






    }
}



