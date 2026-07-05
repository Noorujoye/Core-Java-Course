package Bit_Manipulation;

public class fast_exponentation {
    public static int fast_expo (int a , int n) {
        int ans = 1;

        while (n > 0) {
            if ((n & 1) != 0) { // checl lsb
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
      public static void main(String[] args){
              System.out.println(fast_expo(3,5));
    }
}
