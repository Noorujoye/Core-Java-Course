import java.sql.Statement;

public class Counting {
    public static void count_sort(int arr[]) {

        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // sorting
        int j = 0;
        for ( int i = 0; i < count.length; i++) {
            while(count[i] > 0){
            arr[j] = i;
            j++;
            count[i]--;
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 4,2,9,1,5,8,9,5,1,2};
        count_sort(arr);
        printarr(arr);
    }
}
//public class Counting {
//    public static void count(int arr[]){
//
//        int larges_element = Integer.MIN_VALUE;
//        for (int i=0; i<arr.length; i++) {
//            larges_element = Math.max(larges_element,arr[i]);
//        }
//
//        int new_arr[] = new int[larges_element+1];
//        for (int i=0; i<new_arr.length; i++) {
//            new_arr[arr[i]]++;
//        }
//
//        for (int i=0; i<new_arr.length; i++) {
//            int j=0;
//            while (new_arr[i] > 0) {
//                arr[j] = i;
//                j++;
//                new_arr[i]--;
//            }
//        }
//        for (int i=0; i<arr.length; i++) {
//            System.out.print(new_arr[i]+" ");
//        }
//        System.out.println();
//
//
//        // now perfeorm sort
//    }
//    public static void main(String[] args) {
//        int arr [] = {1,5,7,1,9,7,2,1,7,8,4,6,3};
//        count(arr);
//
//    }
//}
//
