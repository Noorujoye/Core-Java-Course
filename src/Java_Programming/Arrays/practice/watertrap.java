import java.util.Scanner;

public class watertrap {
    public static int watertrap(int arr[]) {
        int n = arr.length;
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for(int i = 1; i < arr.length -1 ; i++){
            leftMax[i] = Math.max(leftMax[i], arr[i]);
        }
        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i = n - 2; i > 0; i--){
            rightMax[i] = Math.max(rightMax[i], arr[i]);
        }

        int trappedRainwater = 0;
        for (int i = 0; i < arr.length; i++){
        int waterlevel =  Math.min(leftMax[i], rightMax[i]);
        trappedRainwater += waterlevel - arr[i];
        }
        return trappedRainwater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        System.out.println("Enter the elements : ");
        int arr[] = new int[size];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(watertrap(arr));
    }
}