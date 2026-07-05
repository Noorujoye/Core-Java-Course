package function;

import java.util.Scanner;

public class parameters {

//    public static void calculateSum(int num1, int num2){
//        int sum = num1 + num2;
//        System.out.println("The sum is : "+sum);
//    }

//    or
        public static int calculateSum(int num1, int num2){
//            num1 and num2 is my parameters
//            formal parameters is come at definition time
        int sum = num1 + num2;
        int pro = num1 * num2;

//        return sum;
        return pro;
    }
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b); // argument or actual parameters
        System.out.println(sum);
        int pro = calculateSum(a,b);
        System.out.println("pro is :" + calculateSum(a,b));

    }
}
