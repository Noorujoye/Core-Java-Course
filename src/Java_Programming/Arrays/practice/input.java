import java.util.Scanner;

public class input {
    public static boolean duplicate(int arr[]) {
        for (int i = 0; i < arr.length -1; i++){
            for(int j = i +1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
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
        System.out.println(duplicate(arr));
    }
}