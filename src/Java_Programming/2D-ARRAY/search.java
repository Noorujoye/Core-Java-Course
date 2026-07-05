// brute force approach
// sab element pe jayenge
import java.util.Scanner;

public class search {
    public static void search_key(int matrix[][], int key) {
        boolean found = false;
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix.length; j++) {
                if(matrix[i][j] == key){
                    System.out.println("key found at index : "+ i + j);
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("key not found ");
    }
}


    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
        //input
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // print
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Enter thr key ");
        int key =   sc.nextInt();
        search_key(matrix,key);
    }

}
