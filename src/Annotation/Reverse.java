package Annotation;

public class Reverse {
    public static void reverse(String s ) {
        StringBuilder rev= new StringBuilder();
        for (int i=s.length()-1; i>=0; i--) {
            rev.append(s.charAt(i));
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        String s = "hello";
        reverse(s);
    }
}
