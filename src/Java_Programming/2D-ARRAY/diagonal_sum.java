import java.util.Scanner;

public class diagonal_sum {
    public static int diagonal_sum(int matrix[][]) {
        int sum = 0;
    //     for (int i=0; i < matrix.length; i++) {
    //         for (int j=0; j<matrix.length; j++) {
    //             if(i==j){
    //                 sum += matrix[i][j];
    //             }
    //             else if (i+j == matrix.length-1) {
    //                 sum+= matrix[i][j];
    //             }
    //         }
    //     }
    //     return sum;
    // }

    for (int i=0; i<matrix.length; i++) {
        // primary diagonal condition
        sum += matrix[i][i];
        //secomdary diagonal
        if (i != matrix.length-1-i)
            sum +=  matrix[i][matrix.length-i-1];
        }
        return sum;
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
        System.out.println(diagonal_sum(matrix));
    }
}