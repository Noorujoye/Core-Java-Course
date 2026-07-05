package Strings;
import java.util.*;
class AreRotations {
    static public boolean areRotations(String s1, String s2) {

       /* int n = s1.length();

        for (int i = 0; i < n; i++) {
            if (s1.equals(s2)) return true;

            char last = s1.charAt(s1.length() - 1);
            s1 = last + s1.substring(0, s1.length()-1);
        }
        return false;
    }

    */


        /*
        // code here
        int [] lps = computeLPS(s2);
        int i = 0, j = 0;

        while (i < s1.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
                if (j == s2.length()) return true;
            }else if (j > 0) {
                j = lps[j -1];
            }else {
                i++;
            }
        }
        return false;
    }

    static private int[] computeLPS (String s2) {
        int [] lps = new int [s2.length()];

        int len = 0, i = 0;
        while (i < s2.length()) {
            if (s2.charAt(i) == s2.charAt(len)) {
                lps[i++] = ++len;
            }else if  (len > 0) {
                len = lps[len - 1];
            }else {
                lps[i++] = 0;
            }
        }

        return lps;
    }
         */
        StringBuilder temp = new StringBuilder(s2);
        temp.append("$").append(s1).append(s1);
        int n = temp.length(), i = 0, j = 1, m = s2.length();

        int[] lps = new int[n];
        String str = temp.toString();
        Arrays.fill(lps , 0);
        while (j < n) {
            if (str.charAt(i) == str.charAt(j)) {
                lps[j++] = ++i;
                if (m == i) return true;
            }else if (i != 0) {
                i = lps[i-1];
            }else{
                j++;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "cdeab";
        System.out.println(areRotations( s1,  s2));

    }
}