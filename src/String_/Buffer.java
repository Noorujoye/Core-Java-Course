package String_;

public class Buffer {

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        String a = "Noorain";
        System.out.println("before " +a);

        System.out.println();
        a = "Warsi";
        System.out.println("after adding surname:" + a);
        String b = "Warsi";
        String c = a+b;
        s.append(c);

        System.out.println(s.getClass());
        System.out.println("");
        s.append("Noorain \n");
        s.append("Warsi ");
        s.append("virat");

        System.out.println(s.capacity());
        System.out.println();

        String x = "xyz";
        String y = "x";
        System.out.println(x.indexOf(y)); // returns 0;\
//        System.out.println(Capitalize(x));

    }
}
/*
 StringBuffer Class - The StringBuffer class creates mutable strings and is thread-safe.
  It is suitable for multithreaded environments where multiple threads might access the same string object.

StringBuffer s = new StringBuffer("GeeksforGeeks");

With StringBuffer, you can append, insert, or modify the string.
 */