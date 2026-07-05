public class transpose {
    public static void transpose_Row_Col(int matrix[][]) {
        int transpose[][] = new int[matrix[0].length][matrix.length];
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        // print
            for (int i=0; i<matrix[0].length; i++){
                for (int j=0; j<matrix.length; j++) {
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {2,3,4},
            {3,6,9}
        };
        transpose_Row_Col(matrix);

    }
}