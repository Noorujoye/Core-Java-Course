import java.util.Scanner;

public class spiral {
    public static void spiral_print(int matrix[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;

        while (startrow < endrow && startcol < endcol) {
            //top
            for (int j=startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j]+" ");
            }
            //right
            for (int i = startrow + 1; i <=endrow; i++) {
                System.out.print(matrix[i][endcol]+" ");
            }
            //bottom
            for (int j = endcol-1; j >= startcol; j--) {
                System.out.print(matrix[endrow][j]+" ");
                if(startrow == endrow) {
                    break;
                }
            }
            // left
            for (int i = endrow-1; i > startrow; i--) {
                System.out.print(matrix[i][startcol]+" ");
                if (startcol == endcol) {
                    break; 
                }

            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row-size : \n");
        int row_size =sc.nextInt();
        int col_size = sc.nextInt();
        int matrix[][] = new int[row_size][col_size];
        for (int i=0; i <matrix.length; i++){
            for (int j=0; j <matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i <matrix.length; i++){
            for (int j=0; j <matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        spiral_print(matrix);
    }
}