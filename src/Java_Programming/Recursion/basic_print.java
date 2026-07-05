package Recursion;

public class basic_print {
    public static void PrintInc(int n){
        if(n==100)return;

        System.out.print(n + " ");
        PrintInc(n+1);
    }



    public static void PrintDec(int n) {
        if (n == 0) return;

        System.out.print(n + " ");
        PrintDec(n - 1);

    }

    public static int fact(int n) {
        if (n == 0) return 1;
        return n * fact(n - 1);
    }

    public static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }

    public static int fibo(int n) {
        if (n==0 || n==1) {
            return n;
        }
        int f1 = fibo(n-1);
        int f2 = fibo(n-2);

        int f = f1+f2;
    return f1;
}

    public static boolean isSorted (int arr[] , int i) {
        if (i == arr.length-1) {
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }

        return isSorted(arr, i+1);
}

    public static int lastOccurence (int arr[], int key, int i) {
    if (i == arr.length) {
        return -1;
    }
    int isfound = lastOccurence(arr, key, i + 1);

    if (isfound == -1 && arr[i] == key) {
        return i;
    }
    return isfound;
}

    public static int firstOccur (int arr[], int key, int i) {
        if (i == arr.length-1) {
            return -1;
        }
        if ( arr[i] == key) {
            return i;
        }
        return firstOccur(arr,key,i+1);
}

public static int power (int x , int n) {
        if (n == 0) {
            return 1;
        }
//        int power = power(x,n-1);
//        int xton = x * power;
//        return xton;
    return x * power(x,n-1);
}



     public static void main(String[] args) {
        System.out.println("increasing no.");
        PrintInc(10);

        System.out.println("Decreasing no.");
        PrintDec(10);

        System.out.println("Printing factorial of : ");
        System.out.println(fact(5));

        System.out.println("printing sum of n numbers");
        System.out.println(sum(10));

        System.out.println("Fibonacci series:");
        System.out.println(fibo(10));

        System.out.println("is arr sorted ?");
        int arr[]= {1,23,33,55, 44,55};
        System.out.println(isSorted(arr,0));

        System.out.println("first occurence ?");
        int arr1[]= {1,23,33,1,10,23,54,55, 44,55};
        System.out.println(firstOccur(arr1,23,0));

        System.out.println("last occurence");
        int arr2[] = {1,8,7,5,2,3,1,2,3,4,5,4,7,8};
        System.out.println(lastOccurence(arr2,1,0));

        System.out.println("power of x");
         System.out.println(power(2,10));


     }
}








































