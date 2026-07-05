package String;

public class Palindrome {
    public static boolean palindrome (String str){
        int start = 0;
        int end = str.length();

        while (start < end/2) {
            if (str.charAt(start) != str.charAt(end-start-1)){
                return false;
            }
        }
        return true;
    }
      public static void main(String[] args){
        String str = "racecar";
        System.out.println(palindrome(str));
      }
}
