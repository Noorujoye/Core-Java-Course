package String;

import java.io.File;

public class ContentReference {

    public static void main(String[] args) {
//
//        /*
//        int a = 128;
//        int b = 128;
//        System.out.println(a == b); //true -> will check value in case of primitive type
//
//         */
//
//        /*
//        Integer a1 = new Integer(128);
//        Integer a2 = new Integer(128);
//        System.out.println(a1 == a2); // false -> inCase of object , the limit factors arise
//         */
//
//        /*
//        double d = 10;
//        Integer x = new Integer(10);
//        System.out.println(d == x);
//        // in this case , values are checked but unboxing will be done like Integer type will convert to int type like this d == x.intValue();
//         */
//
//
//        String s1 = "noor";
//        String s2 = "noor";
//        String s3 = "noorain";
//        System.out.println(s1 == s3); //will check reference not value
//
//        String s = new String("noor");
//        String s4 = new String("noor");
//
//        System.out.println(s1.equals(s2)); // this will check value not the reference , becuase String class override this object class method .equals
//        System.out.println(s == s1); // in this case false
//        System.out.println(s == s4); // false , different memory location
//
//        // hashcode
//        System.out.println(s.hashCode());
//        System.out.println(s1.hashCode());
//        System.out.println(s.equals(s1)); // even in case of literal obj and object it will check content,
//
//
//        // equals method in String always checks content 0r value;
//        // because String class has override the equals method

        String j = new String("hello");
        String k = new String("hello");

        String p = "hello";
        String q = "hello";
        String r = new String("hello");
        System.out.println(p == q); // true
        System.out.println(p == r); // false one in scp and other in main heap


        System.out.println(j == k); // false because , new keyword is there so different objects , different addresses

        System.out.println(j.equals(k)); // this will check value; -> true;


//        String s1 = new String("hello");
//        String s2 = new String("hello");
//        System.out.println(s1 == s2); // false
//        System.out.println(s1.equals(s2)); // true

        Integer a = 128;
        Integer b = 128;
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.hashCode() == b.hashCode());

        ContentReference c1 = new ContentReference();
        ContentReference c2 = new ContentReference();
        System.out.println(c1 == c2); // false  , it will check reference
        System.out.println(c1.equals(c2)); // false

        File ab = new File("");
        System.out.println(Math.random() * 10);
        long hhh;
        Boolean n = new Boolean("tRUe");
        System.out.println(n);


        int result = 0;
        String b1 = new String("noor");
        String b2 = new String("noor");
        if (b1 == b2)
            result = 1;
        if (b1.equals(b2))
            result = result + 10;
        System.out.println(result);

        System.out.println(Math.floor(1.7));
    }
}

