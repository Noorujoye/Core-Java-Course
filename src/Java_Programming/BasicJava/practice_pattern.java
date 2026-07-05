import java.util.Scanner;

public class practice_pattern {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();


        int rows = 5, cols = 6;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                // Print '*' for first and last row, and first and last column
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print space for hollow part
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
