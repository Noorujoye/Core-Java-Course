package recursion;

public class findNthTerm {
    public static int  nthTerm(int firstD , int diff , int n) {
        int sum = 0;
        if (n == 1) return sum += 1;
        sum = firstD + (n - 1) * diff;
        nthTerm(firstD, diff, n - 1);
        return sum;
    }
    public static void main(String[] args) {
        int firstD = 1;
        int diff = 2;
        int n = 5;
        System.out.println(findNthTerm.nthTerm(firstD,diff,n));

         int  a = 'a';
        int   b = 'A';
        System.out.println(a + " "+  b);

    }
}
