public class sum {
    public static void sum_2nd_row (int matrix[][]){
        // Scanner sc = new Scanner(System.in);
        int row = 1;

        int sum = 0;
            for (int j=0; j<matrix[row].length; j++) {
                sum += matrix[row][j];
            }
        System.out.println("answer is " + sum);
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 7, 8},
            {2, 8, 7},
            {7, 3, 9}
        };
        sum_2nd_row(matrix);
    }
}
