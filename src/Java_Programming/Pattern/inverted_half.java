package Pattern;

public class inverted_half {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            //loop for numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }

        }
    }



