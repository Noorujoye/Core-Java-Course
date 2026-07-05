import java.util.Scanner;

public class Auxillaryarr {
    public static int trappedRainwater(int height[]){
        int n = height.length;
        // calculate left max boundary - arr (helper or auxillay array)
    int leftMax[] = new int[height.length];
    leftMax[0] = height[0];
    for(int i = 1; i <height.length; i++){
        leftMax[i] = Math.max(height[i] , leftMax[i-1]);
    }
        //  calculate right max boundary - arr(helper or auxillay array)
    int rightMax[] = new int[n];
    rightMax[n - 1] = height[n-1];
    for(int i = n-2; i >=0; i--){
        rightMax[i] = Math.max(height[i], rightMax[i+1]);
    }
    int trappedwater = 0;
            // loop
            for(int i = 0; i <n; i++){
            // water level = min( leftmax bound , right max bound)
                int waterlevel = Math.min(leftMax[i],rightMax[i]);
            // trapped water = water level - height[i]
                trappedwater+= waterlevel - height[i];
            }
            return trappedwater;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        int height[] = new int[size];
        for(int i = 0; i <height.length; i++){
            height[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println(trappedRainwater(height));
    }
}

