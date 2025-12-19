package DSA.Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int matrix[][] = new int[3][4];
        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print((matrix[i][j] = 0 )+" ");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        int arr[][][] = new int[2][3][2];
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j < arr[i].length; j++)
                for (int  m : arr[i][j]) {
                    System.out.print("Enter the value :" + i + " " + j + " " + m + " : ");
                    arr[i][j][m] = sc.nextInt();
                }
        }


        int new_arr[][] = new int[2][2]; //jagged array
        for (int i=0; i< new_arr.length; i++) {
            for (int j=0; j<new_arr[i].length; j++) {
                int random = (int)(Math.random()*10);
                new_arr[i][j] = random;
                System.out.print(random+" ");
            }
            System.out.println();
        }

        int[][][] arrr = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        System.out.println(arrr[1][0][0]);
    }
}
