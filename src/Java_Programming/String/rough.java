package String;


import java.util.Scanner;

// .euals
// charAt()
public class rough {

    public static String substring(String str, int si , int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
        }
    public static String tolowercase(String small) {
        StringBuilder lower = new StringBuilder("");
        char ch = Character.toLowerCase(small.charAt(0));
        lower.append(ch);
        for (int i=1; i<small.length(); i++) {
            lower.append(Character.toLowerCase(small.charAt(i)));
        }
        return lower.toString();
        }
      public static void main(String[] args){
              String txt =  "It\'s alright, \nIt\'s alright \"but\" \n I'm happy but \\\tangry too\n\n\n I'm \fhappy";
              System.out.println(txt);
              String s1 = "Noorain";
              String s2 = "Noorain";
              String s3 = new String("Noorain");

              if (s1 ==  s2) {
                  System.out.println("true");
              }
              else {
                  System.out.println("false");

              }
              if (s1 == s3) {
                  System.out.println("Strings are true");
              }
              else{
                  System.out.println("not true");

              }


              if (s1.equals(s3)){
                  System.out.println("true");
              }
              else {
                  System.out.println("false");

              }
              String str = "ImNoorain";
              System.out.println(str.substring(0,5));

            //  System.out.println(substring(str , 0 , 5));

          Scanner sc = new Scanner(System.in);
          String small = sc.nextLine();
          System.out.println(tolowercase(small));


          String st1 = "noorain";
          String st2 =  "class";
          String st3 = "noorain";

          System.out.println(" " + st1.equals(st3));

          }
}

