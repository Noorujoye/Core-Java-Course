import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the choise :");

        switch (n){
            case 1:
                System.out.println("do work");
            case 2:
                System.out.println("dont do");
            default:
              System.out.println("not available");
       }
    }
}
