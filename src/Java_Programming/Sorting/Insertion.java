import java.util.Scanner;

public class Insertion {
    public static void Insertion_sort(int arr[]) {
        for (int i=0; i<arr.length-1; i++){
            int key = arr[i+1];
            int j = i;
            while (j >= 0 && arr[j] > key ) {
                arr[j+1] = arr[j];
                j = j -1;
            }
            arr[j+1] = key;
        }
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }

    }


    public static void main(String[] args) {
        int arr[] = { 41, 31, 45, 87, 95, 548, 256, 2415};
        Insertion_sort(arr);
    }
}