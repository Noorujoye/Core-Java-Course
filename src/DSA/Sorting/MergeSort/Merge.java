package Sorting;

public class Merge {
    public static void mergeSort (int arr[] , int si, int ei) {
        //base condition
        if ( si >= ei) return;

        int mid = si + (ei - si)/2;
        mergeSort(arr , si , mid); //left part of index
        mergeSort(arr , mid+1, ei); //right part of index
        // ab dono part sorted hokar aa gye
        merge(arr, si , mid , ei);
    }
    public static void merge (int arr[] , int si , int mid , int ei) {

        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid+1;
        int  k = 0;

        while (i <=mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];

            } else {
                temp[k++] =arr[j++];
            }
        }
        //left par
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        //right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++ ,i++) {
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
            System.out.println();
    }
}
