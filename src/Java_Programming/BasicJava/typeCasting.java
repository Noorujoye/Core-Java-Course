// in type casting data will lost , we forcefully change the data types
// we can also do typecasting if we want to make value smaller

public class typeCasting {
    public static void main(String args[]){
        int marks = (int) (99.9f);
        System.out.println(marks);

        double a = 23.34;
        int b = (int) a; //  Manual casting: double to int

        System.out.println(b);

        double dd = 2541.254;
        short s = (short)dd;
        System.out.println(s);

        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0




    }
}