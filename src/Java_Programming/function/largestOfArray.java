package function;

public class largestOfArray {
    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity
        for(int i = 0; i < numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;

    }
public static void main(String ars[]){
    int numbers[] = {1,2,4,5,6,7,8};
    System.out.println(getlargest(numbers));

}
}
