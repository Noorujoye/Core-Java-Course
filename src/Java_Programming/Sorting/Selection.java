import java.util.Scanner;

public class Selection {
    public static void Selection_sort(int arr[]) {
        for(int i = 0; i < arr.length-1; i++){
            int min = i;
            for(int j  = i+1; j < arr.length-1; j++){
                if(arr[j] < arr[min]){
                    int temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 41, 31, 45, 87, 95, 548, 256, 2415};
        Selection_sort(arr);
    }
}