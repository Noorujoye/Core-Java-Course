import java.util.Scanner;

public class largestOfthreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A  = sc.nextInt();
        int B  = sc.nextInt();
        int C = sc.nextInt();
        
        if(A>B && A>C){
            System.out.println("A is larger");
            
        } else if (B>=C) {
            System.out.println("B");
        }
        else {
            System.out.println("C is larger ");

        }
    }
}
