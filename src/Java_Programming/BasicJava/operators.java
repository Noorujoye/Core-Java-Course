import java.util.*;
public class operators {
    public static void main(String[] args) {
//        operator tell the compiler to perform operation bte operands

//  Types of operators -
        /*
//      a.) Arithmetic :
//              1. binary : + , - , * , / , % it needs to operands

        int a = 10;
        int b = 30;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        int all = (a+b)*(-b/a)/a-b;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
        System.out.println(all);

//                2. unary operator : it needs only one operand
//                ++ increment
//                 pre ++a and post a++

//      pre will change the value first then it will get used ,. example
        int x = 10;
        int y = ++x;
        System.out.println(x);
        System.out.println(y);

//      post increment will use value first then change value
        int w = 10;
        int z = w++;
        System.out.println(w);
        System.out.println(z);

//        pre                                    post
//        value change                           value use
//        value use                              value change


//                  -- decrement
//        pre decrement --i
        int i = 10;
        int j = --i;
        System.out.println(i);
        System.out.println(j);

//        post decrement k++
        int k = 10;
        int l = k--;
        System.out.println(k);
        System.out.println(l);

         */



/*
//        b.) Relational Operator
//         == , != , > , < , >+ , <=
        int A = 10;
        int B = 5;
        System.out.println(A == B); // will return false
        System.out.println(A != B); // will return true
        System.out.println(A >= B); // true
        System.out.println(A <= B); //false
        System.out.println(A > B); //true
        System.out.println(A < B); // false

 */

//        c.) assignment operators
//         = , += , -= , /= , *=
/*
        int A = 10;
        A = A + 10;
        A += 10;

        int B = 5;
        B = B - 3;
        B -= 2;
        System.out.println(A);
        System.out.println(B);

        int c = 10;
        c /= 3;
        System.out.println(c);

        int d = 10;
        d *= 10;
        System.out.println(d);

        int m = 10;
        m %= 3;
        System.out.println(m);
        */


//        d.) Logical operators

        /*
//        && logical and
        System.out.println((3 > 2 ) && (5 > 3)); // will return true
        System.out.println((3 > 10) && (5 > 3)); //will return false

//        || logical operator
        System.out.println((3 > 10 ) || (5 > 3)); // will return true
        System.out.println((3 > 10 ) || (1 > 3)); // will return false

//       ! logical not operator
        System.out.println(!((3 > 10 ) || (5 > 3)));
        int a = 10;
        int b = 20;
        System.out.println(!(a>b));
        */


        //practice
//        int a = 10;
//        int b = ++a;

//        int a = 10;
//        int b = a--;

//        int a = 10;
//        int b = --a;

        int a = 10;
        int b = a++;

        System.out.println(b);
        System.out.println(a);



    }
}




