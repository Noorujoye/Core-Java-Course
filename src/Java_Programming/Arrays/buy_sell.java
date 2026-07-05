/// / import java.util.Scanner;
//
//public class buy_sell {
//    public static int Buy_sell(int selling_p[]) {
//        int buy_price = Integer.MAX_VALUE;
//        int maxProfit = 0;
//
//        // time complexity O(n)
//        for(int i =0; i < selling_p.length; i++){
//            if( buy_price < selling_p[i]){ // profit
//                int profit = selling_p[i] - buy_price; // todays profit
//                maxProfit = Math.max(maxProfit, profit); // global profit
//            }
//            else{
//                buy_price = selling_p[i];
//            }
//        }
//        return maxProfit;
//    }
//
//    public static void main(String[] args) {
//        int selling_p[] = {7,1,5,3,6,4};
//        System.out.println(Buy_sell(selling_p));
//    }
//}