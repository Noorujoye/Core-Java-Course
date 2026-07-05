public class smallestofarray {
    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++){ // yime complexity big of n because n time loop is runned
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
public static void main(String ars[]){
    int numbers[] = {1,2,4,5,6,7,8};
    System.out.println(getlargest(numbers));

}
}
