package Arrays;

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
        for (int i=0; i<arr.length; i++) {
            for (int[] c : arr[i]) {
                System.out.print(c + " ");
            }
            System.out.println();
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
    }
}
