import java.util.Scanner;

public class BinarySearch {
    public static int search_bi(int arr[] , int key){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start +( end-start) / 2;
            // comparison
            if(arr[mid] == key){
                return mid;
            }
            if (arr[mid] < key) {// right
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int size = sc.nextInt();
        System.out.println("enter the key");
        int key = sc.nextInt();
        System.out.println("enter the elements  :");
        int arr[] =  new int [size];

        for(int i = 0; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        for(int i = 0; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
        System.out.println("value found at index "+ search_bi(arr , key));
    }
}
