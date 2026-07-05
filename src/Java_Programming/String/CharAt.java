package String;

import java.util.Scanner;

public class CharAt {
    public static void printletters(String str) {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<str.length(); i++) {
            char A = str.charAt(i);
            System.out.print(A + " ");
        }
        System.out.println();
        int index= sc.nextInt();

        System.out.println("character at Index " +  str.charAt(index));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String("I m noorain Warsi");

        printletters(str);

    }
}
