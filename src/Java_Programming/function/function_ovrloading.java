package function;

import java.util.Scanner;

public class function_ovrloading {
//    function with same name but differnet parameters
   static class Calculator {
    public static int multiply(int a, int b) {
        return a*b;
    }
    public static float multiply(float a, float b) {
        return a*b;
    }
    public static int sum(int a , int b , int c){
        return a+b+c;
    }
}
//main function
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        System.out.println(Calculator.multiply(a,b));
        while (a != 1 && b != 1){
            int product = Calculator.multiply(a,b);
            System.out.println(product);
            break;
        }
        System.out.println(Calculator.sum(a,b,c));
        sc.close();
    }
}
