import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("-------------------Calculator-------------------");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first operand :");
        int a = sc.nextInt();
        System.out.println("Enter second operand :");
        int b = sc.nextInt();
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Percentage");

        int operation = sc.nextInt();
        switch (operation) {
            case 1 :
                System.out.println(a + b);
                break;
            case 2 :
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            case 5:
                System.out.println(a % b);
                break;
            case 6:
                System.out.println((a / b) * 100);
                break;
            default:
                System.out.println("invalid value");
        }
    }
}
