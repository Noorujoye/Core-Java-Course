package function;

public class isEven {
    public static void IsEven(int n){
        if (n%2 == 0){
            System.out.println(n+" is even");
        }
        else {
            System.out.println(n+" is odd");
        }
    }
      public static void main(String[] args){
            IsEven(10);
          }
}
