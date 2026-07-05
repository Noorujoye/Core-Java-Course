import java.util.Scanner;

public class binary_search {
    public static boolean binary_search_R_L ( int matrix[][], int key) {
     //   top-right to left bottom
       int Trows = matrix.length;
       int Tcols = matrix[0].length; // matrix{0} refers to no. of cols in row 1

       int start = 0;
       int end = Tcols-1;

       while (start < Trows && end < Tcols) {

        if ( matrix[start][end] == key ) {
            System.out.println("found at " + start +" "+  end);
            return true;
        }
        else if (matrix[start][end] > key) {
            end--;
        }
        else {
            start++;
        }
    }
    System.out.println("Element not found.");
        return false;

}

// left top to right bottom
public static boolean binary_search_L_R (int matrix[][] , int key) {
    int Trows = matrix.length;
       int Tcols = matrix[0].length; // matrix{0} refers to no. of cols in row 1

       int start = 0;
       int end = 0;



       while (start < Trows && end < Tcols) {

        if ( matrix[start][end] == key ) {
            System.out.println("found at " + start +" "+  end);
            return true;
        }
        else if (matrix[start][end] < key) {
             if (end + 1 < Tcols) {
                end++;
            }
            // Else move down to next row and reset col
            else {
                start++;
                end = 0;
            }
        }
        else {
            start++;
        }
    }
    System.out.println("Element not found.");
        return false;


}





    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int key = sc.nextInt();
        System.out.println(binary_search_R_L (matrix,key));
        System.out.println(binary_search_L_R (matrix,key));
    }
}
