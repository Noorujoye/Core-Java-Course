//package String;
//
//public class uppercase {
//    public static String toUpperCase (String sentence){
//        StringBuilder sb = new StringBuilder("");
//        char ch = Character.toUpperCase(sentence.charAt(0));
//        sb.append(ch);
//
//        for (int i=1; i<sentence.length(); i++) {
//            if (sentence.charAt(i) == ' ') {
//                sb.append(sentence.charAt(i));
//                i++;
//                sb.append(Character.toUpperCase(sentence.charAt(i)));
//            }
//            else {
//                sb.append(sentence.charAt(i));
//            }
//        }
//        return sb.toString();
//    }
//    public static void main(String[] args) {
//        String sentence = "hi, i a  noorain";
//        System.out.println(toUpperCase(sentence));
//
//        String names = "noorain";
//        System.out.println(names.toUpperCase());
//
//    }
//}


//inbuilt function
//Character.touppercase(ch)

package String;
public class uppercase {
    public static String touppercase(String sent){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(sent.charAt(0));
        sb.append(ch);

        for (int i=1; i<sent.length(); i++) {
            if (sent.charAt(i) == ' ' && i<sent.length()-1){
                sb.append(sent.charAt(i));
                i++;
                sb.append(Character.toUpperCase(sent.charAt(i)));
            }
            else {
                sb.append(sent.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String sent = "i am noorain warsi \n hello world";
        System.out.println(touppercase(sent));
    }
}