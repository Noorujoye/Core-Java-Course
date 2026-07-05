import java.util.Scanner;

//  n(n-1)/2 formula for AP , how many pairs will created  
public class pairs {
    public static void pair(int arr[]){
        for(int i = 0; i <arr.length; i++){
            for(int j=i+1; j < arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arr : ");
        int size = sc.nextInt();
        System.out.print("Enter the elements : ");
        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
    }
    pair(arr);
    }
}
