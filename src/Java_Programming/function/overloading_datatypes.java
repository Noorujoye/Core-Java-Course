package function;

import java.util.Scanner;

public class overloading_datatypes {
//    func to calculate integer sum
    public static int sum(int a , int b){
        return a+b;
    }
//    funct to calculate float sum
    public static float sum(float a , float b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float ab = sc.nextFloat();
        float ac = sc.nextFloat();
        System.out.println("the sum of int is "+sum(a,b));
        System.out.println("the sum of int is "+sum(a,b));

        System.out.println("the su of float is "+sum(ab,ac));


    }
}
