package String;

import java.util.HashSet;

public class StringPOC {
    public static String reverseEachWordInSentence(String s) {
        String[] strArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            for (int j = strArr[i].length() - 1; j >= 0; j--) {
                sb.append(strArr[i].charAt(j));
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    public static boolean stringContainsOnlyAlphabets(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        //a = 97 to z = 122
        s = s.toLowerCase();
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch < 97 || ch > 122) {
                return false;
            }
            i++;
        }
        return false;
    }

    // n * n
    public static Character firstNonRepeatingCharacter(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        for (int i = 0; i < s.length(); i++) { //Noorain
            int cnt = 0;
            char ch = s.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                if (ch == s.charAt(j)) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                return ch;
            }
        }
        return null;
    }

    public static String firstRepeatingCharacter(String s) {
        if (s == null || s.isEmpty()) {
            return "string is empty";
        }
        for (int i = 0; i < s.length(); i++) {
            char currCh = s.charAt(i);
            int cnt = 0;
            for (int j = 0; j < s.length(); j++) {
                if (currCh == s.charAt(j)) {
                    cnt++;
                }
            }
            if (cnt > 1) {
                return currCh + "";
            }
        }
        return "no repeating character";
    }

    // n + n = 2n or n
    public static char firstRepeatedCharUsingArray(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int[] freq = new int[256];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        for (char c : s.toCharArray()) {
            if (freq[c] > 1) {
                return c;
            }
        }
        return 0;
    }

    public static String RemoveDuplicateCharacterFromString(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        boolean[] seen = new boolean[256];

        // Traverse through all characters
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!seen[c]) {
                sb.append(c);
                seen[c] = true;
            }
        }

        return sb.toString();
    }

    public static char maximumOccuredCharacter(String s) {
        int[] freq = new int[256];
        int max = -1;
        char res = ' ';
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] > max) {
                max = freq[i];
                res = (char) i;
            }
        }
        return res;
    }

    public static String toUpperCase(String s) {
        if (!(s.equals(s.toUpperCase()))) {
            s = s.toLowerCase();
            String[] strArr = s.split("");
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < s.length()) {
                char ch = s.charAt(i);
                ch -= 32;
                sb.append(ch);
                i++;
            }
            return sb.toString();
        }
        return s;
    }

    public static String toLowerCase(String s) {
        if (!(s.equals(s.toUpperCase()))) {
            s = s.toUpperCase();
            String[] strArr = s.split("");
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < s.length()) {
                char ch = s.charAt(i);
                ch += 32;
                sb.append(ch);
                i++;
            }
            return sb.toString();
        }
        return s;
    }

    public static String removeSpecialCharacter(String s) {
        if (s == null || s.isEmpty()) {
            return "empty";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (!((ch >= 32 && ch <= 47) || (ch >= 32 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 126))) {
                sb.append(s.charAt(i));
            }
            i++;
            continue;
        }
        return sb.toString();
    }

    public static String removeAllVowels(String s) {
        if (s == null || s.isEmpty()) return "empty";
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                sb.append(ch);
            }
            continue;
        }
        return sb.toString();
    }

    public static boolean stringIsRotationOfOneAnother() {
        return true;
    }

    public static void commonCharBtwTwoString(String s1, String s2) {
        HashSet<Character> h1 = new HashSet<>();
        HashSet<Character> h2 = new HashSet<>();
        for (char c : s1.toCharArray()) h1.add(c);
        for (char c : s2.toCharArray()) h2.add(c);
        for (char c : h1) {
            if (h2.contains(c)) {
                System.out.print(c + ",");
            }
        }
        System.out.println();
    }

    public static void unCommonCharBtwTwoString(String s1, String s2) {
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for (char c : s1.toCharArray()) set1.add(c);
        for (char c : s2.toCharArray()) set2.add(c);
        for (char c : set1) {
            if (!set2.contains(c)) {
                System.out.print(c + ",");
            }
        }
        for (char c : set2) {
            if (!set1.contains(c)) {
                System.out.print(c + ",");
            }
        }
        System.out.println();
    }


    public static int cntTotalWordsInSentence(String s) {
        String[] str = s.split(" ");
        return str.length;
    }

    public static String longestWordInSentence(String s) {
        String[] str = s.split(" ");
        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if (str[i].isEmpty()) {
                continue;
            }
            if (str[i].length() > largest.length()) {
                largest = str[i];
            }
        }
        return largest;
    }

    public static String shortestWordInSentence(String s) {
        String[] str = s.split(" ");
        String small = str[0];
        for (int i = 1; i < str.length; i++) {
            if (str[i].isEmpty()) {
                continue;
            }
            if (str[i].length() < small.length()) {
                small = str[i];
            }
        }
        return small;
    }

    public static void printDuplicateCharactersInString(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }
        for (char c : s.toCharArray()) {
            if (freq[c] > 1) {
                System.out.println(c + " ");
                freq[c] = 0;
            }
        }
    }

    public static boolean validateEmail(String s) {
        if (s == null || s.isEmpty()) return false;

        // Must end with @gmail.com
        if (!s.endsWith("@gmail.com")) return false;

        if (s.length() < 11) return false;
        if (s.contains("#") || s.contains(" ")) return false;

        int firstAt = s.indexOf('@');
        int lastAt = s.lastIndexOf('@');
        if (firstAt != lastAt) return false;

        return true;
    }

    public static void indexOfAllOccurenceOfChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println("index of " + s.charAt(i) + " : " + i);
        }
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static String extractFirstNameFromSentence(String s) {
        s = s.toLowerCase();
        String[] strArr = s.split(" ");
        return strArr[0];
    }

    public static String extractLast4DigitOfAccountNum(String s) {
        String[] str = s.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = str.length - 4; i < str.length; i++) {
            sb.append(str[i]);
        }
        return sb.toString();
    }

    public static String removeFirstAndLastChar(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.substring(1, s.length() - 1).toString();
    }

    public static String frequencyCntOfEachCharacter(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.println(freq[s.charAt(i)] + " : " + s.charAt(i));
        }
        return "";
    }

    public static void main(String[] args) {

        StringPOC poc = new StringPOC();
        System.out.println("Input string is : Frontend Backend DatabBase\nReversed string : " + reverseEachWordInSentence("Frontend Backend DatabBase") + "\n\n");
        System.out.println("Input string is : NoorainWarsi18\nIsStringContainsOnlyAlphabets : " + stringContainsOnlyAlphabets("NoorainWarsi18") + "\n\n");
        System.out.println("Input string is : NOorain\nTo upperCase : " + toUpperCase("NOorain") + "\n\n");
        System.out.println("Input string is : NoorainWarsi\nTo LowerCase : " + toLowerCase("NoorainWarsi") + "\n\n");
        System.out.println("Input string is : @34###noorain\nRemoved special characters : " + removeSpecialCharacter("@34###noorain") + "\n\n");
        System.out.println("Input String is : MADAM\nRemoved first and last character : " + removeFirstAndLastChar("MADAM") + "\n\n");
        System.out.println("Input String is : 458748581122 :\nlast four digit : " + extractLast4DigitOfAccountNum("458748581122") + "\n\n");
        System.out.println("Input String is : aeiouNoorain :\nremove vowels : " + removeAllVowels("aeiouNoorain") + "\n\n");
        System.out.println("Input String is : aacbb : \nfirst non repeated character in string :  " + firstNonRepeatingCharacter("aacbb") + "\n\n");
        System.out.println("Input String is : bacaabb : \nfirst repeated character in string :  " + firstRepeatingCharacter("bacaabb") + "\n\n");
        System.out.println("Input String is : bacaabb : \nfirst repeated character in string :  " + firstRepeatedCharUsingArray("bacaabb") + "\n\n");
        System.out.println("Input String is : bacaabb : \nfrequency count of each char in string :  \n" + frequencyCntOfEachCharacter("aabbcdefghi") + "\n\n");
        System.out.println("Input String is : bacaabb : \nextract first name from string : " + extractFirstNameFromSentence("Noorain Warsi") + "\n\n");
        System.out.println("Input String is : racecar : \nisPalindrome : " + isPalindrome("racecar") + "\n\n");
        indexOfAllOccurenceOfChar("I love India");
        System.out.println("remove duplicate char from NoorainNoorain : " + RemoveDuplicateCharacterFromString("NoorainNoorain"));
        printDuplicateCharactersInString("NNNNWWWW");
        System.out.println("cnt To tolal Words In Sentence : " + cntTotalWordsInSentence("I'm the my own enery booster..."));
        unCommonCharBtwTwoString("ar", "os");
        commonCharBtwTwoString("Noor", "Noor");
        System.out.println("largest : " + longestWordInSentence("Compulsory excellent outstanding"));
        System.out.println("smallest : " + shortestWordInSentence("Compulsory excellent outstanding"));
        System.out.println(validateEmail("joyenooru@gmail.com"));
        maximumOccuredCharacter("noorain");
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isLetter('#')); // false

    }
}
