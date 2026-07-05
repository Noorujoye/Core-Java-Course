import java.util.Scanner;

public class two_matrix {
    public static int Search_key(int matrix[][], int key, int n , int m) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at cell ("+i+","+j+")");
                    return 1;
                }
            }
        }
        System.out.println("Key not found");
        return 0;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements : ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the key :");
        int key = sc.nextInt();
// output
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println(Search_key(matrix,key,n,m));
    }
}