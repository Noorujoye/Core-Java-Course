package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        String s = "abc123@";
        System.out.println(s.matches("[a-z]+[0-9]+[!-@]+"));


        //way-2
        Pattern p = Pattern.compile("[a-z]+");
        Matcher m = p.matcher("hello123");

        if (m.find()) {
            System.out.println("Match found: " + m.group());
        }


        //email validation
        String email = "abc@test.com";
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        System.out.println(email.matches(regex));

        //phone no
        String ph = "9179289104";
        String check = "[0-9]{10}";
        System.out.println(ph.matches(check));

        String text = "Hello   Noorain   Warsi";
        String[] parts = text.split("\\s+");

        for (String a : parts) {
            System.out.println(a);
        }


/*
        // character classes
        "b".matches("[abc]") //→ true
        "f".matches("[a-f]") //→ true

 */

    }
}
/*
Regular Expression (Regex): It is a pattern which is used to search , match, validate, replace
from a string.

Regex = A powerful pattern language for matching text.

### Why Do We Use Regex in Java?

Java me regex mainly use hota hai:

Email validation

Phone number validation

Password validation

Searching inside text

Parsing logs

Removing unwanted characters

Splitting strings by patterns

Checking format (dates, names, usernames)


// RegEx in two ways :
way-1 String class methods : this-are the built-in methods in class string

matches()
replaceAll()
split()

way-2 Pattern & Matcher classes :

/// Character classes
| Pattern  | Meaning     |
| -------- | ----------- |
| `[abc]`  | a OR b OR c |
| `[^abc]` | NOT a,b,c   |
| `[a-z]`  | a to z      |
| `[A-Z]`  | A to Z      |
| `[0-9]`  | digits      |


//Anchors
| Pattern | Meaning         |
| ------- | --------------- |
| `^`     | start of string |
| `$`     | end of string   |

 */


