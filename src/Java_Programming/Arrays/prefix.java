import java.util.Scanner;
// to calculate max sum of prefizx array
public class prefix {
    public static void prefix(int arr[]) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        int max = Integer.MIN_VALUE;
        int current = 0;
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i = 0; i <arr.length; i++){
            int start = i;
            for(int  j = i; j < arr.length; j++){
                int end = j;
                current = start == 0 ? prefix[end] :prefix[end] - prefix[start-1];
                if (max < current) {
                    max = current;
                }
            }
        }
        System.out.println("max is : " + max);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        int arr[] = new int[size];
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        prefix(arr);

    }
}