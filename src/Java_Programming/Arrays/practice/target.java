import java.util.HashSet;
import java.util.Scanner;

public class target {
    public static boolean target(int[] arr) {
        HashSet<Integer> set = new HashSet<>();  // Step 1: Create an empty set
        
        for (int i = 0; i < arr.length; i++) {  // Step 2: Go through each number
            if (set.contains(arr[i])) {         // Step 3: Check if number already in set
                return true;                     // If yes -> Duplicate found
            } else {
                set.add(arr[i]);                 // If no -> Add it to the set
            }
        }
        
        return false;  // Step 4: No duplicates found
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
        System.out.println(target(arr));
    }
}