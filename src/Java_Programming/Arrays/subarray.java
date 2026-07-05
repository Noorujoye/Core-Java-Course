import java.util.Scanner;

public class subarray {
    public static void subarr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j <arr.length; j++){
                int end = j;
                for(int k = start ; k <=end; k++){
                    System.out.print(+arr[k] +" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of array : ");
            int size = sc.nextInt();
            System.out.println("Enter the elements of array : ");
            int arr[] = new int[size];
            for(int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }
            subarr(arr);
    }
}
