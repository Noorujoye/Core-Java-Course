package WrapperClasses;

public class IntegerClass {

    static void main() {

        //convert String obj into int primitive type
        String val = "10";
        int num = Integer.parseInt(val);
        System.out.println(num);
        // if I change type of data of string to char,
        // it will give me NumberFormatException

        //NaN exists only for Double and Floats
        //suppose I did this
        double zeroDivide = 0.0 / 0.0;
        System.out.println("0.0 / 0.0, will give undefined : " + zeroDivide);
        // if u want to check NaN then do this
        System.out.println("Is this number is NaN: " + Double.isNaN(zeroDivide));

    }
}
