import java.util.Scanner;

public class typeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int number = sc.nextFloat(); this will create error
        float number = sc.nextInt();
        System.out.println(number);
// in type conversion we just stored small type of data in big data type

        int a = 10;
        long b = a;
        double d = b;
        short s = 100;
        int i = s;
        double f = 25;
        double lo = f;
//        type conversion or widening
//        destination type > source type
//        byte > short > int > float > long > double

        System.out.println(d);
        System.out.println(i);
        System.out.println(lo);
    }
}


