import java.util.Scanner;

public class Bubble {
    public static void Bubble_sort(int arr[]) {
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {37,3343,3412,503,33,99,1,343,7466};
        Bubble_sort(arr);
    }
}