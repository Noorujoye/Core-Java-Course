import java.util.Scanner;

public class stock_price {
    public static int maxProfit(int[] selling_price) { 
        int maxProfit = 0;
        int buy_price = Integer.MAX_VALUE;
        for (int i = 0; i < selling_price.length; i++) { 
            if(buy_price < selling_price[i]){
            int profit = selling_price[i] - buy_price;
            maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buy_price = selling_price[i]; 
            }
    }
    return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        System.out.println("Enter the elements : ");
        int selling_price[] = new int[size];

        for(int i = 0; i < selling_price.length; i++){
            selling_price[i] = sc.nextInt();
        }
        System.out.println(maxProfit(selling_price));
    }
}