package Bit_Manipulation;

public class basic_operation {
    public static void main(String[] args) {
        System.out.println(5&6);//4AND
        System.out.println(5|6); //7 OR
        System.out.println(5^6);//3 X-OR
        System.out.println(~5); // -6 NOT

        /*
                  00000101 - 5
                  11111010 - NOT

                  now we want to know which number is this after taking not of 5
                  twos complement
                  00000111 and these number is -6
         */
        System.out.println("left shift " + (5<<2));
//        formua = a * 2^b -> 5*2^2 = 20

        System.out.println("right shift " + (5>>2));
//        formua = a / 2^b -> 5/2^2 = 20



    }
}
