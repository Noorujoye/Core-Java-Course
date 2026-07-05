//import java.util.ArrayList;
//
//class Main {
//    ArrayList<Integer> search(String pat, String txt) {
//        // code here
//        int n = txt.length();
//        int m = pat.length();
//        ArrayList<Integer> ans = new ArrayList<>();
//        for (int i = 0; i <= n - m; i++) {
//            if (txt.substring(i, i + m).equals(pat)) {
//                ans.add(i);
//            }
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        main obj = new main();
//        String txt = "ababcababc";
//        String pat = "abc";
//        ArrayList<Integer> result = obj.search(pat, txt);
//        System.out.println(result);
//    }
//
//}