package Basic;

import java.util.Scanner;

public class MethodChangingOriginalObjectWhenPassedToIt {
    int a = 10;
     void change( MethodChangingOriginalObjectWhenPassedToIt m) {
         m.a = a;
    }


    MethodChangingOriginalObjectWhenPassedToIt() {
         System.out.println("contructor");
    }
    {
        System.out.println("Instance Initializer ");
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int[] arr = new int[10];
         for (int i=0; i<5; i++) {
             arr[i] = sc.nextInt();
         }
         for (int i : arr) {
             System.out.print(i + " ");
         }
         System.out.println(args.length);

        MethodChangingOriginalObjectWhenPassedToIt m = new MethodChangingOriginalObjectWhenPassedToIt();
        System.out.println("before passing object reference to the method : " + m.a);
        m.change(m);
        System.out.println("after passing object reference to the method : " + m.a);

    }
}
