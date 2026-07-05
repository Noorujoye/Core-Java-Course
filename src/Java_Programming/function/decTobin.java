package function;

public class decTobin {
    public static void decTobin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        while (n>0){
            int rem = n % 2;
            binNum += (rem * (int) (Math.pow(10, pow)));
            pow++;
            n = n/2;
        }
        System.out.println("binary form of " + myNum + " = "+ binNum);
    }
    public static void main(String[] args){
        int value = 5;
        decTobin(value);

    }
}
