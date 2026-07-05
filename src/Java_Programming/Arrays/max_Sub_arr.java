import java.util.Scanner;

public class max_Sub_arr {
    public static void sum(int arr[]) {
        int current = 0;
        int max_sum = Integer.MIN_VALUE;
       
        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j <arr.length; j++){
                int end  = j;
                current = 0;
               // int largest = Integer.MAX_VALUE;
                for(int  k = start; k <=end; k++){
                    current += arr[k];
                }
                System.out.println(current);

                if(max_sum < current){
                    max_sum = current;
                }
            }
        }
        System.out.println("max sum is = " + max_sum);

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        int arr[] = new int[size];
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sum(arr);
    }
}
