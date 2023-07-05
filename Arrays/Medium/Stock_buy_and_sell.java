package Arrays.Medium;

import java.util.ArrayList;

public class Stock_buy_and_sell {
    public static void main(String[] args) {
        int[] prices = {4,5,1,2,5,6,7,3};
        System.out.println(stocks(prices));
    }

    private static int stocks(int[] prices) {
        int min = Integer.MAX_VALUE , maxprofit = 0;
        for (int i=0;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            maxprofit = Math.max(maxprofit , prices[i]-min);
        }
        return maxprofit;
    }
}
