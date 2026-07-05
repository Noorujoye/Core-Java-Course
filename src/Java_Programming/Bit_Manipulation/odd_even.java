package Bit_Manipulation;
import java.util.*;

public class odd_even {
    public static void odd_even (int binary) {
        int check = binary&1;
        if(check == 0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");


    }
}
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the binary Number : ");
          int binary = sc.nextInt();
          odd_even(binary);
          }
}
