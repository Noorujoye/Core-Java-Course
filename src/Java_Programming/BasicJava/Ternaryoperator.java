import java.util.Scanner;

public class Ternaryoperator {
    public static void main(String[] args) {
//        another way of writing if else
        int a = 10;
        int b = 20;
       String type =  ((a%2) == 0)? "even" : "odd";
       System.out.println(type);

       String larger = (a>b)? "a is larger" : " b is larger";
       int large = (a>b)? a: b;
       System.out.println(large);

        int big = (10 > 20)? a: b;
        System.out.println(big);

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String result = (marks > 33)? " pass" : "fail";
        System.out.println(result);

    }
}
