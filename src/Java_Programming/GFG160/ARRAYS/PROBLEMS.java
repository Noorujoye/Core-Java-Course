package GFG160.ARRAYS;
import java.util.Arrays;

public class PROBLEMS {
    // getSecondLargest
    public static int getSecondLargest(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i=n-2; i>=0; i--) {
            if (arr[i] != arr[n-1]) {
                return arr[i];
            }
        }
        return -1;
    }

//   push all zero to end of the array
public static void pushZerosToEnd(int[] arr) {

    int n = arr.length;

    int temp[] = new int[n];

    int j = 0;

    for (int i=0; i<n; i++) {
        if (arr[i] != 0) {
            temp[j] = arr[i];
            j++;
        }
    }

    while (j < n){
        temp[j] = 0;
        j++;
    }

    for(int i=0; i<n; i++) {
        arr[i] = temp[i];
    }

}


    // Function to rnotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {

        int n = arr.length;
        d = d%n;
        int temp[] = new int[n];
        int k = 0;

        for (int i=d; i<n; i++) {
            temp[k] = arr[i];
            k++;
        }
        for (int i=0; i<d; i++) {
            temp[k] = arr[i];
            k++;
        }

        for (int i=0; i<n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,0,5,8,4,0,9,10};
        System.out.println(getSecondLargest(arr));
        pushZerosToEnd(arr);
        rotateArr( arr,  2);


    }
}
