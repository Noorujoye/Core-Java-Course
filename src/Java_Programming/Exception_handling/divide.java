package Exception_handling;

public class divide {
    public static int divide(int a , int b) {
        try{
            return a/b;
        }catch (ArithmeticException e){
            System.out.println(e);
            return -1;
        }
    }
    public static void main(String[] args) {

        int[] num = {10,20,30,40};
        int[] den = {1,2,0,4};
        for (int i=0; i<num.length; i++) {
            System.out.println(divide(num[i], den[i]));
        }
        System.out.println("Good job ->");
    }
}
