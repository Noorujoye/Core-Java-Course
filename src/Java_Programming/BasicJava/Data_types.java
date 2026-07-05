import java.lang.String;

public class Data_types {
    public static void main(String[] args) {
//      There are teo types of Data types in Java
//      primitive and Non-primitive
//      primitive : byte , short , char , boolean ,  int , long , float , double
//      Non-Primitive : String , Array , Class , Object , Interface

        byte b = 10;
        System.out.println(b);
//        only a range of 256 no. cn be print not more than 246

        char ch = 'N';
        System.out.println(ch);
//       only single character can be stored

        boolean var = false;
        boolean vars = true;
        int x = 10;
        int y = 9;
        System.out.println(x > y);
        System.out.println(var);
        System.out.println(vars);
//      only one value can be store either true or false , to check condition

        int i = 10;
        System.out.println(i);
//        only numbers can be stored in int type

        double dec = 7.62;
        System.out.println(dec);
//      it can  result in decimal if value is int like 1 is 1.0

        short s = 240;
        System.out.println(s);


        System.out.println("Size of Data Types");

//        byte = 1 byte
//        short = 2 byte
//        char = 2 byte
//        boolean = 1 byte
//        int =  4 byte (Range -+ 2 billion)
//        float = 4 byte
//        long = 4 byte
//        double = 8 byte


        String greeting = "Hello";
        System.out.println(greeting.length());
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.indexOf("H"));


    }
}

