package Arrays;

import java.util.Scanner;

public class create {
      public static void main(String[] args){

          int marks[]=new int[50];
          Scanner sc = new Scanner(System.in);
//          int phy;
//          phy = sc.nextInt();

          marks[0]= sc.nextInt();
          marks[1]= sc.nextInt();
          marks[2]= sc.nextInt();
          System.out.println("phy = "+ marks[0]);
          System.out.println("chem = "+ marks[1]);
          System.out.println("math = "+ marks[2]);

          marks[0] = sc.nextInt();
          System.out.println("phy = "+marks[0]);

          System.out.println("length of array"+ marks.length);

          }
}
