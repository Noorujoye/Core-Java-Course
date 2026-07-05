public class count {
    public static int count_num (int matrix[][] , int key){

        int count = 0;
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {

                if (matrix[i][j] == key) {
                    count += 1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 7, 8},
            {2, 8, 7}
        };
        int key = 7;
        System.out.println(count_num (matrix,key));
    }
}
