import java.util.Scanner;

public class max_subarr2 {
    public static void cal_prefix(int arr[]){
        int largest = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        int pre = 0;
        // System.out.print("prefix array is : ");
        int index = -1;
        for( int i = 0; i < arr.length; i++){
        pre += arr[i];
        prefix[i] = pre;
        //System.out.print( prefix[i]+" ");
        if(largest < prefix[i]){
            largest = prefix[i];
            index = i;
        }
    }
    System.out.println("largest value of max sub array  is " + largest + " at index " + index);
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
        cal_prefix(arr);


    }
}
