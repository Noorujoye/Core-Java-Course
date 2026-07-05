package Bit_Manipulation;

public class get_ith {
    // Get the ith bit
    public static int get_ith(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        }
        else {
            return 1;
        }
    }
    // Set the ith bit
    public static int set_ith(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }
    public static int clear_ith (int n, int i) {
        int bitmask = ~(1<<i);
        return n&bitmask;
    }
    public static int updateIthBit (int n , int i , int newBit) {
//        if (newBit == 0) {
//            return clear_ith(n, i);
//        } else {
//            return set_ith(n, i);
//        }
//    }
        n = clear_ith(n, i);
        int bitmask = newBit << i;
        return n | bitmask;
    }

    public static int clear_last_iBits (int n , int i ) {
        int bitmask = (-1 << i);
        return n&bitmask;
    }
    public static int clear_range(int n, int i , int j) {
        int a = ((~0)<< (j+1));
        int b =( 1<<i)-1;
        int bitmask = a|b;
        return n&bitmask;
    }

    public static void main(String[] args) {
        System.out.println(get_ith(10, 3)); // Output: 1 (since 10 in binary is 1010)
        System.out.println(set_ith(10, 2)); // Output: 14 (sets 2nd bit of 10: 1010 → 1110)
        System.out.println(clear_ith(10,1));
        System.out.println(updateIthBit(10,2,1));
        System.out.println(clear_last_iBits(15 ,2 ));
        System.out.println(clear_range(10,2,4));


    }
}
