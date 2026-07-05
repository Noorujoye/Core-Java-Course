public class palindromic {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int s;
            for (s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int num = 2; num<=i;num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}