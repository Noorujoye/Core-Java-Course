public class substring {
    public static String Substring(String names , int s , int e) {
        String str = "";
        for (int i = s; i<e; i++) {
            str = str + names.charAt(i);
        }
        return str;
    }
    public static void main(String[] args) {
        String names = "NoorainWarsi";
        System.out.println(Substring(names,0,9));

    }
}
