package recursion;

public class Occurence {
    public static int pow(int base , int pow) {
        if (pow == 0) return 1;
        return base * pow(base , pow-1);
    }
    public static int optimizedPower(int base , int pow) {
        if (pow == 0) return 1;
//        int halfPowerSq = optimizedPower(base , pow/2) * optimizedPower(base , pow/2);
        // it will take linear time means O(n)
        // we will declare a variable and store the square of one function only
        int halfpower = optimizedPower(base , pow/2);
        int halfPowerSq = halfpower * halfpower;

        //n is odd
        if (pow % 2 != 0) {
            halfPowerSq = base * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static Boolean isSorted(int arr[] , int i) {
        if (i == arr.length-1) return true;
        if (arr[i] > arr[i+1]) {
            return false;
        }

        return isSorted(arr , i+1);
    }
    public static int firstOccurence(int arr[] , int key , int i) {
        if (i == arr.length) return -1;
        if (arr[i] == key) return i;
        return firstOccurence(arr , key , i+1);

    }
    public static int lastOccurence(int arr[] , int key , int i) {
        if (i == -1) return -1;
        if (arr[i] == key) return i;
        return lastOccurence(arr , key , i-1);
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,6,7,8,5,89,10};
        int ansFirst = Occurence.firstOccurence(arr , 5, 0);
        System.out.println(ansFirst);
        int ansLast = Occurence.lastOccurence(arr , 0 , arr.length-1);
        System.out.println(ansLast);
        Boolean sort = Occurence.isSorted(arr , 0);
        System.out.println(sort);
        int power = Occurence.optimizedPower(2,10);
        System.out.println(power);


    }
}
