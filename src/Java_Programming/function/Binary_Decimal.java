package function;
public class Binary_Decimal {
    public static void binTodec(int binNum){
        int pow = 0;
        int dec = 0;
        while (binNum > 0){
            int lastdigit = binNum % 10;
            dec = dec + (lastdigit * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("The dec of "+binNum +" "+dec);
    }
    public static void main(String[] args){
        int value = 101;
        binTodec(value);

    }
}