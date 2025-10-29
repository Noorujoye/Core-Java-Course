package ExceptionHandling;
import java.util.*;

class Calc{

}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the divendend :");
        int divendend = sc.nextInt();

        System.out.println("Enter the divisor :");
        int divisor = sc.nextInt();

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[5];
        long divide = 0;

        String str = null;

        try
        {
            divide = divendend/divisor;
            System.out.println(arr[size]);
            System.out.println(str.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("U'r trying to access a index which is not in range....");
        } catch (ArithmeticException e) {
            System.out.println("Divisor cant be Zero....." + e);
        } catch (NullPointerException e) {
            System.out.println("String cannot be empty...");
        }catch (Exception e) {
            System.out.println("Something went wrong...");
        }
        System.out.println("The result is : " + divide);
    }
}
