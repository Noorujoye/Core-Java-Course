import java.util.Scanner;

public class printNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int i = 1;
        while(i  < n){
            System.out.println(i);
            i++;
        }

        int x = 1;
        int a = sc.nextInt();
        int sum = 0;
        while ( x < a){
            sum = sum + x;
            x++;
        }
        System.out.println(sum);

    }
}
